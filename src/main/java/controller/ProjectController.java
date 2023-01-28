package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import util.ConnectionFactory;

public class ProjectController {

    public void save(Project project) {

        String sql = "INSERT INTO project (name, description, createdAt, updatedAt) VALUES (?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));

            statement.execute();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao gravar o registro.", e);

        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }

    public void update(Project project) {

        String sql = "UPDATE project SET name=?, description=?, createdAt=?, updatedAt=? WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());

            statement.execute();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar o registro.", e);

        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }

    }

    public void removeById(int idProject) {

        String sql = "DELETE FROM project WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setInt(1, idProject);

            statement.execute();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao gravar registro.", e);

        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }

    public List<Project> getAll() {
        String sql = "SELECT * FROM project";

        Connection connection = null;
        PreparedStatement statement = null;
        
        ResultSet resultSet = null;
        
        List<Project> projects = new ArrayList<>();
        
        

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            resultSet = statement.executeQuery(sql);
            
            
            
            while(resultSet.next()) {
               
               Project project = new Project();
               
               project.setId(resultSet.getInt("id"));
               project.setName(resultSet.getString("name"));
               project.setDescription(resultSet.getString("description"));
               project.setCreatedAt(resultSet.getDate("createdAt"));
               project.setUpdatedAt(resultSet.getDate("updatedAt"));
               
               projects.add(project);
            }
            

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar registros", e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }

        return projects;
    }
}

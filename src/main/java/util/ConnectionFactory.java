package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    //public static final String DRIVER = "com.mariadb.jdbc.DRIVER";
    public static final String URL = "jdbc:mariadb://localhost:3306/todoApp";
    public static final String USER = "todo";
    public static final String PASS = "todo";
    
    
public static Connection getConnection(){
    try{
        //Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASS);
        
    } catch(SQLException ex) {      
        throw new RuntimeException("Erro na conexao com o banco de dados", ex);
    }
}

public static void closeConnection(Connection connection){
    try{
        if(connection != null) {
           connection.close();  
        }
       
    } catch (SQLException ex) {
        throw new RuntimeException("Erro ao encerrar conecção com o banco de dados.", ex);
    }    
}

public static void closeConnection(Connection connection, PreparedStatement statement){
    try{
        if(connection != null) {
            connection.close();
        }
        
        if(statement != null) {
            statement.close();
        }
        
    } catch (SQLException ex) {
        throw new RuntimeException("Erro ao encerrar conecção com o banco de dados.", ex);
    }   
}

public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet){
    try{
        if(connection != null) {
            connection.close();
        }
        
        if(statement != null) {
            statement.close();
        }
        
        if(resultSet != null) {
            resultSet.close();
        }
        
    } catch (SQLException ex) {
        throw new RuntimeException("Erro ao encerrar conecção com o banco de dados.", ex);
    }   
}
    
    
}

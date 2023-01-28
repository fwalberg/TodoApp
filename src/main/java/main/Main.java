package main;

import controller.ProjectController;
import controller.TaskController;
import java.util.Date;
import model.Project;
import model.Task;

public class Main {

    public static void main(String[] args) {
        
        ProjectController projectController = new ProjectController();
        
        TaskController taskController = new TaskController();
        Task task = new Task(); 
        
        task.setIdProject(13);
        task.setName("Minha tarefa");
        task.setDescription("Salvando um tarefa");
        task.setNotes("Minhas notas");
        task.setIsCompleted(false);
        task.setDeadline(new Date());
        
        
   
        taskController.save(task);
    }
}

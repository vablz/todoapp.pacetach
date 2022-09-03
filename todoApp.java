Main.java

package todoApp;

import controller.ProjectController;
import controller.TaskController;
import java.sql.Connection;
import model.Task;
import util.ConnectionFactory;

/**
 *
 * @author Usuario
 */
public class Main {

  
    public static void main(String[] args) {
        
        TaskController taskController = new TaskController();
        Task task = new Task();
        task.setName("Task teste");
        task.setDescription("description");
        taskController.save(task);
        
    }
    
}

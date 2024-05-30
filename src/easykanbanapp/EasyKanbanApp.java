/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package easykanbanapp;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class EasyKanbanApp {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static int taskCounter = 0;
    private static String password;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
      System.out.println("Welcome to EasyKanban");
      
      
      String newUsername = "user_1";
      String newPassword = "Password123!";
      AccountManager accountManager = new AccountManager();
      accountManager.createAccount(newUsername, newPassword);
      
     boolean loggedIn = false;
     while (!loggedIn) {
         System.out.println("Please log in:");
         System.out.println("Username: ");
         String username = scanner.nextLine();
         loggedIn = accountManager.loginUser(username, password);
     }
    while (true)  {
        System.out.println("\nMain Menu:");
            System.out.println("1) Add tasks");
            System.out.println("2) Show report");
            System.out.println("3) Quit");
            System.out.println("Select an option: ");
            int option = scanner.nextInt();
            
             switch (option) {
                case 1:
                    System.out.println("How many tasks do you want to enter? ");
                    int numberOfTasks = scanner.nextInt();
                    scanner.nextLine();  
                    
         for (int i = 0; i < numberOfTasks; i++) {
             addTask(scanner);
         }
         break;
            case 2:
                    System.out.println("Coming Soon");
         break;
            case 3:
                    System.out.println("Invalid option. Please try again.");
    }
    }
    
} 
    private static void addTask(Scanner scanner) {
        System.out.println("Enter task name: ");
        String taskName = scanner.nextLine();
        
      System.out.println("Enter task description (max 50 characters): ");
        String taskDescription = scanner.nextLine();
        while (taskDescription.length() > 50) {
            System.out.println("Please enter a task description less than 50 characters.");
            taskDescription = scanner.nextLine();
    }
        System.out.println("Enter developer first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter developer last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter estimated duration (hours): ");
        int duration = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Select task status:");
        System.out.println("1) To Do");
        System.out.println("2) Done");
        System.out.println("3) Doing");
        int statusOption = scanner.nextInt();
        scanner.nextLine();  
        String status = "";
        switch (statusOption) {
            case 1:
                status = "To Do";
                break;
            case 2:
                status = "Done";
                break;
            case 3:
                status = "Doing";
                break;
            default:
                status = "Unknown";
        };
       Task task = new Task(taskName, taskCounter, taskDescription, firstName, lastName, duration, status);
        tasks.add(task);
        taskCounter++;

        JOptionPane.showMessageDialog(null, task.printTaskDetails());
    }
}
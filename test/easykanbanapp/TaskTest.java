/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package easykanbanapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class TaskTest {
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerFirstName;
    private String developerLastName;
    private int duration;
    private String taskStatus;
    private String taskId;
    
    public TaskTest(String taskName, int taskNumber, String taskDescription, String developerFirstName, String developerLastName, int duration, String taskStatus) {
         this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerFirstName = developerFirstName;
        this.developerLastName = developerLastName;
        this.duration = duration;
        this.taskStatus = taskStatus;
        this.taskId = createTaskID();
    }
public boolean checkTaskDescription() {
        return this.taskDescription.length() <= 50;
    }
public String createTaskID() {
        return (taskName.substring(0, 2) + ":" + taskNumber + ":" + developerLastName.substring(developerLastName.length() - 3)).toUpperCase();
    }
 public String printTaskDetails() {
        return "Task Status: " + taskStatus +
               "\nDeveloper Details: " + developerFirstName + " " + developerLastName +
               "\nTask Number: " + taskNumber +
               "\nTask Name: " + taskName +
               "\nTask Description: " + taskDescription +
               "\nTask ID: " + taskId +
               "\nDuration: " + duration + " hours";
    }
  public int returnTotalHours() {
        return this.duration;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public int getDuration() {
        return this.duration;
    }

    

    
    
}

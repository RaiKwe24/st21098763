/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easykanbanapp;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author lab_services_student
 */
public class TestClass {
    @Test
    public void testCheckTaskDescriptionSuccess() {
        Task task = new Task("Login feature", 0,"Create Login to authenticate users", "John", "Doe", 5,"To Do");
       assertTrue(task.checkTaskDescription()); 
    }
    @Test
    public void testCheckTaskDescriptionFailure() {
        Task task = new Task("Login feature", 0,"This description is intentionally made longer than 50 characters to test failure", "John","Doe", 5,"To Do");
        assertFalse(task.checkTaskDescription());
    }
    @Test
    public void testCreateTaskID() {
        Task task1 = new Task("Login feature", 0, "Create Login to authenticate users", "John", "Doe", 5, "To Do");
        Task task2 = new Task("Add task feature", 1, "Create add task feature to add task users", "Mike", "Smith", 10, "Doing");

        assertEquals("LO:0:DOE", task1.createTaskID());
        assertEquals("AD:1:ITH", task2.createTaskID());
    }
    @Test
    public void testTotalHours() {
        Task task1 = new Task("Task 1", 0, "Description 1", "John", "Doe", 10, "To Do");
        Task task2 = new Task("Task 2", 1, "Description 2", "Jane", "Smith", 12, "Doing");
        Task task3 = new Task("Task 3", 2, "Description 3", "Bob", "Brown", 55, "Done");
        Task task4 = new Task("Task 4", 3, "Description 4", "Alice", "White", 11, "To Do");
        Task task5 = new Task("Task 5", 4, "Description 5", "Charlie", "Black", 1, "Doing");

        Task[] tasks = {task1, task2, task3, task4, task5};

        int totalHours = 0;
        for (int i = 0; i < tasks.length; i++) {
            totalHours += tasks[i].getDuration();
        }

        assertEquals(10, tasks[0].getDuration());
        assertEquals(89, totalHours);
    }


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easykanbanapp;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author lab_services_student
 */
public class AccountManager {
    private Map<String, String> accounts = new HashMap<>();
    private String password;
    public void createAccount(String username, String passowrd) {
         if (validateUsername(username) && validatePassword(password)) {
            accounts.put(username, password);
            System.out.println("Account successfully created.");
        } else {
            System.out.println("Account creation unsuccessful. Check the username and password requirements.");
    }
    
}
  public boolean loginUser(String username, String password) {
        if (accounts.containsKey(username) && accounts.get(username).equals(password)) {
            System.out.println("Successful login.");
            return true;
        } else {
            System.out.println("Failed login. Please check if details are correctly entered.");
            return false;
        }
    }
  private boolean validateUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    private boolean validatePassword(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(" ") && password.matches(" ");
    }
}

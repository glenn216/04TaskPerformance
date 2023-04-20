/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04taskperformance;
import java.util.Scanner;
/**
 *
 * @author glenn
 */
public class Employee{
    private String name;
    
    public Employee(){
        name = "No assigned name yet.";
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return name;
    }
    
    Scanner scanner = new Scanner(System.in);
    public void run(){  
        System.out.print("Enter the name: ");
        String newName = scanner.nextLine();
        System.out.print("Press 'F' for Full Time or 'P' for Part Time: ");
        
        String input = scanner.nextLine();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        if(input.equalsIgnoreCase("F")){
            fullTimeEmployee.getInput(newName);
            fullTimeEmployee.writeOutput();
        }
        else if (input.equalsIgnoreCase("P")){
            partTimeEmployee.getInput(newName);
            partTimeEmployee.writeOutput();
        }
        else{
            System.out.println("Error: Please enter only the values 'F' or 'P'.");
        }
    }
}

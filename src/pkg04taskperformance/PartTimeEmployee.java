/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04taskperformance;

/**
 *
 * @author glenn
 */
public class PartTimeEmployee extends Employee {
    private double ratePerHour;
    private int hoursWorked;   
    private double wage;

    public void setRatePerHour(double rate){
        ratePerHour = rate;
    }
    public double getRatePerHour(){
        return ratePerHour;
    }
    
    public void setHoursWorked(int hours){
        hoursWorked = hours;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }
    public void setWage(double newWage){
        wage = newWage;
    }
    public double getWage(){
        return wage;
    }
    public void getInput(String newName){
        setName(newName);
        System.out.println("Enter rate per hour and no. of hours worked separated by space.");
        System.out.print("Input: ");
        int rate = scanner.nextInt();
        int workedHours = scanner.nextInt();
        setRatePerHour(rate);
        setHoursWorked(workedHours);
        setWage(getHoursWorked() * getRatePerHour());
    }
    public void writeOutput(){
        System.out.println("Name: " + getName());
        System.out.println("Wage: " + getWage());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04taskperformance;

/**
 *
 * @author glenn
 */
public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public void setMonthlySalary(double newMonthlySalary){
        monthlySalary = newMonthlySalary;
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }
    public void getInput(String name){
        setName(name);
        System.out.println("Enter the monthly salary.");
        System.out.print("Input: ");
        double salary = scanner.nextDouble();
        setMonthlySalary(salary);
    }
    public void writeOutput(){
        System.out.println("Name: " + getName());
        double annual_salary = getMonthlySalary() * 12;
        System.out.println("Annual Salary: " + annual_salary);
    }
}

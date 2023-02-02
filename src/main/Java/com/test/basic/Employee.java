package main.Java.com.test.basic;


/**
 * Create by xuefeng on 2023.1.27
 */

public class Employee{
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name){
        this.name = name;
    }

    public void setEmpAge(int empAge){
        age =  empAge;
    }

    public void setEmpDesignation(String empDesig){
        designation = empDesig;
    }

    public void setEmpSalary(double empSalary){
        salary = empSalary;
    }

    public void printEmployee(){
        System.out.println("Name:"+ name );
        System.out.println("Age:" + age );
        System.out.println("Designation:" + designation );
        System.out.println("Salary:" + salary);
    }
}

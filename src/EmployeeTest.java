import java.io.*;

public class EmployeeTest{

    public static void main(String[] args){
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        empOne.setEmpAge(26);
        empOne.setEmpDesignation("Senior Software Engineer");
        empOne.setEmpSalary(20000);
        empOne.printEmployee();

        empTwo.setEmpAge(21);
        empTwo.setEmpDesignation("Software Engineer");
        empTwo.setEmpSalary(8000);
        empTwo.printEmployee();
    }
}

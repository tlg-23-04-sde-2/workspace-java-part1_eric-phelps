package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;

public class EmployeeClient
{
    public static void main(String[] args)
    {
        // create an instance of Employee
        Employee emp = new Employee("Eric");


        //call goToWork() on the Employee object
        try
        {
            emp.goToWork();
        }
        catch (WorkException e) {
            System.out.println(e.getMessage());;
        }
    }
}
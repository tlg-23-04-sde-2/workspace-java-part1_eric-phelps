/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department
{
    // fields
    private String name;
    private String location;
    private final Collection<Employee> employees = new ArrayList<>();

    // constructors
    public Department()
    {
        //no-op, left blank intentionally
    }

    public Department(String name, String location)
    {
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees()
    {
        //for the use of collections we will be using simple for each loops
        for (Employee emp : employees)
        {
            System.out.println(emp); // to string automagically called
        }
    }

    public void workEmployees()
    {
        for (Employee emp : employees)
        {
            emp.work();
        }
    }

    public void payEmployees()
    {
        for (Employee emp : employees)
        {
            emp.pay();
        }
    }

    //forced holiday break. office closure
    //for all salaried employees, make them take vacation.
    public void holidayBreak()
    {
        for (Employee emp : employees)
        {

            if (emp instanceof SalariedEmployee)
            {
                SalariedEmployee semp = (SalariedEmployee) emp;
                semp.takeVacation();
            }
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) // emp is a reference, we are passing by reference to an object.
    {
        employees.add(emp);
    }

    // accessor methods
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    @Override
    public String toString()
    {
        return "Department: name=" + getName() + ", location=" + getLocation();
    }
}
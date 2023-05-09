/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 *
 * This code currently is Lab 8.2 -> 8.3
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient
{

    public static void main(String[] args)
    {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 1750.50));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 40,35));
        dept.addEmployee(new SalariedEmployee("Eric", LocalDate.of(2023, 5,8), 1_680.50));
        dept.addEmployee(new HourlyEmployee("Dennis", LocalDate.of(2023, 5,1), 35.50, 40.5));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        //time to pay the worker bees
        System.out.println("\nPay your people:");
        dept.payEmployees();
    }
}
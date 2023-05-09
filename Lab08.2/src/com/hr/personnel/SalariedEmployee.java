package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee
{
    //properties
    private double salary;

    //constructors
    public SalariedEmployee()
    {
    }

    public SalariedEmployee(String name, LocalDate hireDate)
    {
        super(name, hireDate);//a super class must be called at least once.
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary)
    {
        this(name, hireDate); //delegate to neighboring ctor above me, lets there only be one knock at the door to the parent.
        setSalary(salary);
    }

    //system methods
    @Override
    public void pay()
    {
        System.out.println(getName() + " is paid " + getSalary());
    }

    //accessors
    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", salary=" + getSalary();
    }
}
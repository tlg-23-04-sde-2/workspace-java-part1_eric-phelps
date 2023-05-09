package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee
{
    //properties
    private double rate;
    private double hours;

    //constructors
    public HourlyEmployee()
    {
        //left blank intentionally
    }

    public HourlyEmployee(String name, LocalDate hireDate)
    {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours)
    {
        this(name, hireDate); // only one child needs to alert the parents!!!!
        setRate(rate);
        setHours(hours);
    }

    //methods
    @Override
    public void pay()
    {
        System.out.println(getName() + " is paid " + (getHours() * getRate()));
    }

    @Override
    public void payTaxes()
    {
        System.out.println(getName() + " paid taxes of " + (getHours()*getRate()*TaxPayer.HOURLY_TAX_RATE));
    }

    //accessors

    public double getRate()
    {
        return rate;
    }

    public void setRate(double rate)
    {
        this.rate = rate;
    }

    public double getHours()
    {
        return hours;
    }

    public void setHours(double hours)
    {
        this.hours = hours;
    }

    //toString... tell me about yourself
    @Override
    public String toString()
    {
        return super.toString() + ", rate=" + getRate()+ ", hours=" + getHours();
    }
}
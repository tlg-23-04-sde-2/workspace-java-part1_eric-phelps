package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee
{
    // INSTANCE VARIABLES
    private final String name;

    // CONSTRUCTORS
    public Employee(String name)
    {
        this.name = name;
    }

    // BUSINESS METHODS

    //Option 4: try/catch and throw a different exception.
    // Instead of throwing the low-level "infrastructure" transportation exception
    // we will throw a more suitable exception for our HR client.

    public void goToWork() throws WorkException
    {
        Car c1 = new Car("tke123","Toyota", "Camry");

        c1.start();
        try
        {
            c1.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e)
        {
            throw new WorkException("Could not make it to work", e);
        }
        finally
        {
            c1.stop();
        }
    }

    //OPTION 3: Try, Catch, and react in some way
    // this is sometimes called a catch and rethrow.
//    public void goToWork() throws DestinationUnreachableException
//    {
//        Car c1 = new Car("tke123","Toyota", "Camry");
//
//        c1.start();
//        try
//        {
//            c1.moveTo("West Seattle");
//        }
//        catch (DestinationUnreachableException e)
//        {
//            System.out.println(" Send email to state government to complain");
//            throw e;
//        }
//        finally
//        {
//            c1.stop();
//        }
//    }

   /* public void goToWork() throws DestinationUnreachableException
    {
        //OPTION 2: ignore it or PUNT it
        // create an instance of Car with all three properties: vin, make, model
        Car c1 = new Car("tke123","Toyota", "Camry");

        // call moveTo() on the Car object, passing "West Seattle" for the destination
        c1.start();
        try
        {
            c1.moveTo("West Seattle");
        }
        finally
        {
            c1.stop();
        }

    }
    */

    /*
    public void goToWork()
    {
        OPTION 1: try catch statement
        // create an instance of Car with all three properties: vin, make, model
        Car c1 = new Car("tke123","Toyota", "Camry");

        // call moveTo() on the Car object, passing "West Seattle" for the destination
        c1.start();
        try
        {
            c1.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e)
        {
            System.out.println(" ERROR: " + e);;
        }
        finally
        {
            c1.stop();
        }
    }

     */

    // ACCESSOR METHODS
    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}
package com.panion;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

/*
 * Immutable class.
 *
 * this is technically a misnomer, more accurately it's a class definition written in such a way that
 * instances of the person objects can't have their properties changed.
 *
 * In the code, this simply means that there are NO public setters, sometimes no setters at all.
 */
class Person
{
    // Instance variables
    private String name;
    private LocalDate birthDay;

    //constructors
    public Person(String name, LocalDate birthDay)
    {
        this.name = name;
        this.birthDay = birthDay;
    }

    //accessor methods
    public String getName()
    {
        return name;
    }

    public LocalDate getBirthDay()
    {
        return birthDay;
    }

    //returns the persons age in whole years
    public int getAge()
    {
        int age = Period.between(getBirthDay(), LocalDate.now()).getYears();
        return age;
    }

    //toString...tell me about yourself.
    @Override
    public String toString()
    {
        //return "Person= " + "name: '" + getName() + '\'' + ", birthDay: " + getBirthDay() + '.';

        return String.format("Person: name= %s, birthday= %s", getName(), getBirthDay());
    }
}
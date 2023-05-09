package com.mathHelp;/*
 *
 */

class Calculator
{
    //super basic calculator; add, subtract, isEven
    public static double add(double i, double j)
    {
        return i+j;
    }

    public static double subtract(double i,double j)
    {
        return i-j;
    }

    public static boolean isEven(double value)
    {
        if (value%2==0)
        {
            System.out.println("the number you input is even");
            return true;
        }
        else
        {
            System.out.println("the number you input is odd.");
            return false;
        }
    }
    //

    /*
     * Returns a random int between 1 and 14
     * Hint: see a class called math in java.lang
     * Note: these methods in math class are all static.
     * you call them by Math.methodName()
     */

    public static int getRandom()
    {
        int result = 0;
        double rand = Math.random(); //this is 0.00000 to 0.99999
        double scaled = rand * 14;  //0.00000 to 13.99999
        double scaledFloor = (Math.floor(scaled) + 1);// 1.00000 to 14.00000
        //now convert via a explicit downcast.
        result = (int) scaledFloor;
        return result;
    }

    public static int getRandom(int min, int max)
    {
        //initialize the local variable that we are going to be working with.
        //what input do I need?
        int result = 0;
        int range = 0;
        double randomN = 0;
        double whole = 0;

        /*for the solution, you need to do multiple things.
          *a) you need to set the range of numbers you are working with (max - min)
          *b) now multiply the random (0.00000 -> 0.99999) and the range.
          *c) round up to be able to get the max
          *d) set you're min as the lowest number you can get (+ min)
          *e) lastly since we want an int, we need an explicit downcast
         */
        range = max - min;
        randomN = range * Math.random();
        whole = (Math.ceil(randomN));
        result = (int) whole + min;

        return result;
    }

    /*
     * This method returns the average of the supplied integers
     *
     */
    public static double getMean(int first, int... rest) // for example the user gives you 3,5,9, and 9
    {
        double result = 0.0;
        double sum = first;
        for (int value : rest)
        {
            sum = sum + value; // this is the same as writing sum +=value.
        }
        result = sum / (1 + rest.length); //at runtime, values is an array.

        return result;
    }
}
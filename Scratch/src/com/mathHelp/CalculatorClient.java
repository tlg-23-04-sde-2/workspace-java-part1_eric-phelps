package com.mathHelp;

import static com.mathHelp.Calculator.*;

class CalculatorClient
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        double sum = calc.add(5,5);//although I am passing ints as the parameters, it automatically up cast to double
        System.out.println(sum);

        System.out.println("the difference is: " + calc.subtract(8,5));

        int input = 11;
        calc.isEven(input);

        System.out.println();

        System.out.println(calc.getRandom(5,20));

        System.out.println();

        System.out.println(getMean(3,5,9,9));
        System.out.println(getMean(28)); // now that we have reworked the vararg, you have to input at least one option. you can no longer have a non input.
    }
}

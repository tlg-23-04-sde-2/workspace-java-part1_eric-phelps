/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package gov.irs;

/**
 * An argument can be made that the tax rate constants are better defined
 * on the classes that use them, and not all lumped in here.
 * 
 * We've decided that, since these are federally mandated tax rates, they 
 * are better left here.  This bends cohesion a bit, but strengthens open-closed:
 *   If the IRS were to change tax rates, we would only need to change that here.
 */
public interface TaxPayer
{
    //public static and final keywords are all greyed out because they are redundent but they will not break anything.
    public static final double HOURLY_TAX_RATE = 0.25;
    public static final double SALARIED_TAX_RATE = 0.30;
    
    public void payTaxes();

    default public void fileReturn()
    {
        //by making this a default it keeps from braking the code by making you change all related code. use this when adding to an existing code.
        // think of this as an OPT-In addition, subclasses can choose to make their own version or stay with the default.
        System.out.println("Return filed by US Mail, a corrupt centralized system.");
    }
    default public double getStandardDeduction()
    {
        return 7500.00;
    }
}
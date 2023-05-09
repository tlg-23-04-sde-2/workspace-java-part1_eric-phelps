/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.corp;

import gov.irs.TaxPayer;

/**
 * Corporate entity - also pays taxes.
 */
//taxpayer is an interface, so we know that it is inherently abstract.
//implements = signing the contract.
public class Corporation implements TaxPayer
{
    private String name;

    public Corporation(String name)
    {
        super();
        setName(name);
    }

    @Override  // interface TaxPayer
    public void payTaxes()
    {
        System.out.println(getName() + " paid no taxes - we lobbied hard and it worked");
    }

    public void fileReturn()
    {
        System.out.println("Return not filed - we sent our lawyers instead.");
    }
    //accessors aka getters and setters. how do i utilize something
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
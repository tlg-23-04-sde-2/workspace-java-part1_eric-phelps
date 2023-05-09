package com.woodworking.test;

import com.woodworking.ShopSaw;

class ShopSawValidationTest
{
    public static void main(String[] args)
    {
        /*
        //brand test
        com.woodworking.ShopSaw saw = new com.woodworking.ShopSaw();
        saw.setBrand("Bosch"); // this should stick
        System.out.println("Brand: " + saw.getBrand()); // should read bosch
        System.out.println();

        saw.setBrand("Dewalt"); // this should "throw" an error
        System.out.println("Brand: " + saw.getBrand()); // should read bosch
        System.out.println();

        //type test
        saw.setType("Miter"); // this should stick
        System.out.println("Type: " + saw.getType()); //should read miter
        System.out.println();

        saw.setType("Band");//this should "throw"
        System.out.println("Type: " + saw.getType());//should go back to Miter, default is table.
        System.out.println();
        */
        //BOTH brand and type were changed to enums therefore the validation test for them was no longer needed.

        //tooth number test
        ShopSaw saw = new ShopSaw();
        saw.setBladeTeeth(40); // this should stick, default is 24
        System.out.println("Teeth: " + saw.getBladeTeeth());
        System.out.println();

        saw.setBladeTeeth(100);//this should throw
        System.out.println("Teeth: " + saw.getBladeTeeth());//should go back to last stick.
        System.out.println();
    }
}
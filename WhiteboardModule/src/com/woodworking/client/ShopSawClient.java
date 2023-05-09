package com.woodworking.client;

import com.woodworking.SawBrand;
import com.woodworking.SawType;
import com.woodworking.ShopSaw;

/*
 *
 */
class ShopSawClient
{
    public static void main(String[] args)
    {
        System.out.println("You currently have " + ShopSaw.getToolCount() + " tools in use.\n");

        ShopSaw saw1 = new ShopSaw();
        saw1.setBrand(SawBrand.MAKITA);
        saw1.setType(SawType.MITER);
        saw1.setBladeTeeth(24);
        System.out.println(saw1);
        saw1.powerOn();
        saw1.cut();
        saw1.powerOff();
        System.out.println();

        ShopSaw saw2 = new ShopSaw(SawBrand.BOSCH, SawType.TABLE, 60);
        System.out.println(saw2);
        saw2.powerOn();
        saw2.rip();
        saw2.powerOff();
        System.out.println();

        ShopSaw saw3 = new ShopSaw(SawBrand.RYOBI, SawType.JIG, 40);
        System.out.println(saw3);
        saw3.powerOn();
        saw3.cut();
        saw3.powerOff();

        System.out.println("\nYou currently have " + ShopSaw.getToolCount() + " tools in use.");
    }
}
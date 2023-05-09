package com.woodworking.client;

import com.woodworking.SawBrand;
import com.woodworking.SawType;
import com.woodworking.ShopSaw;

/*
 *This is to help the end user by giving them banners as hints if they are strugglebussing.
 * give them a usage banner and maybe an example of what to do.
 */
class ShopSawClientArgs
{
    public static void main(String[] args)
    {
        if (args.length < 3)
        {
            String usage = "Useage: java com.woodworking.client.ShopSawClientArgs <brand> <type> <bladeTeeth>";
            System.out.println(usage);
            String example = "Example: java com.woodworking.client.ShopSawClientArgs Makita Miter 24";
            System.out.println(example);
            String note1 = "Note: supported brands are Ryobi, Makita, Bosch";
            System.out.println(note1);
            String note2 = "Note: supported types are Miter, Table, jig";
            System.out.println(note2);
            String note3 = "Note: supported Blade teeth are 8, 24, 40, 60";
            System.out.println(note3);
            return; // this would be an early return from main to exit the application.
        }

        System.out.println("Arguments provided: " + args.length + ".");

        //break it down into 3 steps
        //step 1: convert
        SawBrand brand = SawBrand.valueOf(args[0]); // presents the value as a string
        SawType type = SawType.valueOf(args[1]);
        int bladeTeeth = Integer.parseInt(args[2]);
        //step 2: create
        ShopSaw saw = new ShopSaw(brand, type, bladeTeeth);
        //step 3 print
        System.out.println("Here is your new saw: " + saw);
    }
}
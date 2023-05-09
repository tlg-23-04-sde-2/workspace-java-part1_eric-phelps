package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest
{
    public static void main(String[] args)
    {
        Television tv = new Television();
        tv.setVolume(0); // this should stick
        System.out.println(tv); // this should read 0
        System.out.println();

        tv.setVolume(100); // this should stick
        System.out.println(tv); // this should read 100
        System.out.println();

        tv.setVolume(-1); // this should "throw" and error.
        System.out.println();
        tv.setVolume(101); // this should also "throw the error message.
        System.out.println();
        System.out.println(tv); // this should revert to the last working message at 100. now run the test

        tv.setBrand("Samsung"); // should stick
        System.out.println("brand: " + tv.getBrand()); // should say samsung
        System.out.println();

        tv.setBrand("LG"); // should stick
        System.out.println("brand: " + tv.getBrand());//lg
        System.out.println();

        tv.setBrand("Sony");//should stick
        System.out.println("brand: " + tv.getBrand());//sony
        System.out.println();

        tv.setBrand("Toshiba");//should stick
        System.out.println("brand: " + tv.getBrand());//toshiba
        System.out.println();

        tv.setBrand("ONN"); // should "throw" error
        System.out.println("brand: " + tv.getBrand());// loads last valid of toshiba.
        System.out.println();


    }
}
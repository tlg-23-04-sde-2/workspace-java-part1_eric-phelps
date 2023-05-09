package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*This is lab 02.2->3.1->3.2->3.3->3.4->4.1->5.1
 */
class TelevisionClient
{
    public static void main(String[] args)
    {
        System.out.println(Television.getInstanceCount() + "instances");

        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MAX_VOLUME);
        tv1.setDisplay(DisplayType.PLASMA);
        tv1.turnOn();
        System.out.println(tv1);
        tv1.turnOff();
        System.out.println();

        Television tv2 = new Television("Sony", Television.MIN_VOLUME);
        tv2.turnOn();
        System.out.println(tv2.toString());//.toString is not required it runs automagically.
        tv2.turnOff();
        System.out.println();

        Television tv3 = new Television("LG");
        tv3.turnOn();
        System.out.println(tv3);
        tv3.turnOff();
        System.out.println();

        Television tv4 = new Television("Samsung", 25, DisplayType.OLED);
        tv4.turnOn();
        System.out.println(tv4);
        tv4.turnOff();
        System.out.println();

        System.out.println(Television.getInstanceCount() + "instances");







    }
}
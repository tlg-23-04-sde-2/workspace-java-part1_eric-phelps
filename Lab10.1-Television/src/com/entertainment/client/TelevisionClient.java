package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.InvalidVolumeException;
import com.entertainment.Television;

/*This is lab 02.2->3.1->3.2->3.3->3.4->4.1->5.1
 */
class TelevisionClient
{
    public static void main(String[] args)
    {
        try
        {
            Television tv1 = new Television("Sony", 50);
            System.out.println(tv1);

        }
        catch (InvalidVolumeException e)
        {
            e.printStackTrace();
        }


    }
}
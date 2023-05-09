package test.files;

import java.util.Arrays;

/*
 *
 */
class ArraysTest
{
    public static void main(String[] args)
    {
        int[] ages = new int[4];
        ages[0] = 28;
        ages[1] = 31;
        ages[2] = 56;
        ages[3] = 56;
        System.out.println(Arrays.toString(ages));

        double[] temps = {70.0, 56.9,98.6 ,32.7 };
        //for each temp in the array of temps
        for (double temp : temps)
        {
            System.out.println("The temp is: "+ temp);
        }
        System.out.println();
        for (int i=0; i<temps.length; i++)
        {
            System.out.println("The temp is: "+ temps[i]);
        }
    }
}
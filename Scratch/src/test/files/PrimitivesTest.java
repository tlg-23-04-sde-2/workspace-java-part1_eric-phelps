package test.files;

class PrimitivesTest
{
    public static void main(String[] args)
    {
        int age = 28;
        System.out.println("The value of age is: "+ age);

        long population = 8_000_000_000L;
        System.out.println("The value of world population is roughly : " + population);

        double weight = 263.5;
        System.out.println("My current weight as April 26 is: " + weight);

        boolean isMarine = true;
        System.out.println("I am a Marine: " + isMarine);

        char shirtSize = 'L';
        System.out.println("The shirt size i want to get back into is: " + shirtSize);
        //you should use String over char the majority of the time.

        String name = "Eric";
        System.out.println("My name is: " + name);

        // print the following sentence as a string
        // the word "belly" makes me laugh//
        System.out.println("the word \"belly\" makes me laugh");

        System.out.println();

        int i = 18;
        int j = i;
        i++; //i is now incremented to 19

        System.out.println("the value of i is: " + i + "\n" +"the value of j is: "+ j);

        int x = 3;
        System.out.println("\nx is: "+ ++x);
    }
}
package com.woodworking;
/* This is the White board module is a culmination of what we have done in class till turn in date.
 * Author: Eric Phelps
 *
 * contributions:
 *  1. (Lab 2.2) Create the WBM, create a business class and a client class with a main function.
 *      1.1 In the business class, create at least 3 properties and 3 business methods.
 *      1.2 Create a few instances of the business class in the client class.                           Done
 *  2. (lab 3.1) add accessor methods aka getters and setters.                                          Done
 *  3. (lab 3.2) determine if properties should be set to private or public for data encapsulation      Done
 *  4. (lab 3.3) add constructors, should have at least 2.                                              Done
 *  5. (lab 3.4) shared(static) and fixed(final) constants                                              Done
 *  6. (lab 4.1) data validation, completed in your setters as if statements.                           Done
 *  7. (lab 5.1) Enumeration classes by this point you should have at least 4 .java files in
 *      your source com.woodworking.ShopSaw,ShopSawClient,ShopSawValidationTest,ShopSawType             Done
 *  8. (lab 6.1) Using the args array and converting strings via wrapper classes.                       Done
 *  9. (lab 7.1) This is primarily for organization and is done outside the actual code.                Done
 */

//business class or system class, think of this as the parent,
// everything inside this will be passed down to the child in one way or another.
public class ShopSaw
{
    //instance variables
    private SawBrand brand = SawBrand.MAKITA; //constraints: Ryobi | Makita | Bosch
    private SawType type = SawType.TABLE; //constraints: Miter | Table | Jig
    //wanted to change bladeTeeth into an enum BladeStyle [DADO, T24, T40, T60], but left it as is for the sake of the validation test
    private int bladeTeeth = 24; // constraints 8,24,40,60

    private static int toolCount = 0;
    public static int getToolCount()
    {
        return toolCount;
    }

    //constructors
    public ShopSaw()
    {
        toolCount++;
    }
    public ShopSaw(SawBrand brand, SawType type, int bladeTeeth)
    {
        this();
        setBrand(brand);
        setType(type);
        setBladeTeeth(bladeTeeth);
    }


    //system methods -or- application functions
    public void powerOn()
    {
        System.out.println("The " + getBrand() + " " + getType() + " is now powered on");
    }
    public void cut()
    {
        System.out.println("you cut your board with a " + getBladeTeeth() + "  toothed blade." );
    }
    public void rip()
    {
        System.out.println("ripping your board to width a " + getBladeTeeth() + " toothed blade.");
    }
    public void powerOff()
    {
        System.out.println("The " + getBrand() + " " + getType() + " is now powered off");
    }


    //accessor methods

    // this was for the prior validation type before brand was changed to an enum.
    //________________________________________________________________________________________________
    /*public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        if (brand.equals("Ryobi")||
            brand.equals("Bosch")||
            brand.equals("Makita"))
        {
            this.brand = brand;
        }
        else
        {
            System.out.println("Brand: " + brand + " is not valid, the brand must be Bosch, Ryobi, or Makita");
        }
    }*/

    // this was for the prior validation type before type was set to an enum
    //__________________________________________________________________________________________________
    /*public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        if (type.equals("Miter")||
                type.equals("Table")||
                type.equals("Jig"))
        {
            this.type = type;
        }
        else
        {
            System.out.println("Type: " + type + " is not valid, the type must be Miter, Table, or Jig");
        }
    }*/

    public SawBrand getBrand() {
        return brand;
    }

    public void setBrand(SawBrand brand) {
        this.brand = brand;
    }

    public SawType getType() {
        return type;
    }

    public void setType(SawType type) {
        this.type = type;
    }

    public int getBladeTeeth()
    {
        return bladeTeeth;
    }

    public void setBladeTeeth(int bladeTeeth)
    {
        if (bladeTeeth == 8||
            bladeTeeth == 24||
            bladeTeeth == 40||
            bladeTeeth == 60)
        {
            this.bladeTeeth = bladeTeeth;
        }
        else
        {
            System.out.println("BladeTeeth: " + bladeTeeth + " is not valid, options are 8, 24, 40, 60.");
        }
    }

    //toString() - tell me about yourself.
    @Override
    public String toString() {
        return "com.woodworking.ShopSaw{" +
                "brand='" + getBrand() + '\'' +
                ", type='" + getType()+ '\'' +
                ", bladeTeeth=" + getBladeTeeth() +
                '}';
    }
}
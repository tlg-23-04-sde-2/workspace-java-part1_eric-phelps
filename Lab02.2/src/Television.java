/*This is lab 02.2->3.1->3.2->3.3->3.4->4.1->5.1->6.1
 *business class or system class
 * lab 3.1 adding getter and setter methods (accessors)
 * lab 3.2 encapsulation basics; determining private and public
 * lab 3.3 adding constructors
 * lab 3.4 shared and fixed constants(static and final)
 * lab 4.1 data validation (if/else statements)
 * lab 5.1 enumerations
 * lab 6.1 arrays
 */
class Television
{
    //3.4 stuff, statics should be at the top, since they are "shared" across all instances.
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;


    private static int instanceCount = 0;
    public static int getInstanceCount()
    {
        return instanceCount;
    }

    //instance variables/ fields
    private String brand = "Toshiba"; // brand name
    private int volume = 15; //current volume
    private DisplayType display = DisplayType.LED;




    //constructors
    public Television()
    {
        instanceCount++;
    }
    public Television(String brand)
    {
        this();
        setBrand(brand);
    }
    public Television(String brand, int volume)
    {
        //now delegate to your setters
        this(brand);//flow down from previous
        setVolume(volume);
    }
    public Television(String brand, int volume, DisplayType display)
    {
        this(brand, volume);
        setDisplay(display);
    }


    //business methods/application functions
    public void turnOn()
    {
        //call the private method for this task.
        boolean isConnected = verifyInternetConnection();
        System.out.println("Your " + getBrand() + " TV is turning on to volume " + getVolume() + ".\n");
    }
    public void turnOff()
    {
        System.out.println("The TV is powering off.\n");
    }

    //accessor methods

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        if (brand.equals("Samsung")|| brand.equals("Toshiba")|| brand.equals("LG")|| brand.equals("Sony"))
        {
            this.brand = brand;
        }
        else
        {
            System.out.println("Invalid brand. Brand must be Sony,Toshiba, LG, or Samsung.");
        }
    }

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {

        if ( volume >= 0 && volume <= 100)
        {
            this.volume = volume;
        }
        else
        {
            System.out.println("Invalid Volume Input: " + volume + "Volume must be between 0 and 100.");
        }
    }

    public DisplayType getDisplay()
    {
        return display;
    }

    public void setDisplay(DisplayType display)
    {
        this.display = display;
    }

    private boolean verifyInternetConnection()
    {
        return true; //this is a fake implementation
    }


    //toString()...tell me about yourself
    @Override
    public String toString()
    {
        return "Television{" + "brand='" + getBrand() + '\'' +
                ", volume=" + getVolume() + ", display= " + getDisplay() + '}';
    }
}
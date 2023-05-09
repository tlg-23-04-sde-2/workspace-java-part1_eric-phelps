package wake.meUp;/* Author: Eric Phelps

 * This is our scratch or practice paper where we go over a practice version of the homework labs.
 *
 * Today's lab is to create a working business or systems class of an alarm clock
 * this class definition does not have a main() - most classes do not.
 */

class AlarmClock
{
    //static = shared keeps these the same across all instances they are shared across all instances of the objects.
    //final = fixed MEANS THEY ARE FIXED AND UNCHANGING
    //private means hidden
    //public means the world can see them.
    private static final int MIN_INTERVAL = 1;
    private static final int MAX_INTERVAL = 20;

    //properties that you want to see across all instances you put here.
    //very similar to the parent/child class relationships.
    private int snoozeInterval = 5;
    private int repeat = 1;



    //constructors go here
    public AlarmClock()
    {}
    public AlarmClock(int snoozeInterval, int repeat)
    {
        //delegate your setters.
        setSnoozeInterval(snoozeInterval);
        setSnoozeInterval(repeat);
    }


    //business functions or methods you want to see across all instances go here.
    void snooze()
    {
        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes.");
    }

    //accessor methods [get and set] keywords (session 3)
    public int getSnoozeInterval()
    {
        return snoozeInterval;
    }

    //DONE: business constraint - must be between [1,20] inclusive.
    public void setSnoozeInterval(int snoozeInterval)
    {
        if ( MIN_INTERVAL<=snoozeInterval && snoozeInterval<=MAX_INTERVAL ) //valid snooze interval
        {
            this.snoozeInterval = snoozeInterval;
        }
        else
        {
            System.out.println(" the snooze interval you input is not a valid response.");
        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    @Override
    public String toString() {
        return "wake.meUp.AlarmClock{" + "snoozeInterval=" + getSnoozeInterval()+ ", repeat=" + getRepeat() + "}";
    }
}
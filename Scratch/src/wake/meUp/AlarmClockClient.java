package wake.meUp;

/*
 * This is a client main class, this is a class definition with the main().
 *
 * It will create a few instances of wake.meUp.AlarmClock and give them basic test-drive.
 */
class AlarmClockClient
{
    //this is the starting point for every standalone java application. basically the green light to GO.
    public static void main(String[] args)
    {
        //create an instance of wake.meUp.AlarmClock object and set its properties.
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);
        clock1.setRepeat(2);
            //clock 1 uses the default constructor that I had to add in to prevent red lines.

        //creates a second instance of wake.meUp.AlarmClock.
        AlarmClock clock2 = new AlarmClock(10, 1);

        //creates a third instance of wake.meUp.AlarmClock.
        //each of these instances is known as a reference.
        AlarmClock clock3 = new AlarmClock();


        //make them snooze()
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        System.out.println();

        //show the toString() method in action.
        System.out.println(clock1.toString());
        System.out.println(clock2.toString());
        System.out.println(clock3);
    }
}
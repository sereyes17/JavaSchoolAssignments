
/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * Modifications:
 * SR: Modified updateDisplay from 24 hour clock to 12 hour clock
 * SR: Added alarm feature to clock
 * SR: Added methods to turn on/off alarm
 * SR: Modified timeTick to check for alarm
 * SR: Added alarm ring simulation with print message
 * 
 * @author Michael Kölling and David J. Barnes and Sharayah Reyes
 * @version 2019.07.21
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private int alarmHour;
    private int alarmMin;
    private String displayString;    // simulates the actual display
    private boolean alarmOn;
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock and alarm set at 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        alarmOn = false;
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters and alarm set to 00:00.
     */
    public ClockDisplay(int hour, int minute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        alarmOn = false;
        setTime(hour, minute);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward and checks to see if alarm should go off.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        
        if(alarmHour == hours.getValue() && alarmMin == minutes.getValue() && (alarmOn == true)) {
            soundAlarm();
        }
        updateDisplay();
    }
 
    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }
    
    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Set the time of the alarm to the specified hour and minute with validation. If values 
     * entered are valid the alarm is turned on.
     */
    public void turnAlarmOn(int hour, int minute)
    {
       if (hour < 0 || hour > 23) {
            System.out.println("Please anter a valid number between 0-23.");
        }
        else {
           alarmHour = hour;
           alarmMin = minute;
           alarmOn = true;
        }
    }
        
    
    /**
     * Turns off alarm.
     */
    public void turnAlarmOff()
    {
        alarmOn = false;
    }
    
    
    /**
     * Update the internal string that represents the display.
     * 24 hour clock has been formatted to display as 12 hour clock
     */
    private void updateDisplay()
    {
       int h = hours.getValue();
       String amPm;
       
       if(h >= 12) {
           amPm = "pm";
        }
        else {
            amPm = "am";
        }
       if (h >= 12) {
           h %= 12;
        }
       if(h == 0) {
           h = 12;
        }
       displayString = h + ":" + 
                        minutes.getDisplayValue() + amPm;
    }
    
    /**
     * Prints alarm message when alarm goes off.
     */
    private void soundAlarm()
    {
      System.out.println("RISE AND SHINE!!!!!");
    }


}

    
       


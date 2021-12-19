
/**
 * Heater project
 * Simulate the behavior of a heater (thermostat)
 * 
 * Modifications:
 * SR: Added properties for temperature, minimum, maximum, increment
 * SR: Added contructors to initialize all properties
 * SR: Added getters for temperature, minimum, maximum, increment
 * SR: Added setters for temperature, minimum, maximum, increment
 * SR: Added method to validate that the number entered for increment is positive
 * SR: Added method to increment temperature and print error message 
 * if temperature exceeds maximum. 
 * SR: Added method to decrement temperature and print error message 
 * if temperature exceeds minimum
 * 
 * @author Sharayah Reyes
 * @version 07.13.2019
 */
public class Heater
{
    // The current temperature
    private int temperature;
    // The minimum temperature
    private int minimum;
    // The maximum temperature
    private int maximum;
    // Increments the temperature 
    private int increment;
    
/**
 * Simulate the behaviors of a heater with given temperature, minimum temp, maximum temp,
 * and the ability to increment/decrement temp
 */
public Heater()
{
    temperature = 50;
    minimum = 0;
    maximum = 100;
    increment = 1;
}

/**
 * Simulate the behaviors of a heater with given temperature, minimum temp, maximum temp,
 * and the ability to increment/decrement temp
 * @param temperature the temperature
 * @param minimum the minimum temperature
 * @param maximum the maximum temperature
 * @param increment the given value to increment/decrement temperature
 */
public Heater(int temperature, int minimum, int maximum, int increment)
{
    this.temperature = temperature;
    this.minimum = minimum;
    this.maximum = maximum;
    this.increment = increment;
}
    
/**
 * @return current temperature of heater
 */
public int getTemperature()
{
    return temperature;
}

/**
 * Set the current temperature to the value given
 * @param newTemperature
 */
public void setTemperature(int newTemperature)
{
    temperature = newTemperature;
}

/**
 * @return minimum temperature
 */
public int getMinTemp()
{
    return minimum;
}

/**
 * Set the minimum temperature to the value given
 * @param newMinTemp
 */
public void setMinTemp(int newMinTemp)
{
    minimum = newMinTemp;
}

/**
 * @return maximum temperature of heater
 */
public int getMaxTemp()
{
    return maximum;
}

/**
 * Set the maximum temperature to the value given
 * @param newMaxTemp
 */
public void setMaxTemp(int newMaxTemp)
{
    maximum = newMaxTemp;
}

/**
 * @return incremented temperature of heater
 */
public int getIncrement()
{
    return increment;
}

/**
 * Set the increment to the value given while validating that value entered is 
 * a positive number
 * @param newIncrement
 */
public void setIncrement(int newIncrement)
{
    if(newIncrement > 0) {
         increment = newIncrement;
    }
    else {
        System.out.println("Please enter a positive number rather than: " + newIncrement);
    }
}

/**
 * Increase the temperature by value of increment
 * Checks that the temperature doesn't go over maximum
 */
public void warmer()
{
    if(temperature + increment > maximum) {
        System.out.println("Too Hot!");
    }
    else {
        temperature += increment;  
    }    
}

/**
 * Decrease the temperature by value of increment
 * Checks that the temperature doesn't go below minimum
 */
public void cooler()
{
    if(temperature - increment < minimum) {
        System.out.println("Too cold!"); 
    }
    else {
        temperature -= increment;  
    }   
}
}
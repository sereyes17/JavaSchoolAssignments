
/**
 * Heater project
 *
 * @author Sharayah Reyes
 * @version 2019.08.13
 */
public class Main
{
    public static void main(String[] args)
    {
        Heater heater = new Heater(68, 40, 90,1);
        heater.setTemperature(89);
        heater.warmer();
        
    }
}

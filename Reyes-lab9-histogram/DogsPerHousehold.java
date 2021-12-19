
import java.util.ArrayList;
/**
 * Data on number of dogs per household in a random neighborhood
 *
 * @author Sharayah Reyes
 * @version 2019.08.2019
 */
public class DogsPerHousehold
{
    // number of dogs per house
    private ArrayList<Integer> numberOfDogs;

    /**
     * Constructor for objects of class DogsPerHousehold
     */
    public DogsPerHousehold()
    {
        numberOfDogs = new ArrayList<>();
        dogData();
    }

    /**
     * @ return the number of dogs data
     */
    public ArrayList<Integer> getNumberOfDogs()
    {
        return numberOfDogs;
    }
    
    /**
     * Add dog data to numberOfDogs array list
     */
    private void dogData()
    {
        numberOfDogs.add(3);
        numberOfDogs.add(1);
        numberOfDogs.add(1);
        numberOfDogs.add(1);
        numberOfDogs.add(1);
        numberOfDogs.add(2);
        numberOfDogs.add(0);
        numberOfDogs.add(0);
        numberOfDogs.add(0);
        numberOfDogs.add(3);
        numberOfDogs.add(0);
        numberOfDogs.add(4);
        numberOfDogs.add(2);
        numberOfDogs.add(1);
        numberOfDogs.add(0);
        numberOfDogs.add(0);
        numberOfDogs.add(0);
        numberOfDogs.add(1);
        numberOfDogs.add(2);
        numberOfDogs.add(1);
        numberOfDogs.add(0);
        numberOfDogs.add(2);
        numberOfDogs.add(0);
        numberOfDogs.add(0);
        numberOfDogs.add(1);
        numberOfDogs.add(0);
        numberOfDogs.add(1);
        numberOfDogs.add(1);
        numberOfDogs.add(1);
        numberOfDogs.add(0);
    }
}

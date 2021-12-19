import java.util.ArrayList;
/**
 * Analyze and display dogs per household data
 *
 * @author Sharayah Reyes
 * @version 2019.08.10
 */
public class DogsPerHouseholdDisplay
{
    private ArrayList<Integer> dogsPerHousehold;
    private int[] number;

    /**
     * Create an object to analyze and display the number of dogs per household
     */
    public DogsPerHouseholdDisplay()
    {
        dogsPerHousehold = new DogsPerHousehold().getNumberOfDogs();
        analyzeDogData();
    }

    /**
     * Calculates the number of dogs per household and 
     * fills in the array with frequency counts
     */
    private void analyzeDogData()
    {
       number = new int [5];
        
        for(Integer dogs: dogsPerHousehold) {
            if (dogs == 0) {
                number[0]++;
            }
            else if (dogs == 1) {
                number[1]++;
            }
            
            else if (dogs == 2) {
                number[2]++;
            }
            else if (dogs == 3) {
                number[3]++;
            }
            else {
                number[4]++;
            }
       }
    }
    
    /**
     * Prints the information on how many dogs per household, 
     * including corresponding number of asterisks
     */
    public void displayDogs()
    {
       System.out.println("=================== Number of Dogs Per Household =====================");
       System.out.println("Displays the number of dogs per household in a random neighborhood.");
       System.out.println(" ");
       System.out.println("Households with zero dogs: " + number[0] + " " + asterisk(number[0]));
       System.out.println("Households with one dog: " + number[1]  + " " + asterisk(number[1]));
       System.out.println("Households with two dogs: " + number[2]  + " " + asterisk(number[2]));
       System.out.println("Households with three dogs: " + number[3]  + " " +  asterisk(number[3]));
       System.out.println("Households with four dogs: " + number[4]  + " " +  asterisk(number[4]));
   
     }
        
    /**
     * Converts numbers to asterisks
     */
    private String asterisk(int star) 
    {
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < star; i++) {
            temp.append("*");
        }
        return temp.toString();
    }
   public void go()
   {
       int counter = 1;
       while (counter >=10) { 
        counter++;
        System.out.println("A");
   }
   }
}

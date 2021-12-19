
/**
 * An app for a mobile device
 *
 * Modifications:
 * CT: Added properties for name, author, price, rating
 * CT: Added constructor that initializes all properties
 * CT: Added getters for name, author, price
 * CT: Added setter for price
 * CT: Added methods to reset and increase rating
 * CT: Added method to print app basic info
 * SR: Added second constructor
 * SR: Added getter for rating
 * SR: Added setter for rating 
 * SR: Updated method that increases app rating
 * SR: Added method that decreases app rating 
 * SR: Updated method that prints app basic info to include rating
 * 
 * @author Sharayah Reyes
 * @version 2019.07.05
 */
public class App
{
    private String name;
    private String author;
    private double price;
    private int rating; // valid ratings are 1-4 or 0 meaning not rated
    
    /**
     * Create an app with the given name, author, price, and rating
     * @param appName the app name
     * @param appAuthor the app author
     * @param appPrice the price of the app (0 if the app is free)
     * @param appRating the app's rating
     */
    public App(String appName, String appAuthor, double appPrice, int appRating)
    {
        name = appName;
        author = appAuthor;
        price = appPrice;
        rating = appRating;
    }
    
    /**
     * Create an app with the given name, author, price
     * @param appName the app name
     * @param appAuthor the app author
     * @param appPrice the price of the app (0 if the app is free)
     * Set app rating to 0
    */
    public App(String appName, String appAuthor, double appPrice)
    {
        name = appName;
        author = appAuthor;
        price = appPrice;
        rating = 0;
    }
    

    /**
     * @return the app name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @return the app author
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * @return the app price
     */
    public double getPrice()
    {
        return price;
    }
    
    /**
     * Set the price of this app to the value given
     * @param newPrice new price for this app
     */
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }
    
    /**
     * @return the app rating
     */
    public int getRating()
    {
        return rating;
    }
    
    /**
     * Set the rating of this app to the value given
     * @param newRating new rating for this app
     */
    public void setRating(int newRating)
    {
        rating = newRating;
    }
        
    /**
     * Reset the rating of this app to not rated
     */
    public void resetRating()
    {
        rating = 0;
    }
        
    /**
     * Increase the rating of this app by 1
     */
    public void increaseRating()
    {
        rating = rating + 1;
    }
    
    /**
     * Decrease the rating of this app by 1
     */
    public void decreaseRating()
    {
        rating = rating - 1;
    }

    /**
     * Print information on this app
     */
    public void printAppInfo()
    {
        System.out.println("---------------------------------");
        System.out.println("App: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Rating: " + rating);  
        System.out.println("---------------------------------");
    }
}
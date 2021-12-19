
import java.util.ArrayList;

/**
 * An app store containing apps
 * 
 * Modifications:
 * CT: Create AppStore with a list of apps and basic methods to add, clear, and print apps
 *
 * @author Cara Tang
 * @version 2018.02.17
 */
public class AppStore
{
    private String appStoreName;
    private ArrayList<App> appList;
    
    /**
     * Create an app store with the given name
     * @param name the name of this app store
     */
    public AppStore(String name)
    {
        appStoreName = name;
        appList = new ArrayList<App>();
    }
    
    /**
     * Populate the store with a few apps.
     * Use this method to make testing easier. After creating an AppStore,
     * call this method to populate the apps, and then test your methods.
     */
    public void populateApps()
    {
        addApp("Pandora Music", "Pandora", 0);
        addApp(new App("Minecraft", "Mojang", 6.99, 3));
        addApp(new App("Atomas", "Sirnic", 0));
        addApp(new App("Plex", "Plex, Inc.", 0));
        // TODO: ------------------------ 1 --------------------------
        // TODO: Add a few more apps.
    }
    
    /**
     * Add the given app to the app store
     * @param anApp an app to add
     */
    public void addApp(App anApp)
    {
        appList.add(anApp);
    }
    
    /**
     * Create an app with the given name, author, and price and add it to the store.
     * The app starts out unrated.
     * @param name name of the app
     * @param author the app author
     * @param price the price of the app
     */
    public void addApp(String name, String author, double price)
    {
        appList.add(new App(name, author, price));
    }
    
    /**
     * @return the number of apps in the store
     */
    public int getNumberOfApps()
    {
        return appList.size();
    }
    
    /**
     * Removes all the apps from the store
     */
    public void clearAppStore()
    {
        appList.clear();
    }
    
    /**
     * Print all the apps in the store
     */
    public void printAppList()
    {
        System.out.println("============= " + appStoreName + " =============");
        if (appList.size() == 0) {
            System.out.println("No apps in the store");
        }
        else {
            for (App currentApp : appList) {
                currentApp.printAppInfo();
            }
        }
        System.out.println("===========================================");
    }

    /**
     * Find an app based on its name
     * @param name the name of the app to search for
     * @return the app with the given name
     *         or null if there is no app with that name
     */
    // public App findApp(String name)
    // {
        // TODO: ------------------------ 2 --------------------------
        // TODO: Uncomment the method wrapper and implement according to the header comment.
        // TODO: Do not change the method signature that is given.
        // TODO: Hint: One approach is to use a for-each to loop over each app in the list.
        // TODO: Inside the loop check if the app name matches and if so, return the app.
        // TODO: If the loop completes without returning, the app is not in the list and 
        // TODO: you can return null.
    // }
    
    // TODO: ------------------------ 3 --------------------------
    // TODO: Write a method called removeApp that takes a String parameter.
    // TODO: and removes the app with that name.
    // TODO: Hint: ArrayList has a remove method that takes an object that is the element
    // TOOD: to remove. You can call findApp to find the app to remove, and pass it to remove.
    
    // TODO: ------------------------ 4 --------------------------
    // TODO: Write a method called getAppsByAuthor that takes a String parameter
    // TODO: and returns a list of apps by the given author.
    // TODO: If there are no apps with that author, return an empty list (not null).
    // TODO: Do not print anything in this method.
    // TODO: Hint: The structure of this method will be the same as the getUnsold method
    // TODO: from the Auction project.
    
    // TODO: ------------------------ 5 --------------------------
    // TODO: Write a method called getNumAppsWithRating that takes an int parameter
    // TODO: representing a rating, and returns the number of apps in the app store
    // TODO: that have the given rating.
    // TODO: Example: If two apps in the store have rating 3, then the call
    // TODO: getNumAppsWithRating(3) will return 2.
    
    // OPTIONAL TODO: ------------------------ 6 --------------------------
    // OPTIONAL TODO: This TODO is optional.
    // OPTIONAL TODO: Write a method called getMaxRatingOfAnApp (no parameters) that
    // OPTIONAL TODO: returns the maximum rating of an app in the app store.
    // OPTIONAL TODO: Example: If the store has 3 apps, one with rating 2 and two unrated,
    // OPTIONAL TODO: then the max rating is 2.

    // TODO: ------------------------ 7 --------------------------
    // TODO: Write a method called printAppStoreSummaryStats (no parameters, no return)
    // TODO: that prints the name of the app store, the total number of apps, the number of
    // TODO: apps of each rating, and the number of unrated apps.
    // TODO: If you implemented getMaxRatingOfAnApp, print the max rating as well.
    // TODO: Sample output:
    // ======== SUMMARY STATS for Joe's App Store ========
    // Total # of apps: 3
    // # apps rated 4: 0
    // # apps rated 3: 0
    // # apps rated 2: 1
    // # apps rated 1: 0
    // # of unrated apps: 2
    // Max rating: 2
    // ===========================================

}
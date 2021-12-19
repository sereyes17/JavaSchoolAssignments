import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AppTest - for Lab 2
 *
 * @author Cara Tang
 * @version 2017.12.30
 */
public class AppTest
{
    private static final String NAME = "App Name";
    private static final String AUTHOR = "App Author";
    private static final double PRICE = 1.99;
    private static final double DELTA = 0.001;
    
    @Test
    public void _1_threeArgConstructorInitializesPropertiesAndSetsRatingToZero()
    {
        App app = new App(NAME, AUTHOR, PRICE);
        assertEquals(NAME, app.getName());
        assertEquals(AUTHOR, app.getAuthor());
        assertEquals(PRICE, app.getPrice(), DELTA);
        assertEquals(0, app.getRating());
    }

    @Test
    public void fourArgConstructorInitializesProperties()
    {
        App app = new App(NAME, AUTHOR, PRICE, 2);
        assertEquals(NAME, app.getName());
        assertEquals(AUTHOR, app.getAuthor());
        assertEquals(PRICE, app.getPrice(), DELTA);
        assertEquals(2, app.getRating());
    }

    @Test
    public void setPriceWithValidPriceWorks()
    {
        double newPrice = 8.99;
        App app = new App(NAME, AUTHOR, 1.25, 2);
        app.setPrice(newPrice);
        assertEquals(newPrice, app.getPrice(), DELTA);
    }
    
    @Test
    public void setPriceWithPrice0Works()
    {
        App app = new App(NAME, AUTHOR, 1.25, 2);
        app.setPrice(0);
        assertEquals(0, app.getPrice(), DELTA);
    }

    @Test
    public void _2_getRatingReturnsRating()
    {
        App app = new App(NAME, AUTHOR, PRICE, 2);
        assertEquals(2, app.getRating());
    }
    
    @Test
    public void resetRatingSetsRatingToZero()
    {
        App app = new App(NAME, AUTHOR, PRICE, 2);
        assertNotEquals(0, app.getRating());
        app.resetRating();
        assertEquals(0, app.getRating());
    }
    
    @Test
    public void _3_setRatingWithValidRatingWorks()
    {
        App app = new App(NAME, AUTHOR, PRICE);
        app.setRating(3);
        assertEquals(3, app.getRating());
    }

    @Test
    public void _3_setRatingWithValidRatingWorksBoundaryValues()
    {
        App app = new App(NAME, AUTHOR, PRICE);
        app.setRating(1);
        assertEquals(1, app.getRating());
        app.setRating(4);
        assertEquals(4, app.getRating());
    }

    @Test
    public void _4_increaseRatingIncreasesRatingByOne()
    {
        final int ORIG_RATING = 2;
        App app = new App(NAME, AUTHOR, PRICE, ORIG_RATING);
        
        app.increaseRating();
        assertEquals(ORIG_RATING + 1, app.getRating());
        app.increaseRating();
        assertEquals(ORIG_RATING + 2, app.getRating());
    }
    
    @Test
    public void _5_decreaseRatingDecreasesRatingByOne()
    {
        final int ORIG_RATING = 3;
        App app = new App(NAME, AUTHOR, PRICE, ORIG_RATING);
        
        app.decreaseRating();
        assertEquals(ORIG_RATING - 1, app.getRating());
        app.decreaseRating();
        assertEquals(ORIG_RATING - 2, app.getRating());
    }
    
    @Test
    public void _6_printAppInfoPrintsAppPropertiesIncludingRating()
    {
        System.out.println("--------- App info printed with rating 3: ----------");
        App app = new App(NAME, AUTHOR, PRICE, 3);
        app.printAppInfo();
        System.out.println("--------- -------------------------------- ----------");
    }

}

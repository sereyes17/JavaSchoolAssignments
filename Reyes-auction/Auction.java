import java.util.ArrayList;
import java.util.Iterator;

/**
 * A simple model of an auction.
 * The auction maintains a list of lots of arbitrary length.
 *
 * Modifications:
 * SR: Added close method
 * SR: Added getUnsold method
 * SR: Modified getLot method
 * SR: Added removeLot method
 * 
 * @author David J. Barnes and Michael Kölling and Sharayah Reyes.
 * @version 2019.08.01
 */
public class Auction
{
    // The list of Lots in this auction.
    private ArrayList<Lot> lots;
    // The number that will be given to the next lot entered
    // into this auction.
    private int nextLotNumber;

    /**
     * Create a new auction.
     */
    public Auction()
    {
        lots = new ArrayList<>();
        nextLotNumber = 1;
    }

    /**
     * Enter a new lot into the auction.
     * @param description A description of the lot.
     */
    public void enterLot(String description)
    {
        lots.add(new Lot(nextLotNumber, description));
        nextLotNumber++;
    }

    /**
     * Show the full list of lots in this auction.
     */
    public void showLots()
    {
        for(Lot lot : lots) {
            System.out.println(lot.toString());
        }
    }
    
    /**
     * Return a list of the unsold lots
     */
    public ArrayList<Lot> getUnsold()
    {
        ArrayList<Lot> unsold = new ArrayList<Lot>();
        for (Lot lot : lots) {
            Bid bid = lot.getHighestBid();
            if(bid.equals(null)) {
                unsold.add(lot);
            }
        }        
        return unsold;
    }
        
    /**
     * Make a bid for a lot.
     * A message is printed indicating whether the bid is
     * successful or not.
     * 
     * @param lotNumber The lot being bid for.
     * @param bidder The person bidding for the lot.
     * @param value  The value of the bid.
     */
    public void makeABid(int lotNumber, Person bidder, long value)
    {
        Lot selectedLot = getLot(lotNumber);
        if(selectedLot != null) {
            Bid bid = new Bid(bidder, value);
            boolean successful = selectedLot.bidFor(bid);
            if(successful) {
                System.out.println("The bid for lot number " +
                                   lotNumber + " was successful.");
            }
            else {
                // Report which bid is higher.
                Bid highestBid = selectedLot.getHighestBid();
                System.out.println("Lot number: " + lotNumber +
                                   " already has a bid of: " +
                                   highestBid.getValue());
            }
        }
    }

    /**
     * Return the lot with the given number. Return null
     * if a lot with this number does not exist.
     * @param lotNumber The number of the lot to return.
     */
    public Lot getLot(int lotNumber)
    {
        boolean found = false;
	Lot result = null;	
	Iterator<Lot> it = lots.iterator();
	while(!found && it.hasNext())
	{
		Lot t = it.next();
		found = (t.getNumber() == lotNumber);
		if (found)
		{
		 result = t;
		}
	}
	return result;
    }
    
    /**
     * Prints out details of all lots and if lot has been sold or unsold.
     * Also prints out name of winning bidder
     */
    public void close()
    {
        for(Lot lot: lots) {
            System.out.println(lot.getNumber() + ": " + lot.getDescription());
            Bid highestBid = lot.getHighestBid();
            if(highestBid != null) {
                System.out.println("The highest bidder is: " + 
                    highestBid.getBidder().getName());
                System.out.println("with a bid of: " + highestBid.getValue());
            }
            else {
                System.out.println("This item has not been sold!");
            }
        }
    }
      
    /**
     * Remove the lot with the given ot number.
     * @param number The number of the lot to be removed.
     * @return The Lot with the given number, or null if there is no such lot.
     */
    public Lot removeLot(int number)
    {
        Lot lot = getLot(number);
        if(lot != null) {
            lots.remove(lot);
        }
        return lot;
    }
}

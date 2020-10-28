import java.util.Date;
/**
 * Write a description of class Ticket here.
 *
 * @author Eman Limbu
 * @version 2020.10.28
 */
public class Ticket
{
    // Attributes
    private String destination;
    
    private int price;
    
    private Date printdateTime;
    
    

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int price)
    {
       
        this.destination = destination;
        this.price = price;
        
        printdateTime = new Date();
        
    } public int getPrice()
    {return price;
    }public String getDestination()
    {
    return destination;
    }
    
    /**
     * Printing method 
     *
     * 
     *
     */
    public void print()
    {
        // put your code here
        System.out.println(" Ticket - " + destination + "Price:" + price + "Issued," + printdateTime);
              
    }
}

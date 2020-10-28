/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2020.10.28
 * 
 * Modified by Eman Limbu
 */
public class TicketMachine
{
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    private Ticket ticket;
    
    private Ticket AylesburyTicket;
    
    private Ticket AmershamTicket;
    
    private Ticket HighWycombeTicket;
    
    private coin coin;
    
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int cost)
    {
        balance = 0;
        total = 0;
        
        AylesburyTicket = new
   Ticket("Aylesbury",220);
        AmershamTicket = new
   Ticket("Amersham",300);
        HighWycombeTicket = new
   Ticket("HighWycombe",330);
        ticket = null;
}
    


    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }
    /**
     * If any of the tickets is selected then the ticket will shown according to the destination
     * 
     * 
     */
    public void selectAylesburyTicket()
    {
        ticket=AylesburyTicket;
        }
    public void selectAmershamTicket()
    {
        ticket=AmershamTicket;
    }
    public void selectHighWycombeTicket()
    {
        ticket=HighWycombeTicket;
    }
    
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    { int price = ticket.getPrice();
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    /**
     * This is method used to allow to enter each specific amount of money in pence listed 
     * At the end the system prints out the amount entered and the current balance
     */
    public void insert20()
    {
        balance = balance+20;
        printBalance(20);
    }
    
    public void insert10p()
    {
        balance = balance+10;
        printBalance(10);
    }
    
    public void insert100()
    {
        balance = balance+100;
        printBalance(100);
    }
    
    public void insert200()
    {
        balance = balance+200;
        printBalance(200);
    }
    
    public void printBalance(int amount)
    {
        System.out.println("Amount Entered");
        System.out.println("Current balance = " +balance);
    }
}


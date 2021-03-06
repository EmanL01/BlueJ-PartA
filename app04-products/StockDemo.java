/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Eman Limbu
 * @version 09/11/2020
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(101, "Samsung Galaxy S20"));
        manager.addProduct(new Product(102, "Apple iPhone 12"));
        manager.addProduct(new Product(103, "Google Pixel 4A"));
        manager.addProduct(new Product(104, "Apple Ipad Air"));
        manager.addProduct(new Product(105, "Amazon Fire HD 10"));
        manager.addProduct(new Product(106, "Lenovo Yoga Smart Tab"));
        manager.addProduct(new Product(107, "Onyx Book Note 2"));
        manager.addProduct(new Product(108, "ACER ACTAB1021 10"));
        manager.addProduct(new Product(109, "LENOVO TAB M8"));
        manager.addProduct(new Product(110, "Alldocube iplay 7T"));
    }
   
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDeliverProduct()
    {
        // Show details of all of the products before delivery.
        manager.printProduct(101);
        
        // Take delivery of 5 items of one of the products.
        manager.delivery(101, 5);
        
        // Show the list of all products after delivery
        manager.printProduct(101);
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void demoSellProduct(int id, int quantity)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            manager.printProduct(id);
            product.sellproduct(quantity);
            manager.printProduct(id);
        }
    }
   
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }
}

import java.util.Scanner;
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Eman Limbu
 * @version 0.1
 */
public class StockApp
{
    // Use to get user input
    private InputReader input;

    private StockManager manager;

    private String [] menuChoices;

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }

    /**
     * input method so words listed below will trigger the methods
     */
    private void inputsetup()
    {
        menuChoices = new String[]
        {
            "Add a new product",
            "Print all products",
            "Quit the program",
        };
    }

    /**
     * Run method executes all those instructions within the while loop 
     */
    public void run()
    {
        boolean finished = false;

        while(!finished)
        {
            printHeading();
            printMenuChoices();
            inputsetup();

            String choice = input.getInput();
            choice = choice.toLowerCase();

            if(choice.equals("quit"))
            {
                finished = true;
            }
            else
            {
                executeMenuChoice(choice);
            }
        }

    } 

    /**
     * Depending on what menu is typed it calls up the method
     */

    private void executeMenuChoice(String choice)
    {
        if(choice.equals("add"))
        {
            addProduct();
        }
        else if(choice.equals("printall"))
        {
            printAllProducts();
        }
    }

    /**
     * Add product method
     */
    public void addProduct()
    {
        System.out.println ("Add a new Product");
        System.out.println ();

        System.out.println ("Please enter the name of the product");
        String name = input.getInput();

        while(name.equals(""))
        {
            System.out.println ("Error, You must name the product");
            name = input.getInput();
            if(input.equals(true)){
                break;
            }  

        }

        Scanner input = new Scanner(System.in);

        System.out.println ("Please enter the id of the product");
        int number = input.nextInt();

        Product product = new Product(number,name);
        manager.addProduct(product);
        
        System.out.println("\nAdded "+ product + "to the stock");

        inputsetup();

    }

    /**
     * print method
     */
    public void printAllProducts()
    {
        manager.printAllProducts();
    }

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Eman Limbu");
        System.out.println("******************************");
    }
}

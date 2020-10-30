
/**
 * The information about modules is held in this class
 *
 * @author Eman Limbu
 * @version 29/10/2020
 */
public class Module
{
    //Varaibles
    
    private String title;
    
    private String codeNo;
    
    private Course coures;
    
    private int mark;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        mark = 0;
        this.title = title;
        this.codeNo = codeNo;

    }
    
    /**
     * Awards mark to the module 
     */
    public void awardMark(int mark)
    {
        if((mark >= 0) && (mark <= 100))
        {
            this.mark = mark;
        }
        else
        {
            System.out.print("Invalid mark!!!");
        }
    }
    
    /**
     * Printing method for the module
     */
    public void print()
    {
        System.out.println("Module: " + codeNo +
            " " + title + " Mark = " + mark);
    }

}

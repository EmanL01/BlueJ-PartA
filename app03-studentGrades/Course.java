import java.util.*;

/**
 * This class stores information about a course
 *
 * @author Eman Limbu
 * @version 0.1 29/10/2020
 */
public class Course
{
    // Variables
    private String codeNo;
    private String title;
    
    //Array varaible of module
    private ArrayList<Module> modules;
    
    
    private int finalMark;
        
    
        
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        
        this.codeNo = codeNo;
        this.title = title;
        
        //modules is stored in array
        modules = new ArrayList<Module>();
        
    }
    
    public void addModules(Module newModule)
    {
       modules.add(newModule);
    }
    
    public void addMark(int mark, int moduleNo)
    {
         if(moduleNo == 1)
        {
            
        }
    }
    
    /**
     * Prints out the details of a course
     */
    public void print()
    {
         System.out.println("Course " + " - " + " CodeNo: " + codeNo + ", Title:" + title);
    }
    
    /**
     * This method prints out the module that is added to the course
     */
    public void printmodules()
    { 
        for(Module module: modules)
        {
            module.print();
        }
    } 
}


/**
 * This class will hold the information about the course 
 * The course will have their respective title and course code 
 * @author Eman Limbu
 * @version 21/Oct/2020
 */
public class Course
{
    // the course title 
    private String title;
    // the course Coursecode
    private String Coursecode;

    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String Coursecode)
    {
        this.title = title;
        this.Coursecode = Coursecode;
    }

    /**
     * This method is created so course now can print Course and the Coursecode
     */
    public void print()
    {
        System.out.println("Course:" + title + "credits:" + Coursecode);
    }

}

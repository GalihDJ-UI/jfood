
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String password;
    private String joinDate;
    private String email;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(int id, String name, String email, String password, 
    String joinDate)
    {
        // initialise instance variables
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        // put your code here
        return id;
    }
    
    public String getName()
    {
     return name;
    }
    
    public String getEmail()
    {
     return email;
    }
    
    public String getPassword()
    {
     return password;
    }
    
    public String getJoinDate()
    {
     return email;
    }
    
    public void setId(int id)
    {
      this.id = id;  
    }
    
    public void setName(String name)
    {
      this.name = name;
    }
    
    public void setEmail(String email)
    {
      this.email = email; 
    }
    
    public void setPassword(String password)
    {
      this.password = password; 
    }
    
    public void setJoinDate(String joinDate)
    {
      this.joinDate = joinDate; 
    }
    
    public void printData()
    {
      System.out.println(name);   
    }
}

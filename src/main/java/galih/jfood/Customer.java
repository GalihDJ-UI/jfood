package galih.jfood;
import java.util.*;
import java.util.regex.*; 
import java.text.*;

/**
 * Class yang menyimpan dan mengatur data pelanggan
 *
 * @author Galih Damar Jati
 * @version (27 Feb 2020)
 */

public class Customer
{
    private int id;
    private String name;
    private String password;
    private Calendar joinDate;
    private String email;

    /**
     * Constructor untuk object class customer
     *@param id
     *@param name
     *@param email
     *@param password
     *@param joinDate
     */
    public Customer(int id, String name, String email, String password, 
    Calendar joinDate)
    {
        setEmail(email);
        setPassword(password);
        this.id = id;
        this.name = name;
        this.joinDate = joinDate;
    }

    /**
     * Constructor untuk object class customer dengan joinDate bertipe data gregorian calendar
     *
     * @param id
     * @param name
     * @param email
     * @param password
     * @param year
     * @param dayOfMonth
     * @param month
     */
    public Customer(int id, String name, String email, String password, 
    int year, int month, int dayOfMonth)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar (year, month-1, dayOfMonth);
    }

    /**
     * Constructor untuk object class customer tanpa joinDate
     *
     * @param id
     * @param name
     * @param email
     * @param password
     */
    public Customer(int id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = Calendar.getInstance();
    }
    
    /**
     * Method getter untuk mendapatkan id pelanggan
     *
     * @return Isi variable id
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Method getter untuk mendapatkan nama pelanggan
     *
     * @return Isi variable name
     */
    public String getName()
    {
     return name;
    }
    
    /**
     * Method getter untuk mendapatkan email pelanggan
     *
     * @return Isi variable email
     */
    public String getEmail()
    {
     return email;
    }
    
    /**
     * Method getter untuk mendapatkan password pelanggan
     *
     * @return Isi variable password
     */
    public String getPassword()
    {
     return password;
    }
    
    /**
     * Method getter untuk mendapatkan tanggal registrasi pelanggan
     *
     * @return Isi variable joinDate
     */
    public Calendar getJoinDate()
    {
        return joinDate;
    }
    
    /**
     * Method setter untuk mengatur id pelanggan
     *
     * @param id
     */
    public void setId(int id)
    {
      this.id = id;  
    }
    
    /**
     * Method setter untuk mengatur nama pelanggan
     *
     * @param name
     */
    public void setName(String name)
    {
      this.name = name;
    }
    
    /**
     * Method setter untuk mengatur email pelanggan
     *
     * @param  email
     */
    public void setEmail(String email)
    {
        
        String regex = "^(?!\\.)(?!.*\\.$)(?!.*\\.\\.$)[\\w\\.&*_~]+@(.+)+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(email);
        if(match.find())
        {
            this.email = email;
        }
        else
        {
            this.email = "";
        }
    }
    
    /**
     * Method setter untuk mengatur password pelanggan
     *
     * @param  password
     */
    public void setPassword(String password)
    {
      String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z\\d]{6,}$";
      Pattern pattern = Pattern.compile(regex);
      Matcher match = pattern.matcher(password);
      if(match.find())
        {
            this.password = password;
        }
        else
        {
            this.password = "";
        } 
    }
    
    /**
     * Method setter untuk mengatur join date pelanggan
     *
     * @param  joinDate
     */
    public void setJoinDate(Calendar joinDate)
    {
      this.joinDate = joinDate; 
    }

    /**
     * Method setter untuk mengatur join date pelanggan
     *
     * @param year
     * @param month
     * @param dayOfMonth
     */
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
      this.joinDate = new GregorianCalendar (year, month-1, dayOfMonth);
    }
    
    /**
     * Method untuk print data pelanggan
     * @return data pelanggan berisi id, nama, email, password, dan join date
     *
     */
    public String toString()
    {
      String date = "";
      SimpleDateFormat simpleDate = new SimpleDateFormat("dd MMMM yyyy");
      if(getJoinDate() != null)
      {
          date = simpleDate.format(joinDate.getTime());
      }
      return "Id = "+getId()+"\nNama = "+getName()+"\nEmail = "+getEmail()+"\nPassword = "+getPassword()+"\nJoin Date = "+date+"\n";
    }
}

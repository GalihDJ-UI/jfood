package galih.jfood;
import java.util.*;
import java.util.regex.*; 
import java.text.*;

/**
 * Menyimpan data pelanggan.
 *
 * @author Galih Damar Jati
 * @version (27 Feb 2020)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String password;
    private Calendar joinDate;
    private String email;

    /**
     * Constructor for objects of class Customer
     *@param id
     *@param name
     *@param email
     *@param password
     *@param joinDate
     */
    public Customer(int id, String name, String email, String password, 
    Calendar joinDate)
    {
        // initialise instance variables
        setEmail(email);
        setPassword(password);
        this.id = id;
        this.name = name;
        this.joinDate = joinDate;
    }
    
    public Customer(int id, String name, String email, String password, 
    int year, int month, int dayOfMonth)
    {
        // initialise instance variables
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar (year, month-1, dayOfMonth);
    }
    
    public Customer(int id, String name, String email, String password)
    {
        // initialise instance variables
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = Calendar.getInstance();
    }
    
    /**
     * Digunakan untuk mendapatkan id pelanggan
     *
     * @return Isi variable id
     */
    public int getId()
    {
        // put your code here
        return id;
    }
    
    /**
     * Digunakan untuk mendapatkan nama pelanggan
     *
     * @return Isi variable name
     */
    public String getName()
    {
     return name;
    }
    
    /**
     * Digunakan untuk mendapatkan email pelanggan
     *
     * @return Isi variable email
     */
    public String getEmail()
    {
     return email;
    }
    
    /**
     * Digunakan untuk mendapatkan password pelanggan
     *
     * @return Isi variable password
     */
    public String getPassword()
    {
     return password;
    }
    
    /**
     * Digunakan untuk mendapatkan tanggal registrasi pelanggan
     *
     * @return Isi variable joinDate
     */
    public Calendar getJoinDate()
    {
        return joinDate;
    }
    
    /**
     * Mengatur value dari variable id
     *
     * @param  id dengan tipe data integer
     * @return Value pada parameter dimasukkan ke variable id
     */
    public void setId(int id)
    {
      this.id = id;  
    }
    
    /**
     * Mengatur value dari variable name
     *
     * @param  name dengan tipe data string
     * @return Value pada parameter dimasukkan ke variable name
     */
    public void setName(String name)
    {
      this.name = name;
    }
    
    /**
     * Mengatur value dari variable email
     *
     * @param  email dengan tipe data string
     * @return Value pada parameter dimasukkan ke variable email
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
     * Mengatur value dari variable password
     *
     * @param  password dengan tipe data string
     * @return Value pada parameter dimasukkan ke variable password
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
     * Mengatur value dari variable joinDate
     *
     * @param  joinDate dengan tipe data string
     * @return Value pada parameter dimasukkan ke variable joinDate
     */
    public void setJoinDate(Calendar joinDate)
    {
      this.joinDate = joinDate; 
    }
    
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
      this.joinDate = new GregorianCalendar (year, month-1, dayOfMonth);
    }
    
    /**
     * Untuk print data variable pada class ini
     *
     * @param  Variable dengan input dari salah satu method setter di atas
     * @return Isi dari variable yang ada. Tergantung pada variable apa yang dipanggil
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

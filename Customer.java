
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
    private String joinDate;
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
    public String getJoinDate()
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
      this.email = email; 
    }
    
    /**
     * Mengatur value dari variable password
     *
     * @param  password dengan tipe data string
     * @return Value pada parameter dimasukkan ke variable password
     */
    public void setPassword(String password)
    {
      this.password = password; 
    }
    
    /**
     * Mengatur value dari variable joinDate
     *
     * @param  joinDate dengan tipe data string
     * @return Value pada parameter dimasukkan ke variable joinDate
     */
    public void setJoinDate(String joinDate)
    {
      this.joinDate = joinDate; 
    }
    
    /**
     * Untuk print data variable pada class ini
     *
     * @param  Variable dengan input dari salah satu method setter di atas
     * @return Isi dari variable yang ada. Tergantung pada variable apa yang dipanggil
     */
    public void printData()
    {
      System.out.println(name);   
    }
}

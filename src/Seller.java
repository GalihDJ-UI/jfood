
/**
 * Menyimpan data penjual makanan.
 *
 * @author Galih Damar Jati
 * @version (27 Feb 2020)
 */
public class Seller
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    
    /**
     * Constructor for objects of class Customer
     *@param id
     *@param name
     *@param email
     *@param phoneNumber
     *@param location
     */
    public Seller(int id, String name, String email, String phoneNumber, 
    Location location)
    {
      this.id = id;
      this.name = name;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.location = location;
    }

    /**
     * Digunakan untuk mendapatkan id penjual
     *
     * @return Isi variable id
     */
    public int getId()
    {
        // put your code here
        return id;
    }
    
    /**
     * Digunakan untuk mendapatkan nama penjual
     *
     * @return Isi variable name
     */
    public String getName()
    {
     return name;
    }
    
    /**
     * Digunakan untuk mendapatkan email penjual
     *
     * @return Isi variable email
     */
    public String getEmail()
    {
     return email;
    }
    
    /**
     * Digunakan untuk mendapatkan nomor telepon penjual
     *
     * @return Isi variable phoneNumber
     */
    public String getPhoneNumber()
    {
     return phoneNumber;
    }
    
    /**
     * Digunakan untuk mendapatkan lokasi
     *
     * @return Isi variable location
     */
    public Location getLocation()
    {
     return location;
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
     * Mengatur value dari variable phoneNumber
     *
     * @param  phoneNumber dengan tipe data string
     * @return Value pada parameter dimasukkan ke variable phoneNumber
     */
    public void setPhoneNumber(String phoneNumber)
    {
     this.phoneNumber = phoneNumber;
    }
    
    /**
     * Mengatur value dari variable phoneNumber
     *
     * @param  phoneNumber dengan tipe data string
     * @return Value pada parameter dimasukkan ke variable phoneNumber
     */
    public void setLocation(Location location)
    {
     this.location = location;
    }
    
    /**
     * Untuk print data variable pada class ini
     *
     * @param  Variable dengan input dari salah satu method setter di atas
     * @return Isi dari variable yang ada. Tergantung pada variable apa yang dipanggil
     */
    //public void printData()
    //{
     //System.out.println(name);   
    //}
    public String toString()
    {
     return "Id = "+getId()+"\nNama = "+getName()+"\nPhone Number = "+getPhoneNumber()+"\nLocation = "+getLocation().getProvince();
    }
}

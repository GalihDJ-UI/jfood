package galih.jfood;
import java.util.*;
import java.util.regex.*; 
import java.text.*;
/**
 * Class yang menyimpan dan mengatur data yang dibutuhkan untuk cash invoice
 *
 * @author Galih Damar Jati
 * @version 29 Mei 2020
 */
public class CashInvoice extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cash;
    private int deliveryFee = 5000;

    /**
     * Constructor object class CashInvoice tanpa deliveryFee
     * @param id
     * @param foods
     * @param customer
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super(id, foods, customer);
    }

    /**
     * Constructor object class CashInvoice dengan deliveryFee
     * @param id
     * @param foods
     * @param customer
     * @param deliveryFee
     *
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer, int deliveryFee)
    {
        super(id, foods, customer);
        this.deliveryFee = deliveryFee;
    }

    /**
     * Method getter untuk mengambil tipe pembayaran
     *
     * @return isi variable PAYMENT_TYPE
     */
    public PaymentType getPaymentType()
    {
        // put your code here
        return PAYMENT_TYPE;
    }

    /**
     * Method getter ntuk mendapatkan delivery fee
     *
     * @return isi variable delivery fee
     */
    public int getDeliveryFee()
    {
        // put your code here
        return deliveryFee;
    }

    /**
     * Method setter untuk mengatur value variable delivery fee
     *
     */
    public void setDeliveryFee(int deliveryFee)
    {
        // put your code here
        this.deliveryFee = deliveryFee;
    }

    /**
     * Method setter untuk mengatur harga total
     *
     */
    public void setTotalPrice()
    {
        super.totalPrice = 0;
        for (Food foodList : getFoods())
        {
            super.totalPrice = super.totalPrice + foodList.getPrice();
        }
        super.totalPrice = super.totalPrice + deliveryFee;
    }

    //public void printData()
    //{
    //   System.out.println("=====INVOICE====="); 
    //   System.out.println("ID: "+getId());
    //   System.out.println("Food : "+getFood().getName());
    //   System.out.println("Date: "+getDate());
    //   System.out.println("Customer: "+getCustomer().getName());
    //   System.out.println("Delivery Fee: "+getDeliveryFee());
    //   System.out.println("Total Price: "+getTotalPrice());
    //   System.out.println("Status: "+getInvoiceStatus()); 
    //   System.out.println("Payment Type: "+getPaymentType());
    //}

    /**
     * Method untuk print data cash invoice
     *
     * @return isi variable string yang berisi invoice transaksi cash
     */
    public String toString()
    {
        String string = "";
        Date date = getDate().getTime();
        String timeNow = "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        timeNow = sdf.format(super.getDate().getTime());

        StringBuilder foods = new StringBuilder();
        for (Food foodList : getFoods())
        {
            foods.append(foodList.getName()).append(", ");
        }
        foods = new StringBuilder(foods.substring(0, foods.length() - 2));

        string = "\n==========INVOICE==========" +
                "\nID: " + super.getId() +
                "\nDate: " + timeNow +
                "\nFood: " + foods;

        if (deliveryFee > 0)
        {
            string = string + "\nDelivery Fee = " + deliveryFee;
        }
        string = string +
                "\nTotal Price: " + super.getTotalPrice() +
                "\nCustomer: " + super.getCustomer().getName() +
                "\nInvoice Status: " + getInvoiceStatus()+
                "\nPayment Type: " + PAYMENT_TYPE ;
        return string;
    }
}

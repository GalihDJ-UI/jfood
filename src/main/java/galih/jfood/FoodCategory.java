package galih.jfood;
/**
 * Enumeration class FoodCategory - write a description of the enum class here
 *
 * @author Galih Damar Jati
 * @version 5-Maret-2019
 */
public enum FoodCategory
{
  Beverages("Beverages"), Coffee("Coffee"), Western("Western"), Snacks("Snacks"), Rice("Rice"), Noodles("Noodles"), Bakery("Bakery"), Japanese("Japanese");
  private String category;

  /**
   * Mengatur value dari variable seller
   *
   * @return Value pada parameter dimasukkan ke variable seller
   */
  FoodCategory (String category)
  {
    this.category = category; 
  }

  /**
   * Mengatur value dari variable seller
   *
   * @return Value pada parameter dimasukkan ke variable seller
   */
  public String toString()
  {
    return category;
  }
}


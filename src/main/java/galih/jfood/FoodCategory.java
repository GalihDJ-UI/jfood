package galih.jfood;
/**
 * Class enum berisi kategori-kategori makanan yang ada
 *
 * @author Galih Damar Jati
 * @version 5-Maret-2019
 */
public enum FoodCategory
{
  Beverages("Beverages"), Coffee("Coffee"), Western("Western"), Snacks("Snacks"), Rice("Rice"), Noodles("Noodles"), Bakery("Bakery"), Japanese("Japanese");
  private String category;

  /**
   * Mengatur value dari variable category dengan salah satu kategori yang dibuat pada enum di atas
   * @param category
   *
   */
  FoodCategory (String category)
  {
    this.category = category; 
  }

  /**
   * Method untuk print data kategori makanan
   *
   * @return isi variable category
   */
  public String toString()
  {
    return category;
  }
}


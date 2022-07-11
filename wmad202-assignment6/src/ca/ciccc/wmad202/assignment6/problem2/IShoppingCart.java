package ca.ciccc.wmad202.assignment6.problem2;
import ca.ciccc.wmad202.assignment6.problem0.Product;
public interface IShoppingCart {
    Integer addItem(Product product);
    Float totalCart();
    void printProductOnCart();

    void printCart();
}

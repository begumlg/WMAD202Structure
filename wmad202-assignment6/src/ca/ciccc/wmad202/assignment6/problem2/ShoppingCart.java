package ca.ciccc.wmad202.assignment6.problem2;

import ca.ciccc.wmad202.assignment6.problem0.Product;

import java.util.ArrayList;

public class ShoppingCart implements IShoppingCart{
    private ArrayList<Product> products;

    public ShoppingCart(){
        this.products=new ArrayList<>();

    }
    @Override
    public Integer addItem(Product product) {
        this.products.add(product);
        return null;
    }

    @Override
    public Float totalCart() {
        float totalAmount=0;
        for (Product product : this.products) {
            totalAmount= product.getProductPrice() + totalAmount;
        }
        return totalAmount;
    }

    @Override
    public void printProductOnCart() {

    }

    @Override
    public void printCart() {
        for (Product product : this.products) {
            System.out.println(product.getProductName()+" == "+product.getProductPrice()+"$");
        }

    }
}

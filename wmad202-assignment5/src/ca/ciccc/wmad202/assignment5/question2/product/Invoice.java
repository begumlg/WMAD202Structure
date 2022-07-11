package ca.ciccc.wmad202.assignment5.question2.product;

import java.util.ArrayList;

public class Invoice {
    private double totalPrice;
    private ArrayList<Product> productList;

    public Invoice(){
        this.totalPrice = 0;
        this.productList = new ArrayList<Product>();
    }

    public void addProduct(Product item) { this.productList.add(item);
    }
    public double getTotalPrice(){
        for (Product item: productList){
            totalPrice = totalPrice + item.getPrice();
        }
        return totalPrice;
    }
    public void printInvoice(){
        for (Product item: productList){
            item.printProductInfo();
        }
        double totalPrice = getTotalPrice();
        System.out.println("Total Price: "+totalPrice);
    }
}

package ca.ciccc.wmad202.assignment5.question2.product;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void printProductInfo() { System.out.println("Name: "+this.name+" "+"Price: "+this.price);
}

    public double getPrice() {
        return price;
    }
}


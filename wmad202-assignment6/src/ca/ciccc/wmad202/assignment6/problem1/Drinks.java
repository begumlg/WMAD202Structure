package ca.ciccc.wmad202.assignment6.problem1;

import ca.ciccc.wmad202.assignment6.problem0.Product;

public class Drinks extends Product {

    private boolean isDrinkDiet;
    private int drinkSize;


    public Drinks(int productId, String productName, float productPrice, String productMadeInCountry,boolean isDrinkDiet,int drinkSize) {
        super(productId, productName, productPrice, productMadeInCountry

        );

        this.isDrinkDiet=isDrinkDiet;
        this.drinkSize=drinkSize;
    }
}

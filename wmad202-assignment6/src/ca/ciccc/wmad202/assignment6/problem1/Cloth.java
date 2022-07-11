package ca.ciccc.wmad202.assignment6.problem1;

import ca.ciccc.wmad202.assignment6.problem0.Product;

import java.util.ArrayList;

public class Cloth extends Product {

    private ArrayList<Material> clothMaterials;

    public Cloth(int productId, String productName, float productPrice, String productMadeInCountry,ArrayList<Material> clothMaterials) {
        super(productId, productName, productPrice, productMadeInCountry);

        this.clothMaterials=clothMaterials;
    }
    public ArrayList<Material> getMaterials() {
        return clothMaterials;
    }
    public void setMaterials(ArrayList<Material> materials) {
        this.clothMaterials = materials;
    }
}

package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[] {
                new Chocolate("bitter", 10.0, "çikolata" ),
                new Coke("cola", 20, "cola"),
                new Bread("buğday", 10, "tam buğday")
        };

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (int i =0; i< products.length; i++) {
            products[i].showDetails();
        }
    }
}
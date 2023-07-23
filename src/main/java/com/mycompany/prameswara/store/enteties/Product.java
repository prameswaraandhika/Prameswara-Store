package com.mycompany.prameswara.store.enteties;

public interface Product {

    int getId();

    String getProductName();

    String getCategoryName();

    double getPrice();

    void setPrice(double price);
}

package com.mycompany.prameswara.store.enteties;

import java.util.List;

public interface Cart {

    boolean isEmpty();

    void addProduct(Product productById);

    List<Product> getProducts();

    void clear();

}

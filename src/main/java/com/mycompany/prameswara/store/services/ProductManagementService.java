package com.mycompany.prameswara.store.services;

import java.util.List;

import com.mycompany.prameswara.store.enteties.Product;

public interface ProductManagementService {

    List<Product> getProducts();

    Product getProductById(int productIdToAddToCart);

}

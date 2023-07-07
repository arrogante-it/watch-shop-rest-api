package com.arroganteit.clockshop.service;

import com.arroganteit.clockshop.models.abstractClasses.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    List<Product> getProductsSortedByPrice();

    List<Product> getProductsSortedByColor();

    List<Product> getProductsSortedByDateOfReceipt();

    double getTotalCost();

    void addProduct(Product product);
}

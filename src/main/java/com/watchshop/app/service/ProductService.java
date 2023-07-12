package com.watchshop.app.service;

import com.watchshop.app.presentation.models.abstractClasses.AbstractProduct;

import java.util.List;

public interface ProductService {
    List<AbstractProduct> getAllProducts();

    List<AbstractProduct> getProductsSortedByPrice();

    List<AbstractProduct> getProductsSortedByColor();

    List<AbstractProduct> getProductsSortedByDateOfReceipt();

    double getTotalCost();

    void addProduct(AbstractProduct product);
}

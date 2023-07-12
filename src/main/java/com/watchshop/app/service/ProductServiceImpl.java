package com.watchshop.app.service;

import com.watchshop.app.presentation.models.abstractClasses.AbstractProduct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private List<AbstractProduct> products = new ArrayList<>();

    @Override
    public List<AbstractProduct> getAllProducts() {
        return products;
    }

    @Override
    public List<AbstractProduct> getProductsSortedByPrice() {
        List<AbstractProduct> sortedProducts = new ArrayList<>(products);
        Collections.sort(sortedProducts, Comparator.comparingDouble(AbstractProduct::getPrice));
        return sortedProducts;
    }

    @Override
    public List<AbstractProduct> getProductsSortedByColor() {
        List<AbstractProduct> sortedProduct = new ArrayList<>(products);
        Collections.sort(sortedProduct, Comparator.comparing(AbstractProduct::getColor));
        return sortedProduct;
    }

    @Override
    public List<AbstractProduct> getProductsSortedByDateOfReceipt() {
        List<AbstractProduct> sortedProduct = new ArrayList<>(products);
        Collections.sort(sortedProduct, Comparator.comparing(AbstractProduct::getDateOfReceipt));
        return sortedProduct;
    }

    @Override
    public double getTotalCost() {
        return products.stream().mapToDouble(AbstractProduct::getPrice).sum();
    }

    @Override
    public void addProduct(AbstractProduct product) {
        products.add(product);
    }
}

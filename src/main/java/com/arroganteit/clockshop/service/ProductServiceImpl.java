package com.arroganteit.clockshop.service;

import com.arroganteit.clockshop.models.abstractClasses.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public List<Product> getProductsSortedByPrice() {
        List<Product> sortedProducts = new ArrayList<>(products);
        Collections.sort(sortedProducts, Comparator.comparingDouble(Product::getPrice));
        return sortedProducts;
    }

    @Override
    public List<Product> getProductsSortedByColor() {
        List<Product> sortedProduct = new ArrayList<>(products);
        Collections.sort(sortedProduct, Comparator.comparing(Product::getColor));
        return sortedProduct;
    }

    @Override
    public List<Product> getProductsSortedByDateOfReceipt() {
        List<Product> sortedProduct = new ArrayList<>(products);
        Collections.sort(sortedProduct, Comparator.comparing(Product::getDateOfReceipt));
        return sortedProduct;
    }

    @Override
    public double getTotalCost() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }
}

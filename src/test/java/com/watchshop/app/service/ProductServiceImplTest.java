package com.watchshop.app.service;

import com.watchshop.app.presentation.models.abstractClasses.AbstractProduct;
import com.watchshop.app.presentation.models.subClasses.Clock;
import com.watchshop.app.presentation.models.subClasses.Watch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ProductServiceImplTest {

    private ProductService productService;

    @BeforeEach
    public void setup() {
        productService = new ProductServiceImpl();
    }

    @Test
    public void testGetAllProducts() {
        Watch watch = new Watch(100.0, "Black", LocalDate.now(), "Brand 1");
        Clock clock = new Clock(150.0, "Silver",  LocalDate.now(), "Style 1");
        productService.addProduct(watch);
        productService.addProduct(clock);

        List<AbstractProduct> products = productService.getAllProducts();

        Assertions.assertEquals(2, products.size());
        Assertions.assertTrue(products.containsAll(Arrays.asList(watch, clock)));
    }

    @Test
    public void testGetProductsSortedByPrice() {
        Watch watch1 = new Watch(150.0, "Black", LocalDate.now(), "Brand 1");
        Watch watch2 = new Watch(100.0, "Silver",  LocalDate.now(), "Brand 2");
        productService.addProduct(watch1);
        productService.addProduct(watch2);

        List<AbstractProduct> sortedProducts = productService.getProductsSortedByPrice();

        Assertions.assertEquals(2, sortedProducts.size());
        Assertions.assertEquals(watch2, sortedProducts.get(0));
        Assertions.assertEquals(watch1, sortedProducts.get(1));
    }

    @Test
    public void testGetProductsSortedByColor() {
        Clock clock1 = new Clock(100.0, "Silver",  LocalDate.now(), "Style 1");
        Clock clock2 = new Clock(150.0, "Black",  LocalDate.now(), "Style 2");
        productService.addProduct(clock1);
        productService.addProduct(clock2);

        List<AbstractProduct> sortedProducts = productService.getProductsSortedByColor();

        Assertions.assertEquals(2, sortedProducts.size());
        Assertions.assertEquals(clock2, sortedProducts.get(0));
        Assertions.assertEquals(clock1, sortedProducts.get(1));
    }

    @Test
    public void testGetTotalCost() {
        Watch watch = new Watch(100.0, "Black",  LocalDate.now(), "Brand 1");
        Clock clock = new Clock(150.0, "Silver",  LocalDate.now(), "Style 1");
        productService.addProduct(watch);
        productService.addProduct(clock);

        double totalCost = productService.getTotalCost();

        Assertions.assertEquals(250.0, totalCost);
    }
}
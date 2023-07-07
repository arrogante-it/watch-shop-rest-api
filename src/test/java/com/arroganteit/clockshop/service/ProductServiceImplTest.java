package com.arroganteit.clockshop.service;

import com.arroganteit.clockshop.models.abstractClasses.Product;
import com.arroganteit.clockshop.models.subClasses.Clock;
import com.arroganteit.clockshop.models.subClasses.Watch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ProductServiceImplTest {

    private ProductServiceImpl productService;

    @BeforeEach
    public void setup() {
        productService = new ProductServiceImpl();
    }

    @Test
    public void testGetAllProducts() {
        // Arrange
        Watch watch = new Watch(100.0, "Black", LocalDate.now(), "Brand 1");
        Clock clock = new Clock(150.0, "Silver",  LocalDate.now(), "Style 1");
        productService.addProduct(watch);
        productService.addProduct(clock);

        // Act
        List<Product> products = productService.getAllProducts();

        // Assert
        Assertions.assertEquals(2, products.size());
        Assertions.assertTrue(products.containsAll(Arrays.asList(watch, clock)));
    }

    @Test
    public void testGetProductsSortedByPrice() {
        // Arrange
        Watch watch1 = new Watch(150.0, "Black", LocalDate.now(), "Brand 1");
        Watch watch2 = new Watch(100.0, "Silver",  LocalDate.now(), "Brand 2");
        productService.addProduct(watch1);
        productService.addProduct(watch2);

        // Act
        List<Product> sortedProducts = productService.getProductsSortedByPrice();

        // Assert
        Assertions.assertEquals(2, sortedProducts.size());
        Assertions.assertEquals(watch2, sortedProducts.get(0));
        Assertions.assertEquals(watch1, sortedProducts.get(1));
    }

    @Test
    public void testGetProductsSortedByColor() {
        // Arrange
        Clock clock1 = new Clock(100.0, "Silver",  LocalDate.now(), "Style 1");
        Clock clock2 = new Clock(150.0, "Black",  LocalDate.now(), "Style 2");
        productService.addProduct(clock1);
        productService.addProduct(clock2);

        // Act
        List<Product> sortedProducts = productService.getProductsSortedByColor();

        // Assert
        Assertions.assertEquals(2, sortedProducts.size());
        Assertions.assertEquals(clock2, sortedProducts.get(0));
        Assertions.assertEquals(clock1, sortedProducts.get(1));
    }

    @Test
    public void testGetTotalCost() {
        // Arrange
        Watch watch = new Watch(100.0, "Black",  LocalDate.now(), "Brand 1");
        Clock clock = new Clock(150.0, "Silver",  LocalDate.now(), "Style 1");
        productService.addProduct(watch);
        productService.addProduct(clock);

        // Act
        double totalCost = productService.getTotalCost();

        // Assert
        Assertions.assertEquals(250.0, totalCost);
    }
}
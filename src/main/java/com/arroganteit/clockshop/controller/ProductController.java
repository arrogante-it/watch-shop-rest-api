package com.arroganteit.clockshop.controller;

import com.arroganteit.clockshop.models.abstractClasses.Product;
import com.arroganteit.clockshop.models.subClasses.Clock;
import com.arroganteit.clockshop.models.subClasses.Watch;
import com.arroganteit.clockshop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/sort/price")
    public List<Product> getProductsSortedByPrice() {
        return productService.getProductsSortedByPrice();
    }

    @GetMapping("/sort/color")
    public List<Product> getProductSortedByColor() {
        return productService.getProductsSortedByColor();
    }

    @GetMapping("/sort/dateOfReceipt")
    public List<Product> getProductSortedByDateOfReceipt() {
        return productService.getProductsSortedByDateOfReceipt();
    }

    @GetMapping("/totalCost")
    public double getTotalCost() {
        return productService.getTotalCost();
    }

    @PostMapping("/watch")
    public void addWatch(@RequestBody Watch watch){
        productService.addProduct(watch);
    }

    @PostMapping("/clock")
    public void addClock(@RequestBody Clock clock) {
        productService.addProduct(clock);
    }


}

































































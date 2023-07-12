package com.watchshop.app.presentation.controller;

import com.watchshop.app.presentation.models.subClasses.Clock;
import com.watchshop.app.presentation.models.subClasses.Watch;
import com.watchshop.app.presentation.models.abstractClasses.AbstractProduct;
import com.watchshop.app.service.ProductService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("${application.endpoint.products}")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<AbstractProduct> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/sort/price")
    public List<AbstractProduct> getProductsSortedByPrice() {
        return productService.getProductsSortedByPrice();
    }

    @GetMapping("/sort/color")
    public List<AbstractProduct> getProductSortedByColor() {
        return productService.getProductsSortedByColor();
    }

    @GetMapping("/sort/dateOfReceipt")
    public List<AbstractProduct> getProductSortedByDateOfReceipt() {
        return productService.getProductsSortedByDateOfReceipt();
    }

    @GetMapping("/totalCost")
    public double getTotalCost() {
        return productService.getTotalCost();
    }

    @PostMapping("/watch")
    public void addWatch(@RequestBody Watch watch) {
        productService.addProduct(watch);
    }

    @PostMapping("/clock")
    public void addClock(@RequestBody Clock clock) {
        productService.addProduct(clock);
    }
}

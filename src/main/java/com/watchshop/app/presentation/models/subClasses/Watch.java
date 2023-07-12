package com.watchshop.app.presentation.models.subClasses;

import com.watchshop.app.presentation.models.abstractClasses.AbstractProduct;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Watch extends AbstractProduct {
    private String brand;

    public Watch(double price, String color, LocalDate dateOfReceipt, String brand) {
        super(price, color, dateOfReceipt);
        this.brand = brand;
    }
}

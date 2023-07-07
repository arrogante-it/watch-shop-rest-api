package com.arroganteit.clockshop.models.subClasses;

import com.arroganteit.clockshop.models.abstractClasses.Product;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Watch extends Product {

    private String brand;

    public Watch(double price, String color, LocalDate dateOfReceipt, String brand) {
        super(price, color, dateOfReceipt);
        this.brand = brand;
    }
}

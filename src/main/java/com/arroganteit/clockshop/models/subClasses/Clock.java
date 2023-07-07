package com.arroganteit.clockshop.models.subClasses;

import com.arroganteit.clockshop.models.abstractClasses.Product;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Clock extends Product {

    private String style;

    public Clock(double price, String color, LocalDate dateOfReceipt, String style) {
        super(price, color, dateOfReceipt);
        this.style = style;
    }
}

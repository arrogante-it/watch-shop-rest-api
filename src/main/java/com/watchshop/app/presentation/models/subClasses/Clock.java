package com.watchshop.app.presentation.models.subClasses;

import com.watchshop.app.presentation.models.abstractClasses.AbstractProduct;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class Clock extends AbstractProduct {
    private String style;

    public Clock(double price, String color, LocalDate dateOfReceipt, String style) {
        super(price, color, dateOfReceipt);
        this.style = style;
    }
}

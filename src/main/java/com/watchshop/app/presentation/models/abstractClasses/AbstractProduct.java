package com.watchshop.app.presentation.models.abstractClasses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public abstract class AbstractProduct {
    private double price;

    private String color;

    private LocalDate dateOfReceipt;
}

package com.arroganteit.clockshop.models.abstractClasses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public abstract class Product {

    private double price;

    private String color;

    private LocalDate dateOfReceipt;
}

package com.watchshop.app.presentation.models.abstractClasses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
@Builder
public abstract class AbstractProduct {
    private double price;

    private String color;

    private LocalDate dateOfReceipt;
}

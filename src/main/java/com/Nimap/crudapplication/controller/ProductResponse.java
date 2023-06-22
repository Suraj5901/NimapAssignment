package com.Nimap.crudapplication.controller;

import com.Nimap.crudapplication.model.Category;
import com.Nimap.crudapplication.model.Product;

public class ProductResponse {
    private Product product;
    private Category category;

    public ProductResponse(Product product, Category category) {
        this.product = product;
        this.category = category;
    }

    // Getters and setters
}

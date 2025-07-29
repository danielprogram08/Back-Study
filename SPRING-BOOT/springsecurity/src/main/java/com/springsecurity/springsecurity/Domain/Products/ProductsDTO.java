package com.springsecurity.springsecurity.Domain.Products;

public record ProductsDTO (Products products) {

    public Products convert() {
        Products Products = new Products();
        Products.setName(products.getName());
        Products.setPrice(products.getPrice());
        return products;
    }
}
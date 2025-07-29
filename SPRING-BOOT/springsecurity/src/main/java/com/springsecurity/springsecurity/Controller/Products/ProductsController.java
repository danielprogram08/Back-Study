package com.springsecurity.springsecurity.Controller.Products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.springsecurity.Domain.Products.ProductsDTO;
import com.springsecurity.springsecurity.Service.Products.ProductsService;

@RestController
@RequestMapping("/Products")
public class ProductsController {
    
    @Autowired
    ProductsService service;

    @PostMapping("/Register")
    public ResponseEntity<ProductsDTO> RegisterProduct (@RequestBody ProductsDTO data) {
        ProductsDTO SaveProduct = service.RegisterProduct(data);
        return ResponseEntity.ok(SaveProduct);
    }
}
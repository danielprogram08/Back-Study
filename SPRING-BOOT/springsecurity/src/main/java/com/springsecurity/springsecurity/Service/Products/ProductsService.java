package com.springsecurity.springsecurity.Service.Products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springsecurity.springsecurity.Domain.Products.Products;
import com.springsecurity.springsecurity.Domain.Products.ProductsDTO;
import com.springsecurity.springsecurity.Repository.Products.ProductsRepository;


@Service
public class ProductsService {

    @Autowired
    private ProductsRepository repository;
    
    @Transactional(readOnly = true)
    public ProductsDTO RegisterProduct (ProductsDTO data) {
        try {
            Products saveProduct = data.products();
            ProductsDTO product = new ProductsDTO(saveProduct);
            repository.save(saveProduct);
            return product;
        } catch (Exception e) {
            System.out.println("Erro ao Cadastrar produto!");
            return null;
        }
    }
}
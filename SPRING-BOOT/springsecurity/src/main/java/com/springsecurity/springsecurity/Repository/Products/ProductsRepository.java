package com.springsecurity.springsecurity.Repository.Products;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.springsecurity.Domain.Products.Products;

public interface ProductsRepository extends JpaRepository<Products, Long>{

}
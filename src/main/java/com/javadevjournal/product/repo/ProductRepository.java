package com.javadevjournal.product.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.datasources.product.data.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel,Integer> {
}
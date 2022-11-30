package com.spring.datasources.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.datasources.customer.data.CustomerModel;

@Repository
public interface CustomerRepository extends JpaRepository < CustomerModel, Integer > {
}
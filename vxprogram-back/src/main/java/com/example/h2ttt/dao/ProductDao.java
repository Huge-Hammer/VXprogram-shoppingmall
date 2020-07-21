package com.example.h2ttt.dao;

import com.example.h2ttt.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {
}
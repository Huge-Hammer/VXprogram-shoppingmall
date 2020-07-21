package com.example.h2ttt.entity;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface Productservice {
    List<Product> getALL();
    /**
     * 保存用户对象
     * @param product
     */
    void save(Product product);

    void delete(Integer id);

    void saveAll(Product product);
}

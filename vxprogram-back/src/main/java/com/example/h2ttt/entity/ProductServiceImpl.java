package com.example.h2ttt.entity;

import com.example.h2ttt.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.h2ttt.entity.Productservice;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductServiceImpl {
    @Autowired
    ProductDao productDao;


    public List<Product> getALL(){
        return productDao.findAll();
    }
    public void save(Product product){productDao.save(product);}
    public void delete(Integer id){productDao.deleteById(id);}
}

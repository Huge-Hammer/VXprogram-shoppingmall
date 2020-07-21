package com.example.h2ttt.controller;

import com.alibaba.fastjson.JSON;
import com.example.h2ttt.entity.Pic;
import com.example.h2ttt.entity.PicServiceImpl;
import com.example.h2ttt.entity.Product;
import com.example.h2ttt.entity.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class wxcontroller {

    @Autowired
    private PicServiceImpl Picservice;
    @RequestMapping("/pic")
    public String returnpic(){
        List<Pic> pics= Picservice.getALL();
        return JSON.toJSONString(pics);
    }

    @Autowired
    private ProductServiceImpl Productservice;
    @RequestMapping("/product")
    public String returnproduct(){
        List<Product> products= Productservice.getALL();
        return JSON.toJSONString(products);
    }

}

package com.example.h2ttt.controller;

import com.example.h2ttt.entity.Product;
import com.example.h2ttt.entity.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class h2controller {
    @Autowired
    private ProductServiceImpl Productservice;
    @RequestMapping("/index")
    public String index(Model model){
        List<Product> products= Productservice.getALL();
        model.addAttribute("products",products);
        return "index";
    }

    @RequestMapping("/Add")
    public String add(Model model) {
        model.addAttribute("subject", "请输入要添加的商品名称");
        model.addAttribute("coverpath", "请输入要添加的商品图片路径");
        model.addAttribute("price", "请输入要添加的商品价格");
        model.addAttribute("message", "请输入要添加的商品信息");
        return "Add";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(Product product) {
        Productservice.save(product);
        return "save product success !";
    }

    @RequestMapping("/delete")
    public String delete(Model model){
        model.addAttribute("id","请输入要删除的商品id");
        return "Delete";
    }

    @RequestMapping("/dodel")
    @ResponseBody
    public String del(Integer id){
        Productservice.delete(id);
        return "delete product success";
    }

}

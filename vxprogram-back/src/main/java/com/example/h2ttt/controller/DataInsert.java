package com.example.h2ttt.controller;

import com.example.h2ttt.dao.PicDao;
import com.example.h2ttt.dao.ProductDao;
import com.example.h2ttt.entity.Pic;
import com.example.h2ttt.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DataInsert {
    //插入一条数据
    /*@Resource
    PicDao picinsert;
    @RequestMapping("/picinsert")
    String ttt(){
        Pic t=new Pic();
        t.setPicurl("aa");
        t.setPicurl("bb");
        picinsert.save(t);
        return "FINISH";
    }*/

    //批量插入三条图片数据
    @Autowired
    PicDao picDao;


    @RequestMapping("/picinsert")
    public String insertpic(){
        Pic pic1=new Pic();
        pic1.setPicurl("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1883407862,2324763758&fm=26&gp=0.jpg");
        Pic pic2=new Pic();
        pic2.setPicurl("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2409989747,3786737157&fm=26&gp=0.jpg");
        Pic pic3=new Pic();
        pic3.setPicurl("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=344882939,3198581346&fm=26&gp=0.jpg");
        List<Pic> pics= Arrays.asList(pic1,pic2,pic3);
        picDao.saveAll(pics);
        return "insert pics success";
    }


    @Autowired
    ProductDao productDao;

    @RequestMapping("/productinsert")
    public String insertproduct(){
        Product product1=new Product();
        product1.setSubject("恩希玛");
        product1.setCoverpath("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=659606990,4153315840&fm=26&gp=0.jpg");
        product1.setPrice(10);
        product1.setMessage("于老师手工制作");

        Product product2=new Product();
        product2.setSubject("打屎棒");
        product2.setCoverpath("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1558787118,782205535&fm=26&gp=0.jpg");
        product2.setPrice(988);
        product2.setMessage("保密交易！不可外传");

        Product product3=new Product();
        product3.setSubject("野鸡");
        product3.setCoverpath("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2701417504,4021536824&fm=26&gp=0.jpg ");
        product3.setPrice(200);
        product3.setMessage("想吃进屋来");

        Product product4=new Product();
        product4.setSubject("于老师家的碗");
        product4.setCoverpath("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1462486430,3841791853&fm=26&gp=0.jpg");
        product4.setPrice(7500000);
        product4.setMessage("限量版！微波炉专用");

        Product product5=new Product();
        product5.setSubject("琥珀鹿");
        product5.setCoverpath("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=439811656,1418917510&fm=15&gp=0.jpg");
        product5.setPrice(18888);
        product5.setMessage("限量版！仅此一只");

        Product product6=new Product();
        product6.setSubject("谦嫂亲手织的毛线裤衩");
        product6.setCoverpath("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3788607607,2380685280&fm=26&gp=0.jpg");
        product6.setPrice(298);
        product6.setMessage("商家承诺：保证您撒泡尿都40多度");

        List<Product> products= Arrays.asList(product1,product2,product3,product4,product5,product6);
        productDao.saveAll(products);
        return "insert products success";
    }


}

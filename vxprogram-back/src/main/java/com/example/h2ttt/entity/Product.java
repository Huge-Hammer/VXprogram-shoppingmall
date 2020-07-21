package com.example.h2ttt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "product")
public class Product {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    int id;
    String subject;
    String coverpath;
    int price;
    String message;


    public String getSubject() {return subject;}
    public void setSubject(String subject){this.subject = subject;}
    public String getCoverpath(){return coverpath;}
    public void setCoverpath(String coverpath){this.coverpath = coverpath;}
    public int getPrice(){return price;}
    public void setPrice(int price){this.price = price;}
    public String getMessage(){return message;}
    public void setMessage(String message){this.message = message;}
    public int getId(){return id;}
    public void setId(int id){this.id = id;}
}

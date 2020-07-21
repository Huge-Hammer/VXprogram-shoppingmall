package com.example.h2ttt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "lunbopic")
public class Pic {
    @Id
    String picurl;

    public String getPicurl() {return picurl;}

    public void setPicurl(String picurl){this.picurl = picurl;}

}

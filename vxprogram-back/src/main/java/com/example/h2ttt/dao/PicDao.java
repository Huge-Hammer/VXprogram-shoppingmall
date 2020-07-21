package com.example.h2ttt.dao;

import com.example.h2ttt.entity.Pic;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PicDao extends JpaRepository<Pic, Integer> {

}
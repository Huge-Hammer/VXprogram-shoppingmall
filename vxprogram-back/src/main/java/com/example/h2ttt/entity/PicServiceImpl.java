package com.example.h2ttt.entity;

import com.example.h2ttt.dao.PicDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PicServiceImpl {
    @Autowired
    PicDao picDao;

    public List<Pic> getALL(){
        return picDao.findAll();
    }
    public void save(Pic pic){picDao.save(pic);}
}

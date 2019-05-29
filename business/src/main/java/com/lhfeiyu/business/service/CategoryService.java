package com.lhfeiyu.business.service;

import org.springframework.stereotype.Service;

/**
 * @author:wangaimin
 * @date:2019/5/21 22:30
 * @description:
 */
@Service
public class CategoryService {
    public String Find(long sysNo){
        return "Hello category "+sysNo;
    }
}

package com.lhfeiyu.api.controller;

import com.lhfeiyu.business.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:Gene.A.Wang
 * @date:2019/5/21
 * @time:11:45
 */
@RestController
@Api(value = "分类相关接口",description = "提供分类相关Rest API",tags = "分类相关接口")
@RequestMapping("Category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping("Test")
    public String Test(){
        return "hello world";
    }

    @ApiOperation(value = "获取分类",tags = "分类相关接口")
    @GetMapping(value="Find/{sysNo}")
    public String Find(@PathVariable("sysNo") long sysNo){
        return categoryService.Find(sysNo);
    }


}

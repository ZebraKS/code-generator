package com.ll.codegenerator.controller;

import com.ll.codegenerator.entity.User;
import com.ll.codegenerator.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * @Author Li Shuai
 * @Date 2020/9/15 9:51
 * @Description
 * @Version 1.0
 */
@Controller
public class DemoController {

    @Autowired
    GeneratorService generatorService;

    @RequestMapping("/index")
    @ResponseBody
    public List<Map<String, String>> index(String name){
        List<Map<String, String>> maps = generatorService.queryColumns(name);
        return maps;
    }

    @RequestMapping("/queryTable")
    @ResponseBody
    public Object queryTable(String tableName){
        return generatorService.queryTable(tableName);
    }
}
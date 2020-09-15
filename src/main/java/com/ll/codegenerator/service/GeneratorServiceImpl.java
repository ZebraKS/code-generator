package com.ll.codegenerator.service;

import com.ll.codegenerator.mapper.GeneratorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author Li Shuai
 * @Date 2020/9/15 10:43
 * @Description
 * @Version 1.0
 */
@Service
public class GeneratorServiceImpl implements GeneratorService{

    @Autowired
    private GeneratorMapper generatorMapper;

    @Override
    public List<Map<String, Object>> queryList(Map<String, Object> map) {
        return generatorMapper.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return generatorMapper.queryTotal(map);
    }

    @Override
    public Map<String, String> queryTable(String tableName) {
        return generatorMapper.queryTable(tableName);
    }

    @Override
    public List<Map<String, String>> queryColumns(String tableName) {
        return generatorMapper.queryColumns(tableName);
    }
}

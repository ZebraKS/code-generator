package com.ll.codegenerator.service;

import java.util.List;
import java.util.Map;

/**
 * @Author Li Shuai
 * @Date 2020/9/15 10:42
 * @Description
 * @Version 1.0
 */
public interface GeneratorService {

    List<Map<String, Object>> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    Map<String, String> queryTable(String tableName);

    List<Map<String, String>> queryColumns(String tableName);
}

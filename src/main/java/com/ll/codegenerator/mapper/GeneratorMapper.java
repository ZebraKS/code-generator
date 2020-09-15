package com.ll.codegenerator.mapper;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器
 *
 * @author suny
 */
public interface GeneratorMapper {

	/**
	 * 查询建表信息，分页
	 * @param map
	 * @return
	 */
	List<Map<String, Object>> queryList(Map<String, Object> map);

	/**
	 * 查询数据库有多少表
	 * @param map
	 * @return
	 */
	int queryTotal(Map<String, Object> map);

	/**
	 * 根据表名，查询建表信息
	 * @param tableName
	 * @return
	 */
	Map<String, String> queryTable(String tableName);

	/**
	 * 根据表名，查询表字段
	 * @param tableName
	 * @return
	 */
	List<Map<String, String>> queryColumns(String tableName);
}

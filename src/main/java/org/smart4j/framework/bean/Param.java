package org.smart4j.framework.bean;

import java.util.List;
import java.util.Map;

import org.smart4j.chapter2.util.CollectionUtil;
import org.smart4j.framework.util.CastUtil;

public class Param {
	
	private List<FormParam> formParamList;
	private List<FileParam> fileParamList;
	
	public Param(List<FormParam> formParamList){
		this.formParamList = formParamList;
	}
	
	public Param(List<FormParam> formParamList,List<FileParam> fileParamList){
		this.fileParamList = fileParamList;
		this.formParamList = formParamList;
	}
	
	/**
	 * 获取请求参数映射
	 */
	
	
}

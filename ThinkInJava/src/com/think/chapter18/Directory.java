package com.think.chapter18;

import java.io.File;

/**
 * 
 * 类名称: Directory.
 * <p/>  
 * 类描述:练习4,使用Directory.walk()来计算在目录中所有名字与特定的正则表达式相匹配的文件尺寸综合
 * <p/>
 * 创建者: shengtianbanzi 
 * <p/>
 * 创建时间: 2017-6-13 下午10:24:41
 * <p/>
 */
public class Directory {

	private String filepath;
	
	private String spliter;
	
	public Directory(String filepath,String spliter){
		
		this.filepath = filepath;
		this.spliter  = spliter;
	}
	
	public long walk(){
		
		File file = new File(filepath);
		
		File[] files = file.listFiles();
		
		long size = 0;
		
		for (File file2 : files) {
			
			if (file2.getName().matches(spliter)) {
				size += 1;
			}
			
		}
		
		return size;
	}
}

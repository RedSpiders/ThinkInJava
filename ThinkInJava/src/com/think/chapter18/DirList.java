package com.think.chapter18;

import java.io.File;

import javax.management.loading.PrivateClassLoader;

/**
 * 
 * 类名称: DirList.
 * <p/>  
 * 类描述:练习3
 * <p/>
 * 创建者: shengtianbanzi 
 * <p/>
 * 创建时间: 2017-6-13 下午9:15:24
 * <p/>
 */
public class DirList {

	private String filename;
	
	public DirList(String filename){
		this.filename = filename;
	}
	
	public long conSizeFile(){
		
		long len = 0;
		
		File file = new File(filename);
		
		File[] files = file.listFiles();
		
		for (File file2 : files) {
			
			len += file2.length();
			
		}
		
		return len;
	}
	
}

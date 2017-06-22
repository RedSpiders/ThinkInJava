package com.think.chapter18;

import java.io.File;

/**
 * 
 * ������: Directory.
 * <p/>  
 * ������:��ϰ4,ʹ��Directory.walk()��������Ŀ¼�������������ض���������ʽ��ƥ����ļ��ߴ��ۺ�
 * <p/>
 * ������: shengtianbanzi 
 * <p/>
 * ����ʱ��: 2017-6-13 ����10:24:41
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

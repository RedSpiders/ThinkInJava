package com.think.chapter18;

import java.io.File;

import javax.management.loading.PrivateClassLoader;

/**
 * 
 * ������: DirList.
 * <p/>  
 * ������:��ϰ3
 * <p/>
 * ������: shengtianbanzi 
 * <p/>
 * ����ʱ��: 2017-6-13 ����9:15:24
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

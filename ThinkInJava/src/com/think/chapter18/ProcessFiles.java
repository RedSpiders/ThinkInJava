package com.think.chapter18;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * 类名称: ProcessFiles.
 * <p/>  
 * 类描述:练习6：使用ProcessFiles来查找在某个特定目录子树下的所有在某个特定日期之后进行过修改的java源代码文件
 * <p/>
 * 创建者: shengtianbanzi 
 * <p/>
 * 创建时间: 2017-6-18 上午10:32:53
 * <p/>
 */
public class ProcessFiles {

	private String filepath;
	
	public ProcessFiles(String filepath) {
		this.filepath = filepath;
	}
	
	public void getFileEndDate(){
		
		File[]  files = new File(filepath).listFiles();
		
		//获得昨天的long型日期数据
		Date date = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(calendar.DATE, -1);
		date = calendar.getTime();
		long datetime = date.getTime();
		
		
		for (File file : files) {
			
			long updatetime = file.lastModified();
			
			if (updatetime >= datetime) {
				System.out.println(file.getName());
			}
			
		}
	}
}

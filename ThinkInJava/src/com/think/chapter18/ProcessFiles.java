package com.think.chapter18;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * ������: ProcessFiles.
 * <p/>  
 * ������:��ϰ6��ʹ��ProcessFiles��������ĳ���ض�Ŀ¼�����µ�������ĳ���ض�����֮����й��޸ĵ�javaԴ�����ļ�
 * <p/>
 * ������: shengtianbanzi 
 * <p/>
 * ����ʱ��: 2017-6-18 ����10:32:53
 * <p/>
 */
public class ProcessFiles {

	private String filepath;
	
	public ProcessFiles(String filepath) {
		this.filepath = filepath;
	}
	
	public void getFileEndDate(){
		
		File[]  files = new File(filepath).listFiles();
		
		//��������long����������
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

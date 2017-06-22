package com.think.chapter18;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 
 * ������: SortedDirList.
 * <p/>  
 * ������:��ϰ2
 * <p/>
 * ������: shengtianbanzi 
 * <p/>
 * ����ʱ��: 2017-6-13 ����9:18:03
 * <p/>
 */
public class SortedDirList {

	public String filepath = "";
	
	/**
	 * 
	 * ���캯������������������д���췽������xxxx���ã�һ�����ڳ�ʼ������ʹ��.
	 * <p/>
	 * @param filepath  
	 * <p/> 
	 * �����ߣ�shengtianbanzi
	 * <p/> 
	 * ����ʱ�䣺2017-6-13 ����9:18:20
	 */
	public SortedDirList(String filepath){
		
		this.filepath = filepath;
		
		File file = new File(filepath);
		file.mkdir();
		if (file.isDirectory()) {
			String[] filenames = file.list();
			Arrays.sort(filenames, String.CASE_INSENSITIVE_ORDER);
			for (String string : filenames) {
				System.out.println(string);
			}
		}
	}
	
	/**
	 * 
	 * ��������������list����,���������б�.
	 * <p/>
	 * @param file
	 * @return  
	 * <p/>
	 * �����ߣ�shengtianbanzi
	 * <p/> 
	 * ����ʱ�䣺2017-6-13 ����9:18:30
	 */
	public List<String> list(File file){
		
		String[] filenames = file.list();
		
		List<String> fileList = new ArrayList<String>();
		
		for (String string : filenames) {
			fileList.add(string);
		}
		
		return fileList;
	}
	
	/**
	 * 
	 * ��������������list�����������������ƥ����б��Ӽ�.
	 * <p/>
	 * @param file
	 * @param reg
	 * @return  
	 * <p/>
	 * �����ߣ�shengtianbanzi
	 * <p/> 
	 * ����ʱ�䣺2017-6-13 ����9:18:51
	 */
	public List<String> list(File file,String reg){
		
		List<String> fileList = new ArrayList<String>();
		
		String[] filenames = file.list();
		
		for (String string : filenames) {
			
			if (string == reg) {
				fileList.add(string);
			}
		}
		
		return fileList;
	}
	
	
	
}

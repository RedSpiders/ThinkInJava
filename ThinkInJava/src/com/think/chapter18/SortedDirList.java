package com.think.chapter18;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 
 * 类名称: SortedDirList.
 * <p/>  
 * 类描述:练习2
 * <p/>
 * 创建者: shengtianbanzi 
 * <p/>
 * 创建时间: 2017-6-13 下午9:18:03
 * <p/>
 */
public class SortedDirList {

	public String filepath = "";
	
	/**
	 * 
	 * 构造函数描述：请在这里填写构造方法具有xxxx作用，一般用于初始化参数使用.
	 * <p/>
	 * @param filepath  
	 * <p/> 
	 * 创建者：shengtianbanzi
	 * <p/> 
	 * 创建时间：2017-6-13 下午9:18:20
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
	 * 方法描述：重载list方法,产生整个列表.
	 * <p/>
	 * @param file
	 * @return  
	 * <p/>
	 * 创建者：shengtianbanzi
	 * <p/> 
	 * 创建时间：2017-6-13 下午9:18:30
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
	 * 方法描述：重载list方法，产生与参数相匹配的列表子集.
	 * <p/>
	 * @param file
	 * @param reg
	 * @return  
	 * <p/>
	 * 创建者：shengtianbanzi
	 * <p/> 
	 * 创建时间：2017-6-13 下午9:18:51
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

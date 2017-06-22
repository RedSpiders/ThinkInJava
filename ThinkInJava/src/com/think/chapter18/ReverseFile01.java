package com.think.chapter18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 类名称: ReverseFile01.
 * <p/>  
 * 类描述:请在这里填写该类具有xxxx作用
 * <p/>
 * 创建者: shengtianbanzi 
 * <p/>
 * 创建时间: 2017-6-18 下午5:35:35
 * <p/>
 */
public class ReverseFile01 {

	public void printFile() throws IOException{
		
		ArrayList<String> lineArrayList = new ArrayList<String>();
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String updateitem = null;
		
		System.out.println("22");
		
		while( (updateitem = bufferedReader.readLine())!=null){
			
			if ("over".equals(updateitem)) {
				break;
			}
			
			lineArrayList.add(updateitem);
		}
		
		
		
		if (lineArrayList != null && lineArrayList.size() > 0) {
			
			for (String string : lineArrayList) {
				
				List<String> contentList = new ArrayList<String>();
				
				File file = new File(string);
				
				BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
				
				String content = null;
				
				while((content = bufferedReader2.readLine()) != null){
					
					contentList.add(content);
					
					System.out.println(content.toUpperCase());
				}
				
			}
		}
	}
}

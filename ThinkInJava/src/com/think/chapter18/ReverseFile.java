package com.think.chapter18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * 
 * 类名称: ReverseFile.
 * <p/>  
 * 类描述:练习7：打开一个文本文件，每次读取一行内容。将每行作为一个S天ring读入，并将那个String对象置入一个LinkedList中。
 * 			   按相反的顺序打印出LinkedList中的所有行。 
 * <p/>
 * 创建者: shengtianbanzi 
 * <p/>
 * 创建时间: 2017-6-18 上午11:29:43
 * <p/>
 */
public class ReverseFile {
	
	public void printeFile(String filePath){
		
		LinkedList<String> IOLinkedList = new LinkedList<String>();
		
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(filePath));
			
			String linecontent = "";
			
			while ((linecontent = bufferedReader.readLine())!= null) {
				IOLinkedList.addFirst(linecontent);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		if (IOLinkedList != null && IOLinkedList.size() > 0) {
			System.out.println(IOLinkedList.size());
			for (String string : IOLinkedList) {
				System.out.println(string);
			}
		}
		
	}

}

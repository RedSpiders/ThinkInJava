package com.think.chapter18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * 
 * ������: ReverseFile.
 * <p/>  
 * ������:��ϰ7����һ���ı��ļ���ÿ�ζ�ȡһ�����ݡ���ÿ����Ϊһ��S��ring���룬�����Ǹ�String��������һ��LinkedList�С�
 * 			   ���෴��˳���ӡ��LinkedList�е������С� 
 * <p/>
 * ������: shengtianbanzi 
 * <p/>
 * ����ʱ��: 2017-6-18 ����11:29:43
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

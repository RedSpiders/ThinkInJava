package com.think.chapter18;

import java.io.IOException;

public class ATest {

	/**
	 * 
	 * ����������������--���ڲ���IO��.
	 * <p/>
	 * @param args  
	 * <p/>
	 * �����ߣ�wangyan
	 * <p/> 
	 * ����ʱ�䣺2017-6-13 ����9:12:04
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//��ϰ3
//		DirList dirList = new DirList("E:\\IO");
//		long len = dirList.conSizeFile();
//		System.out.println("len:"+len);

		//��ϰ4
//		Directory directory = new Directory("E:\\IO", ".*a.*");
//		long size = directory.walk();
//		System.out.println("size:"+size);
		
		//��ϰ6
//		ProcessFiles processFiles = new ProcessFiles("E:\\Myeclipse\\ThinkInJava\\src\\com\\think\\chapter18");
//		processFiles.getFileEndDate();
		
		//��ϰ7
//		ReverseFile reverseFile = new ReverseFile();
//		reverseFile.printeFile("E:\\IO\\other.txt");
		
		//��ϰ8
		ReverseFile01 reverseFile01 = new ReverseFile01();
		reverseFile01.printFile();
	}

}

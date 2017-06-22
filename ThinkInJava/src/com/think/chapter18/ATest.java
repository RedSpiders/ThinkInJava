package com.think.chapter18;

import java.io.IOException;

public class ATest {

	/**
	 * 
	 * 方法描述：主方法--用于测试IO类.
	 * <p/>
	 * @param args  
	 * <p/>
	 * 创建者：wangyan
	 * <p/> 
	 * 创建时间：2017-6-13 下午9:12:04
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//练习3
//		DirList dirList = new DirList("E:\\IO");
//		long len = dirList.conSizeFile();
//		System.out.println("len:"+len);

		//练习4
//		Directory directory = new Directory("E:\\IO", ".*a.*");
//		long size = directory.walk();
//		System.out.println("size:"+size);
		
		//练习6
//		ProcessFiles processFiles = new ProcessFiles("E:\\Myeclipse\\ThinkInJava\\src\\com\\think\\chapter18");
//		processFiles.getFileEndDate();
		
		//练习7
//		ReverseFile reverseFile = new ReverseFile();
//		reverseFile.printeFile("E:\\IO\\other.txt");
		
		//练习8
		ReverseFile01 reverseFile01 = new ReverseFile01();
		reverseFile01.printFile();
	}

}

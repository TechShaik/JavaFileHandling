package com.JavaFileHandling;

import java.io.File;
import java.io.IOException;

public class BasicCreateFiles {

	public static void main(String[] args) {
		 File f=new File("C:\\Users\\shaik\\Desktop\\New folder\\file1.txt");
		 File f2=new File("C:\\Users\\shaik\\Desktop\\New folder\\shaik");
		 File f3=new File("C:\\Users\\shaik\\Desktop\\New folder\\shaik\\myfiles\\javaFiles");

 
		try {
			System.out.println(f2.mkdir());
			System.out.println(f3.mkdirs());
			System.out.println( f.createNewFile());
                 System.out.println(f.isDirectory());
                 System.out.println(f.setWritable(false));
                 System.out.println(f.canWrite( ));
                 System.out.println(f.isHidden());
                 System.out.println(f.delete());
                 System.out.println(f.exists());
     			System.out.println( f.createNewFile());
                System.out.println(f.exists());


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }

}

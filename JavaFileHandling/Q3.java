package com.JavaFileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) { 
		String fileD="C:\\Users\\shaik\\Desktop\\New folder\\destination.txt";

      try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter your data to insert");
		  String data=sc.next();
		 
			  try(FileWriter f=new FileWriter(fileD);){
				  for(char i:data.toCharArray()) {
				  f.write((int)i);
		 	  }    		  System.out.println("Data inserted Successfully");
} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
      
	
	}
}

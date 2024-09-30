package com.JavaFileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 import java.util.Scanner;

public class DataReadingFromFiles {

	public static void main(String[] args) {
		 String file="C:\\Users\\shaik\\Desktop\\New folder\\file1.txt";
		 try {
 			  //--------using FileInputStream
				FileInputStream is=new FileInputStream(file);
				try {
					int data ;
					while((data=is.read())!=-1) {
						System.out.print((char)data);
 					}
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			///----------using Scanner
				 String file2="C:\\Users\\shaik\\Desktop\\New folder\\file1.txt";
 				Scanner sc=new Scanner(new File(file2));
				System.out.println();
				while(sc.hasNext()) {
					System.out.print(sc.next()+" ");
 					
				}System.out.println();
				sc.close();
				///-----using file reader
				 String file4="C:\\Users\\shaik\\Desktop\\New folder\\file1.txt";
                 FileReader fr=new FileReader(file4);
                 int data;
                 try {
					while((data=fr.read())!=-1) {
						 System.out.print((char)data);
					 }
					fr.close();
					System.out.println();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				//// -----using buffered reader
				 String file3="C:\\Users\\shaik\\Desktop\\New folder\\file1.txt";
                   BufferedReader bf=new BufferedReader(new FileReader(file3));
                   int data1;
                   try {
					while((data1=bf.read())!=-1) {
						   System.out.print((char)data1);
					   }bf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                   
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

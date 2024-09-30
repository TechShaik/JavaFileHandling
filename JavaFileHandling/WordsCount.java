package com.JavaFileHandling;

 import java.io.BufferedReader;
 import java.io.FileReader;
import java.io.IOException;
 
public class WordsCount {

	public static void main(String[] args) throws IOException {
		int count=0;
		 FileReader f=new FileReader("C:\\Users\\shaik\\Desktop\\New folder\\file1.txt");
 			BufferedReader br=new BufferedReader(f); 
            String Line;
            if((Line=br.readLine())!=null) {
            	String[]arr=Line.split(" ");
            	count+=arr.length;
            	
            }
            System.out.println("Total words are :"+count);
              				
 			
		
		 
		}

	}



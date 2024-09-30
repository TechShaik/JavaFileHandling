package com.JavaFileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q5 {

	public static void main(String[] args) throws IOException {
		 FileReader f=new FileReader("C:\\Users\\shaik\\Desktop\\New folder\\file1.txt");
		 BufferedReader br=new BufferedReader(f);
         String Line;
         Line=br.readLine();
         StringBuilder sb=new StringBuilder(Line);
         sb.reverse();
         System.out.println(sb);
         
         }

}

package com.JavaFileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q1 {

	public static void main(String[] args) {
		String fileS="C:\\Users\\shaik\\Desktop\\New folder\\Source.txt";
		String fileD="C:\\Users\\shaik\\Desktop\\New folder\\destination.txt";

		 try(FileReader file1=new FileReader(fileS);
				 FileWriter file2=new FileWriter(fileD);){
			 int data;
			 while((data=file1.read())!=-1) {
				 file2.write(data);
			 }
			 System.out.println("data Copied succesfully");
			 
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

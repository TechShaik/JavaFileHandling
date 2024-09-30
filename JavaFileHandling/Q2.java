package com.JavaFileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q2 {

	public static void main(String[] args) {
		 String fileS="C:\\Users\\shaik\\Desktop\\New folder\\Source.txt";

		try( BufferedReader br=new BufferedReader(new FileReader(fileS));) {
			int data;
			while((data=br.read())!=-1) {
				System.out.print((char)data);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}



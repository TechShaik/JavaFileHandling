package com.JavaFileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.io.IOException;

public class DataWritnigIntoFiles {

	public static void main(String[] args) {
         File f=new  File("C:\\Users\\shaik\\Desktop\\New folder\\file1.txt");
        System.out.println( f.exists());
        try (FileOutputStream fo = new FileOutputStream(f)) {
			String s="Hello again now im sravani";
                for(char i:s.toCharArray()) {
                   try {
					fo.write((int)i);
				}
 
                   
                   
                 
                   catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}                }
 
                
                 
                try {
					fo.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        } 
        
        
       

        
        catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
        
        
 
         		
	}

}

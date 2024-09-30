package com.Threading;



class A extends Thread{
	public void run() {
		 	}
}

public class ByExtendingClass {

	public static void main(String[] args) {
 		A obj=new A();
 		obj.setName("Shaik");
 		obj.start();
 		System.out.println(obj.getName()+" starts running");
 	}

}

package com.Threading;

 
public class Synchronisation {
   public static void main(String[] args) {
	   Thread t1=new Thread() {
		   public void run() {
			   Synchronisation s=new Synchronisation();
			   s.printTable(5);
			  
				 
			   
		   }
	   };
	   
	   Thread t2=new Thread() {
		   public void run() {
			   Synchronisation s=new Synchronisation();
			   s.printTable(8);
			   
		   }
	   };
	           t1.start();
	           try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	           t2.start();
	           try {
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
} 
public synchronized void printTable(int n) {
	for(int i=1;i<=10;i++) {
		System.out.println(n*i);
	}
}
}
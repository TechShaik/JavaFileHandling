package com.Threading;

public class ProducerConsumer {
	int value;
       boolean produced;
       public synchronized void produce() {
           int n = 2;
           for (int i = 1; i <= 500; i++) {
               value = n * i;
           }
           System.out.println("Put: " + value);
           produced = true;
           notify();  
       }public synchronized void consume() {
           while (!produced) {
               try {
                   wait(); 
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
           System.out.println("Get: " + value);
       }
	public static void main(String[] args) {
		 ProducerConsumer pc=new ProducerConsumer();

		 Thread t1=new Thread(){
			 public void run() {
				pc.produce(); 
			 }
		 };
		 
		 Thread t2=new Thread(){
			 public void run() {
				pc.consume(); 
			 }
		 };
		 t1.start(); 
		 t2.start();
		 try {
			 t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package com.Threading;

class B implements Runnable{

	@Override
	public  synchronized void run() {
  
		 
		
	}
	
}
public class RunnableInterface {

	public static void main(String[] args) {
		B obj=new B();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);

		for(int i=0;i<=5;i++) {
			System.out.println(i*5);
			try {
				t1.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			 
		}
		
		
           t1.start();
   	}

}

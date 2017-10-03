package com.gz.mytestproject;




public class WaitHelper {
	public static void waitSec() {	
		for(int i=0;i<=5;i++) {	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Printing line "+i);			
		}
	}

}

package com.comlumbus.unit4;

public class Unit4_5CodeAnalysis {
	
	public void codeAnalysis1() {
		
		
		int count = 0;
		for (int i=0; i<30; i++) {
			
			if (i%3==0) // How many times will it execute?
			{ 
				
				count++; //How many times will it execute?
			}
			
		}
		
		System.out.println(count);
		
		
		
		//How can we make this better/more efficient?
		
		for (int i = 0; i<50;i++) {
			
			if (i%5==0) {
				
				System.out.println(i);
			}
		}
		
	}

}

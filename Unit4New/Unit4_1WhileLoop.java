
public class Unit4_1WhileLoop {
	
	// while(this is true){
	// Do something, and keep doing it 
	// as long as what's in parenthesis is true
	// }
	
	public void whileTest() {
		
		// int indexVal = 1;
        // boolean condition = true;
		
		// while(indexVal < 100) {
            
            // indexVal*=5;

        //     if(indexVal == 5){
        //         System.out.println(indexVal+ " is my favorite number");
        //         condition = false;
		// 		// condition = false;
        //     }
            // System.out.println(indexVal);
		// 	//Change index value, control value
		// 	//If you don't it will run forever.
		// 	// indexVal+=2;
			
		// 	//can increase/decrease value any way you like
		// 	//indexVal--;
		// 	//indexVal += 2;
		// 	//indexVal *= 5;
		// 	//indexVal -= 3;
		// 	//etc.
		// }
		
		//System.out.println("Done with the loop.");
		
		
		
		//Write code to print 20 to 0 counting down by 4

		int indexVal2 = 20;

		while(indexVal2 >= 0){
			 System.out.println(indexVal2);

			indexVal2 -= 4;


		}

		
		
		
	}
	
	
	public void whileTest2() {
		
		//given a multidigit integer sum the individual digits.
		//4567 -> 4+5+6+7 = 22
		
		int numb = 4567;
		int sum = 0;
//		
		while (numb>0 && sum ==0) {
			if (numb <1000 ){
				numb = -1;
			}
			int lastDigit = numb%10;
			sum +=lastDigit;
			numb = numb/10;
		}
		
		System.out.println("This is the sum: "+sum);
		
		//If you have $200 in a bank account that increases 10% per year
		//How many years would it take to get to $1000
		
		int startMoney = 200;
		int finalMoney = 1000;
		int years = 0;
		
		while (startMoney<=finalMoney) {
			
			startMoney+=startMoney*.1;
			years++;
			// System.out.println("Money "+startMoney+" Years "+years);
			
		}
		// System.out.println("Years "+years);
		
	}

}
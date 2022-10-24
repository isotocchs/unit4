
public class Unit4_4Nested {
	
	public void nestedLoops1() {
		
		for (int index1 = 0; index1<5;index1++) {
			
			System.out.println("Value of index 1 = "+index1);
			
			for (int index2 = 0; index2<5;index2++) {
				
				System.out.println("Value of index 2 = "+index2);
				
			}
			
			
			
		}
		
		
	}
	
	public void nestedLoops2() {
		
		for (int index1 = 0; index1<5;index1++) {
			
			System.out.println("Value of index 1 = "+index1);
			
			for (int index2 = 0; index2<index1;index2++) {
				
				System.out.println("Value of index 2 = "+index2);
				
			}
			
			
			
		}
		
		
	}

}
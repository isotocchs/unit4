
public class Unit4_3StringLoops {

	public void stringLoop1() {
		
		String word1 = "applesauce";
		String word2 = "time";
		boolean found = false;
		
		for (int i=0;i<=word1.length()-word2.length();i++) {
			
			String portion = word1.substring(i,i+word2.length());
			if (portion.equals(word2)) {
				found = true;
			}
		}
		if (found) {
			System.out.println("Word 2 is in word 1");
		} else {
			System.out.println("Word 2 is NOT in word 1");
		}
		
		
		//Why error?
		
		
		//=
		//-word2.length()
		
		
		
	}
	
	public void vowelCount() {
		
		//check every letter of a word to see if it has an a,e,i,o,u. Add the count to total.
		
		String word3 = "Some time is hot";
		int count = 0;
		for (int i = 0;i<word3.length();i++) {
			
			String letter = word3.substring(i,i+1);
			if (letter.equals("a")||letter.equals("e")||letter.equals("i")
					||letter.equals("o")||letter.equals("u")) {
				count++;
				
			}
			
		}
		System.out.println("The number of vowels in "+word3+" is "+count);
	}
	
	public void reverseString() {
		
		String original = "Time to go!";
		String reversed = "";
		
		for (int i=0;i<original.length();i++) {
			String singleLetter = original.substring(i,i+1);
			reversed = singleLetter+reversed;
			
		}
		
		System.out.println("Original String: "+original);
		System.out.println("Reversed String: "+reversed);
		
		
	}
		
}
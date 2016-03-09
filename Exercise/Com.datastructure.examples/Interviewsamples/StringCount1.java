package Interviewsamples;

public class StringCount1 {

	public static void main(String[] args) {
		String str= "asdfgsasdfsd";
		String searchString="d";
		int lastIndex=0;
		int count=0;
		
		while(lastIndex!=-1){
			lastIndex = str.indexOf(searchString, lastIndex);
			if(lastIndex!=-1){
				count++;
				lastIndex=lastIndex + searchString.length();
			}
			
		}
		System.out.println("String "+searchString + " is found "+count + "  times");

	}

}

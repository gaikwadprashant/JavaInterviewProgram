package Interviewsamples;

public class StringCount1 {

	public static void main(String[] args) {
		String str= "asdfgsasdfsd";
		String searchString="d";
		int firstIndex=0;
		int count=0;
		
		while(firstIndex!=-1){
			firstIndex = str.indexOf(searchString, firstIndex);
			if(firstIndex!=-1){
				count++;
				firstIndex=firstIndex + searchString.length();
			}
			
		}
		System.out.println("String "+searchString + " is found "+count + "  times");

	}

}

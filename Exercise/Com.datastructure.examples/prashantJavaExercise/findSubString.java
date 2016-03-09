package prashantJavaExercise;

public class findSubString {

	public static void main(String[] args) {
		String str = "asd df sd sd dfgdfg fsddfgsd dfhjsdv  sddfgffgf";

		//System.out.println("Count of sd in String is " + findSubString(str));
		System.out.println("reverse of String is " + reverseString(str));

	}
	static String reverseString(String string){
		String temp="";
		//int i=0;
		for(int i=string.length()-1; i>=0; i--){
			temp = temp +string.charAt(i);
			//System.out.println("reverse string is "+temp);
		}
		return temp;
	}

	static int findSubString(String string) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			
			if (string.charAt(i) == 's') {
				if(i < string.length()-1 && string.charAt(i+1)=='d'){
					count++;
				}
			}
			
		}
		return count;
	}

}

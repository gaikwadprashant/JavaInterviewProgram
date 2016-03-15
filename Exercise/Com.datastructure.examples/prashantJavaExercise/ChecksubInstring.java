package prashantJavaExercise;

public class ChecksubInstring {
	
	public static void main(String args[])
	{
		System.out.println(checkSub1("thin in a bin  a ina in a cin thini"));
	}
	
	
	public static int checkSub(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='i')
			{
				if(s.length()>i+1 && s.charAt(i+1)=='n')
				{
					count++;
					i=i+1;
				}
			}
		}
		
		return count;
	}
	
	
	public static int checkSub1(String s)
	{
		int count=0;
		int i=0;
		do{
			if(s.charAt(i)=='i')
			{
				if(s.length()>i+1 && s.charAt(i+1)=='n')
				{
					count++;
					i=i+1;
				}
			}
			i++;
		}while(s.length()>i);
		
		return count;
	}

}

// The Sentence String can have alot of trailing and leading spaces, the spaces in between words can be more than 1.

public class ReverseLine 
{
	public static String Reverse(String s)
	{
		String resultString = "";
		int i = s.length()-1;
		while(i>0)
		{
			while(i>0 && s.charAt(i) == ' '){
				i--;
			}
			int j = i;
			while(i>0 && s.charAt(i) !=' '){
				i--;
			}
			if(resultString !=""){
			    resultString = resultString + " " + s.substring(i+1, j+1);
			    System.out.println(resultString);
			}
			else {
				resultString = resultString + s.substring(i+1, j+1);
				System.out.println(resultString);
			}
		}
		return resultString;
	}
  

  // This Approach solved the problem in O(n) complexity but takes up alot of space. In order to optimize the space complexity, we can use String Buffer/Builder
  
	public static String randomApproach(String str) 
	{
		String resultString = "";
		String workingString = str.trim();
		String words[] = workingString.split(" ");
		for(int i = 0; i<words.length; i++)
		{
			if(words[i]!=" " && words[i]!="")
			{
				resultString = words[i]+ " " + resultString;
			}
		}
		return (resultString.trim());
	}
  
	public static void main(String[] args) 
	{
		String s = "   the   sky is    blue  ";
		System.out.print(Reverse(s));
		System.out.print(randomApproach(s));
	}
}

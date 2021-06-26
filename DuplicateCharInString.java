// This program finds out the first duplicate Character in a String in O(n^2) complexity. 
// This can be done in O(n) complexity as well - Using Hash Map. Code will be added here SOON. 
import java.util.Scanner;
class Dummy
{
	  public static void main(String[] args) 
	  {
		  
		  Scanner sc = new Scanner(System.in);
		  String str = sc.nextLine();
		  int c = 0;
		  int len = str.length();
		  for(int i = 0; i<len;i++)
		  {
		    for(int j = i+1; j<len; j++)
		    {
				if(str.charAt(i) == str.charAt(j))
		        {
		        	System.out.println("The First duplicate Character is :" + str.charAt(j));
		        	c++;
		        	break;
		        }
		    }
		    if(c==1)
		    	break;
		  } 
	  }
}

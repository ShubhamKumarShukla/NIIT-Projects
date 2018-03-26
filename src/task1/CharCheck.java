/*
 *  QUESTION 7
 *  A java program to take a character as a input from user and 
 *  determine if it is a vowel or a consonant using conditional construct.
 *  
 *  CREATED BY - SHUBHAM KUMAR SHUKLA
 */
package task1;

import java.io.IOException;

class IsVowel
{
  char ch;
  void check() throws IOException
  {
	  System.out.print("\n Enter a character to check for vowel :  ");
	  ch = (char) System.in.read();
	   if(ch>='a'&& ch<='z' || ch>='A'&& ch<='Z')
	   {
		   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			   System.out.println("\n The character is a Vowel!!!");
		   else
			   System.out.println("\n The character is a Consonant!!!");
	   }
	   else
		   System.out.println("\n The entered character is not an alphabet.");
	  
  }
}

public class CharCheck
{

	public static void main(String[] args) throws IOException
	{
		IsVowel v = new IsVowel();
		v.check();
	}

}

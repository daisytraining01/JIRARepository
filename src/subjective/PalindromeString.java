package subjective;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		String original, reverse = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string:");
        original = s.nextLine();
        
        for(int i = original.length()-1; i >= 0; i--)
        {
        	reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse))
        {
            System.out.println("The given string is palindrome.");
        }
        else
        {
            System.out.println("The given string is not palindrome.");
        }
	}
}
/*output: 
 
Enter the string:madam
The given string is palindrome.*/
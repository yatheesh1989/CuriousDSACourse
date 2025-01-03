package Recursion;

import java.util.Arrays;

public class StringPalindromeRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
//		String s = "0P";
//		String s = ":TATE:";
		s= s.toLowerCase();
		System.out.println(s);
		String onlyAlp = constructString(s.toCharArray());
		System.out.println(onlyAlp);
		char[] c = reverseString(onlyAlp.toCharArray(), 0, onlyAlp.toCharArray().length-1);
		System.out.println(Arrays.toString(c));
		String reversedString =constructString(c);
		System.out.println(reversedString);
		System.out.println(onlyAlp.equals(reversedString));
		System.out.println(isPalindrome(s));
		
	}
	public static String constructString(char[] s) {
		String onlyAlpha = " ";
		for(char i : s) {
			if(Character.isLetterOrDigit(i))
				onlyAlpha = onlyAlpha + i;
		}
		return onlyAlpha.trim();
	}
	public static char[] reverseString(char[] s, int i, int j) {
		if(i>j) {
			return s;
		}
		char temp = s[j];
		s[j] = s[i];
		s[i] = temp;
		return reverseString(s, i+1, j-1);
		
	}
	// Another simple way;
	static private boolean isPalindrome(String s) {
	    int left = 0, right = s.length()-1;
	        while(left<right)
	        {
	            char l = s.charAt(left), r = s.charAt(right);
	            if(!Character.isLetterOrDigit(l)) 
	                left++;
	            else if(!Character.isLetterOrDigit(r)) 
	                right--;
	            else if(Character.toLowerCase(l)!=Character.toLowerCase(r)) 
	                return false;
	            else {
	                left++; 
	                right--;
	            }
	        }
	        return true;
	  }
	

}

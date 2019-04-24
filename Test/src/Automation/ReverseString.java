package Automation;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		/*SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dtf.format(date));
		System.out.println(java.time.LocalDate.now());
		System.out.println(java.time.LocalTime.now());
		LocalDateTime DTime = java.time.LocalDateTime.now();
		System.out.println(DTime);*/
		
//		String text = "The quick brown fox jumps over the lazy dog";
//		char[] arr = text.toCharArray();
//		for(int i=0;i<=arr.length;i++) {
//			System.out.println("Char :"+arr[i]+" "+"Index :"+text.indexOf(arr[i]));
//		}
		
		/*String str = "Naveen";
		String str1 = "Vinay";
		String str2 = "Naveen";
//		if(str==str1) {
			System.out.println(str==str1);
//		}else if(str==str2) {
			System.out.println(str==str2);
//		}
*/		
		/*String text = "thequickbrownfoxxofnworbquickthe";
		String palind = text.substring(8, 24);
		System.out.println(palind);
		String revstr = "";
		int palindLen = palind.length();
		for(int i=palindLen-1;i>=0;i--) {
			revstr = revstr+palind.charAt(i);
		}
		System.out.println(revstr);
		if(revstr.equals(palind)) {
			System.out.println("Longest Palindrome string :"+palind);
			System.out.println("Length of Palindrome :"+palindLen);
		}*/
		
		/*String str = "WX";
		String str2 = "YZ";
		char[] a = str.toCharArray();
		char[] b = str2.toCharArray();
		for( int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				System.out.println(a[i]+" "+b[j]);
				System.out.println(a[j]+ " "+b[j]);
			}
		}*/

		String text = "successes";
		char[] b = text.toCharArray();
		int count =0, count1 = 0;
		for( int i=0;i<b.length;i++) {
			System.out.println(b[i]);
			if(b[i]=='s') {
				count++;
			}else if (b[i]=='c') {
				count1++;
			}
		}
			if(count>count1) {
				System.out.println("c is second most");
			}else {
				System.out.println("s is second most");
			}

			
				
				

		
		

	}

}

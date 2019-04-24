package Automation;

public class LowerAndUppercase {

	public static void main(String[] args) {
		String text = "Naveen";
//		char[] textArray = text.toCharArray();

				int arrLength = text.length();
				for(int i=0;i<arrLength;i++) {
					char ch = text.charAt(i);
					if(i%2==0) {
						System.out.println(Character.toLowerCase(ch));
					}else {
						System.out.println(Character.toUpperCase(ch));
					}
				}

	}

}

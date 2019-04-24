package Automation;

public class DuplicateInString {

	public static void main(String[] args) {
		String text ="madam";
		char[] textArray = text.toCharArray();
		int arrLength = textArray.length;
		for ( int i=0;i<arrLength;i++) {
			for (int j=i+1;j<arrLength;j++) {
				if(textArray[i]==textArray[j]) {
					System.out.println(textArray[i]);
				}
			}
		}

	}

}

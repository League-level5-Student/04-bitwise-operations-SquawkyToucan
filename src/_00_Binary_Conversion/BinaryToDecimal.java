package _00_Binary_Conversion;

import javax.swing.JOptionPane;

public class BinaryToDecimal {
	public static void main(String[] args) {
		// Binary numbers in Java can be represented with the '0b' prefix.
		// For example:
		System.out.println(0b111);
		// Converting
		String stringToConvert = JOptionPane.showInputDialog("Input a binary number to convert into decimal.");
		System.out.println(convert(stringToConvert));
	}
	static String convert(String s) {
		s = s.trim();
		int output = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '1') {
				output += Math.pow(2, s.length()-1-i);
			}
		}
		return output + "";
	}
}

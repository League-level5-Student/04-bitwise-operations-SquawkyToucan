package _00_Binary_Conversion;

import javax.swing.JOptionPane;

public class Decimal_To_Binary {
	public static void main(String[] args) {
		String decimal = JOptionPane.showInputDialog("Enter a decimal value.");
		System.out.println(returnBinary(decimal));
	}

	static String returnBinary(String dec) {
		int[] binaryNum = new int[1000];
		int n = Integer.parseInt(dec);
		int i = 0;
		while (n > 0) {
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}
		String[] output = new String[1000];
		for (int m = 0; m < binaryNum.length; m++) {
			output[m] = binaryNum[m] + "";
		}
		String p = "";
		for (int j = i - 1; j >= 0; j--) {
			p += output[j];
		}
		return p;
	}
}

package _03_Printing_Binary;

public class BinaryPrinter {
	// Complete the methods below so they print the passed in parameter in binary.
	// Don't be afraid to use the methods that are already complete to finish the
	// others.
	// Create a main method to test your methods.

	public static void printByteBinary(byte str) {
		int[] binaryNum = new int[1000];
		int n = str;
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
		System.out.println(p);
	}

	public static void printShortBinary(short str) {
		int[] binaryNum = new int[1000];
		int n = str;
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
		System.out.println(p);
	}

	public static void printIntBinary(int str) {
		int[] binaryNum = new int[1000];
		int n = str;
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
		System.out.println(p);
	}

	public static void printLongBinary(long str) {
		long[] binaryNum = new long[1000];
		long n = str;
		long i = 0;
		while (n > 0) {
			binaryNum[(int) i] = n % 2;
			n = n / 2;
			i++;
		}
		String[] output = new String[1000];
		for (long m = 0; m < binaryNum.length; m++) {
			output[(int) m] = binaryNum[(int) m] + "";
		}
		String p = "";
		for (long j = i - 1; j >= 0; j--) {
			p += output[(int) j];
		}
		System.out.println(p);
	}

	public static void main(String[] args) {
		byte b = 13;
		printByteBinary(b);
		printIntBinary(63);
		short s = 32678;
		printShortBinary(s);
		printLongBinary(1000000000);
	}
}

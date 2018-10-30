package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4;
		int numShifted = num << 1;
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println(numShifted);
		// 3. The << operator adds a zero for each number at the end of the number. 10 becomes 100, etc.
		// 4. Try shifting num 3 places.
		System.out.println(num << 3);
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
}

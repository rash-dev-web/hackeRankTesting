package hackerRank;

import java.util.Scanner;

public class ReverseStringPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String A = sc.next();
		String str = "";

		for (int x = A.length() - 1; x >= 0; x--) {
			str = str + A.charAt(x);
		}

		if (A.equals(str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}

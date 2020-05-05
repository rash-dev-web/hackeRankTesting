package hackerRank;

import java.util.Scanner;

public class Day1DataType {

	public static void main(String[] args) {

		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Integer: ");
		int ii = scan.nextInt();

		System.out.println("Enter Double: ");
		double dd = scan.nextDouble();

		System.out.println("Enter String: ");
		String ss = "";
		ss = scan.next();
		ss = ss + scan.nextLine();
		
		System.out.println(i + ii);
		System.out.println(d + dd);
		System.out.println(s + " " + ss);

		scan.close();
	}

}

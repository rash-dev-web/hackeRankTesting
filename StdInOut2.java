package hackerRank;

import java.util.Scanner;

public class StdInOut2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String ss = "";
        ss = scan.next();
        ss = ss + scan.nextLine();

        

        System.out.println("String: " + ss);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
	}

}

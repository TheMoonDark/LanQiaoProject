package lanQiaoTest3;

import java.util.Scanner;

public class P0505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		noZore(factorial(scan.nextInt()));
	}
	private static long factorial(int a) {
		// TODO Auto-generated method stub
		if(a > 1) {
			return a * factorial(a-1);
		}
		return 1;
	}
	private static void noZore(long a) {
		// TODO Auto-generated method stub
		long num = 0;
		while(a / 10 != 0) {
			if(a % 10 != 0) {
				System.out.println(a % 10);
				System.exit(1);
			}
			a /= 10; 
		}
	}

}

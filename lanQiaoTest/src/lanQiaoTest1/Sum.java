package lanQiaoTest1;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		long sum = 0;
		for(int i = 0; i < a; i++) {
			sum += (i+1);
		}
		System.out.println(sum);
	}

}

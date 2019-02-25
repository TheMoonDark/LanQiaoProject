package lanQiaoTest1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[100];
		a[0] = 1;
		a[1] = 1;
		Scanner scan = new Scanner(System.in);
		int b;
		b = scan.nextInt();
		for(int i = 2; i < b; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}
		System.out.println(a[b-1] % 10007);
	}

}

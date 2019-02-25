package lanQiaoTest2;

import java.util.Scanner;

/**
 * 特殊回文数
 * @author haodechen
 *
 */
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum = scan.nextInt();
		int len;
		for(int i = 10000; i<1000000; i++) {
			if(i / 100000 > 0) {
				int a1, a2, a3, a4, a5, a6;
				a6 = i / 100000;
				a5 = i % 100000 / 10000;
				a4 = i % 10000 / 1000;
				a3 = i % 1000 / 100;
				a2 = i %100 / 10;
				a1 = i % 10;
				int num = a1 * 100000 + a2 * 10000 + a3 * 1000 + a4 * 100 + a5 * 10 + a6;
				if(num == i && sum == a1+a2+a3+a4+a5+a6)
					System.out.println(num);
			}else {
				int a1, a2, a3, a4, a5;
				a5 = i % 100000 / 10000;
				a4 = i % 10000 / 1000;
				a3 = i % 1000 / 100;
				a2 = i %100 / 10;
				a1 = i % 10;
				int num = a1 * 10000 + a2 * 1000 + a3 * 100 + a4 * 10 + a5;
				if(num == i && sum == a1+a2+a3+a4+a5)
					System.out.println(num);
			}
			
		}
	}

}

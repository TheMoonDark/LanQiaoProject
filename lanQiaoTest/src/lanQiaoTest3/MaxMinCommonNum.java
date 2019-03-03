package lanQiaoTest3;

import java.util.Scanner;

/**
 * 最大最小公倍数
 * @author haodechen
 *
 */
public class MaxMinCommonNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num >= 1 && num<=1000000) {
			if(num<3) {
				System.exit(1);
			}else {
				if(num % 2 == 0) {
					if(num % 3 == 0)
						System.out.println((num-1) * (num-2) * (num-3));
					else
						System.out.println(num * (num-1) * (num-3));
				}else {
					System.out.println((num) * (num-1) * (num-2));
				}
			}
			
			
			
		}
			
	}

}

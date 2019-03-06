package lanQiao2013;

import java.util.Scanner;

/**
 * авдЫЪї
 * @author ASUS
 *
 */
public class LanQiao2013_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt(), n = scan.nextInt(), flag = 2;
		int num = n - m + 1;
		System.out.println(num);
		while(flag <= num) {
			num = num - (int)(num / flag);
			flag++;
			System.out.print(num+" "+flag);
			System.out.println();
		}
		System.out.println(num);
	}

}

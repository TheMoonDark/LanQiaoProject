package lanQiaoTest3;

import java.util.Scanner;

/**
 * 显示图像
 * @author haodechen
 *
 */

public class ShowShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i = num; i>0; i--) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

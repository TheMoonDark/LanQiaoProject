package lanQiaoTest2;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m, s, n;
		m = scan.nextInt();
		s = scan.nextInt();
		n = scan.nextInt();
		int[][] a = new int[m][s];
		int[][] b = new int[s][n];
		int[][] c = new int[m][n];
		for(int i = 0; i<m; i++) {
			for(int j = 0; j<s; j++) {
				a[i][j]=scan.nextInt();
			}
		}
		for(int i = 0; i<s; i++) {
			for(int j = 0; j<n; j++) {
				b[i][j]=scan.nextInt();
			}
		}
		System.out.println(m+""+s);
		for(int i = 0; i<m; i++) {
			for(int j = 0; j<n; j++) {
				for(int k = 0; k<s; k++) {
					c[i][j] += a[i][k] *b[k][j];
				}
			}
		}
		for(int i = 0; i<m; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

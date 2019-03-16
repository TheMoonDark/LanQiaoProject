package lanQiao2014;

import java.util.Scanner;

public class LanQiao2014_10 {
	static int[][] a;
	static int w1;
	static int w2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		w1 = scan.nextInt();
		w2 = scan.nextInt();
		a = new int[w1][w2];
		for(int i = 0; i<w1; i++) {
			for(int j = 0; j<w2; j++) {
				a[i][j] = 0;
			}
		}
		for(int i = 0; i<w1; i++) {
			for(int j = 0; j<w2; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i = 0; i<w1; i++) {
			for(int j = 0; j<w2; j++) {
				Q(i,j);
			}
		}

	}
	private static int turn(int a) {
		// TODO Auto-generated method stub
		if(a==0)
			return 1;
		else
			return 0;
	}
	private static void Q(int i, int j) {
		// TODO Auto-generated method stub
		int[][] flag = new int[w1][w2];
		for(int i1 = 0; i1<w1; i1++) {
			for(int j1 = 0; j1<w2; j1++) {
				flag[i1][j1] = 0;
			}
		}
		for(int k1 = 1; k1*(i+1)<=w1; k1++) {
			for(int j1 = 0; j1<w2; j1++) {
				if(flag[k1*(i+1)-1][j1]==0) {
					a[k1*(i+1)-1][j1]=turn(a[k1*(i+1)-1][j1]);
					flag[k1*(i+1)-1][j1] = 1;
				}
					
			}
		}
			
		for(int k2 = 1; k2*(j+1)<=w2; k2++) {
			for(int i1 = 0; i1<w1; i1++) {
				if(flag[i1][k2*(j+1)-1] == 0) {
					a[i1][k2*(j+1)-1] = turn(a[i1][k2*(j+1)-1]);
					flag[i1][k2*(j+1)-1] = 1;
				}
			}
		}
		for(int i1 = 0; i1<w1; i1++) {
			for(int j1 = 0; j1<w2; j1++) {
				System.out.print(a[i1][j1]+" ");
			}
			System.out.println();
		}
		System.out.println();
			
			
		
	}

}

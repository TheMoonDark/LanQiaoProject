package lanQiaoTest4;

import java.util.Scanner;

/**
 * 带分数
 * @author haodechen
 *
 */
public class LanQiao2013_9 {
	static int ans;
	static int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		f(arr, 0);
		System.out.println(ans);
	}
	private static void f(int []arr, int k) {
		// TODO Auto-generated method stub
		if(k == 9) {
			check(arr);
			return; 
		}
		for(int i  = k; i<arr.length; i++) {
			int t = arr[i];
			arr[i] = arr[k];
			arr[k] = t;
			
			f(arr, k+1);
			
			t = arr[i];
			arr[i] = arr[k];
			arr[k] = t;
			
		}
		
	}
	private static void check(int []arr) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=7; i++) {
			int num1 = toInt(arr, 0, i);
			if(num1 >= num)
				continue;
			for(int j = 1; j<=8 - i; j++) {
				int num2 = toInt(arr, i, j);
				int num3 = toInt(arr, i+j, 9 - i - j);
				if(num2%num3 == 0 && num1 + num2 / num3 == num)
					ans++;
			}
		}
	}
	private static int toInt(int[] arr, int pos, int len) {
		// TODO Auto-generated method stub
		int ans = 0; 
		int t = 1;
		for(int i = pos+len-1; i>=pos; i--) {
			ans += arr[i]*t;
			t *= 10;
		}
		return ans;
	}

}

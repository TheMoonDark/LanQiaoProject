package lanQiao2014;

import java.util.ArrayList;

public class LanQiao2014_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[2014];
		for(int i = 0; i<106; i++) {
			for(int j = 0; j<19; j++) {
				arr[i*19+j] = (char)(97+j);
			}
		}
		int num = 2014;
		char[] arr1;
		while(num>1) {
			int del = 0;
			for(int i = 0; i<num; i++) {
				if(i%2 == 0) {
					arr[i] = ' ';
					del++;
				}
			}
			arr1 = new char[num - del];
			int flag = 0;
			for(int i = 0; i<num; i++) {
				if(arr[i] != ' ') {
					arr1[flag] = arr[i];
					flag++;
				}
			}
			for (char c : arr1) {
				System.out.print(c);
			}
			System.out.println();
			arr = arr1.clone();
			num = arr.length;
		}
		System.out.println(num);
		System.out.println(arr[0]);
	}

}

package lanQiaoTest2;
/**
 * 快速排序
 */
import java.util.Scanner;

public class Test1 {
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		a = new int[num];
		for(int i = 0; i < num; i++)
			a[i] = scan.nextInt();
		sort(0, num - 1);
		for (int item : a) {
			System.out.print(item + " ");
		}
		System.out.println();

	}
	private static void sort(int start, int end) {
		// TODO Auto-generated method stub
		int i = start;
		int j = end;
		int flag;
		while(i < j) {
			while(i<j&&a[i] <= a[j]) {
				j -= 1;
			}
			if(a[i] > a[j]) {
				flag = a[i];
				a[i] = a[j];
				a[j] = flag;
			}
			while(i<j&&a[j] >= a[i]) {
				i += 1;
			}
			if(a[i] > a[j]) {
				flag = a[i];
				a[i] = a[j];
				a[j] = flag;
			}
		}
		if(start < i)
			sort(start, i);
		if(end > i)
			sort(i+1, end);
	}

}

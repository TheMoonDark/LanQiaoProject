import java.lang.reflect.Array;
import java.util.Scanner;

public class NumFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int nums[] = new int[num];
		for(int i = 0; i<num; i++) {
			nums[i] = scan.nextInt();
		}
		int max = nums[0], min = nums[0], sum = 0;
		for(int i = 0; i<num; i++) {
			if(nums[i] > max)
				max = nums[i];
			if(nums[i] < min)
				min = nums[i];
			sum += nums[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}

}

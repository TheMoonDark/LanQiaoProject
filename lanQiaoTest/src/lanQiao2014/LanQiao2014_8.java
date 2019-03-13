package lanQiao2014;

import java.util.Scanner;

public class LanQiao2014_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int peopleNum = scan.nextInt();
		int[] nums = new int[peopleNum];
		int[] value = new int[peopleNum];
		int sugerNum = 0;
		for(int i = 0; i<peopleNum; i++) {
			nums[i] = scan.nextInt();
		}
		
		
		while(!isEquals(nums)) {
			for(int i = 0; i<nums.length; i++) {
				value[i] = nums[i]/2;
				nums[i] = nums[i]/2;
			}
			for(int i = 0; i<nums.length; i++) {
				if(i == 0) {
					nums[nums.length-1]+=value[i];
				}else {
					nums[i-1]+=value[i];
				}
			}
			for(int i = 0; i<nums.length; i++) {
				if(nums[i]%2!=0) {
					sugerNum++;
					nums[i]++;
				}
			}
		}
		System.out.println(sugerNum);
	}
	private static boolean isEquals(int nums[]) {
		// TODO Auto-generated method stub
		for(int i = 0; i<nums.length-1; i++) {
			if(nums[i] != nums[i+1]) {
				return false;
			}
		}
		return true;
	}

}

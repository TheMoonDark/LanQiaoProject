import java.util.Scanner;

public class SearchNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] nums = new int[num];
		for(int i = 0; i<num; i++) {
			nums[i] = scan.nextInt();
		}
		int search = scan.nextInt();
		for(int i = 0; i<num; i++) {
			if(search == nums[i]) {
				System.out.println(i+1);
				System.exit(1);
			}
		}
		System.out.println(-1);
		
	}

}

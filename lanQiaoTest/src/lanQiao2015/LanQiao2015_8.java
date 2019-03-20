import java.util.Scanner;

public class LanQiao2015_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int last = num;
		int all = num;
		while(last/3>0) {
			all += last / 3;
			last = last % 3 + last / 3;
		}
		System.out.println(all);
	}

}


public class LanQiao2015_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int num = 1000;
		int num1 = num;
		
		for(int i = 1; i<=num; i++) {
			int number = i*i*i;
			int count = count(number);
			char nums[] = new char[count];
			nums = (number+"").toCharArray();
			int sum = 0;
			for (char c : nums) {
				sum+=Integer.parseInt(c+"");
			}
			if(sum == i) {
				a++;
				System.out.println(i);
			}
		}
		System.out.println(a);
	}
	private static int count(int num) {
		// TODO Auto-generated method stub
		int count = 0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}

}

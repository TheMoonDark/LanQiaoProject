
public class LanQiao2015_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = new int[50];
		for(int i = 0; i<50; i++) {
			nums[i] = i;
		}
		
		for (int i = 0; i < 47; i++) {
			int m = i+1;
			for (int j = 2; m+j < 49; j++) {
				int n = m+j;
				int sum = 0;
				sum += nums[m] * nums[m+1];
				sum += nums[n] * nums[n+1];
				for(int i1 = 0; i1<50; i1++) {
					if(i1 == m ||i1 == m+1 || i1 == n || i1 == n+1)
						continue;
					else {
						sum += i1;
					}
				}
				if(sum == 2015)
					System.out.println(m);
			}
		}
			
	}
	

}

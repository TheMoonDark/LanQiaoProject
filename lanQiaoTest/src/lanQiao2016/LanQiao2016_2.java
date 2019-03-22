package lanQiao2016;

public class LanQiao2016_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<50; i++) {
			int sum = 0;
			for(int j = 0; j<50; j++) {
				if(sum>236) {
					break;
				}
				if(sum == 236) {
					System.out.println(i);
				}
				sum += i + j;
			}
		}
	}

}

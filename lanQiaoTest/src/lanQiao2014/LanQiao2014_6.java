package lanQiao2014;

public class LanQiao2014_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i == j) {
					continue;
				}
				for (int k = 1; k < 10; k++) {
					for (int q = 1; q < 10; q++) {
						if (k == q) {
							continue;
						}
						int gcd1 = gcd(i * k, j * q);
						int gcd2 = gcd(i * 10 + k, j * 10 + q);
						if (i * k / gcd1 == (i * 10 + k) / gcd2 && j * q / gcd1 == (j * 10 + q) / gcd2)
							sum++;
					}
				}
			}
		}
		System.out.println(sum);
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}

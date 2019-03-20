package lanQiao2015;

public class LanQiao2015_3 {
	static boolean flag[] = new boolean[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[9];
		
		for (boolean b : flag) {
			b = false;
		}
		for (int i = 0; i < 10; i++) {
			if(i == 0)
				continue;
			flag[i] = true;
			for (int j = 0; j < 10; j++) {
				if(j == i)
					continue;
				for (int k = 0; k < 10; k++) {
					if(k == j || k == i)
						continue;
					for (int hui = 0; hui < 10; hui++) {
						if(hui == i || hui == j || hui == k)
							continue;
						for (int san = 0; san < 10; san++) {
							if(san == i || san == j || san == k || san == hui)
								continue;
							for (int yang = 0; yang < 10; yang++) {
								if(yang == i|| yang == j|| yang == k|| yang == hui || yang == san)
									continue;
								for (int xian = 0; xian < 10; xian++) {
									if(xian == i|| xian == j|| xian == k|| xian == hui || xian == san || xian == yang)
										continue;
									for (int qi = 0; qi < 10; qi++) {
										if(qi == i|| qi == j|| qi == k|| qi == hui || qi == san || qi == yang || qi == xian)
											continue;
										if((i*1000+j*100+k*10+hui)+(san*1000+yang*100+xian*10+j) == san*10000+yang*1000+k*100+j*10+qi)
											System.out.println(san*1000+yang*100+xian*10+j);
									}
									
								}
							}
						}
					}
				}
			}
		}
	}
	private static void isUsed(int i) {
		// TODO Auto-generated method stub
		flag[i] = true;
	}

}

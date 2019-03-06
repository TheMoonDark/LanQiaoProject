package lanQiaoTest4;

/**
 * 马虎的算式
 * 
 * @author haodechen
 *
 */
public class LanQiao2013_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int a = 1; a < 10; a++) {
			for(int b = 1; b < 10; b++) {
				if(b != a)
					for(int c = 1; c < 10; c++) {
						if(c != a && c != b)
							for(int d = 1; d < 10; d++) {
								if(d != a && d!=b&&d!=c)
									for(int e = 1; e<10; e++) {
										if(e != a && e!=b&&e!=c&&e!=d)
											if((a*10 + b)*(c*100+d*10+e) == (a*100+d*10+b)*(c*10+e)) {
												sum++;
											}
									}
							}
					}
			}
		}
		System.out.println(sum);
	}

}

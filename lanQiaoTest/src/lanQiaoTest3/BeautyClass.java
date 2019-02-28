package lanQiaoTest3;
import java.util.Scanner;
/**
 * …Û√¿øŒ
 * @author ASUS
 *
 */
public class BeautyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), m = scan.nextInt(), sum = 0;
		int ans[][] = new int[n][m];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				ans[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i<n; i++) {
			for(int k = i+1; k<n; k++) {
				int flag = 0;
				for(int j = 0; j<m; j++) {
					if(ans[i][j]!=ans[k][j]) {
						flag++;
					}
				}
				if(flag == m)
					sum++;
			}
		}
		System.out.println(sum);
	}

}

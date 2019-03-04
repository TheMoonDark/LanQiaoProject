package lanQiao2013;
/**
 * ÕñÐËÖÐ»ª
 * @author ASUS
 *
 */
public class LanQiao2013_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(next(0, 0));
	}
	private static int next(int i, int j) {
		// TODO Auto-generated method stub
		if(i == 3||j == 4)
			return 1;
		return next(i+1, j)+next(i, j+1);
	}
}

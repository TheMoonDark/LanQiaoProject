package lanQiao2013;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *  黄金连分数
 * @author ASUS
 *
 */
public class LanQiao2013_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ONE;
		for(int i = 0; i<300; i++) {
			BigInteger t = b;
			b = a.add(b);
			a = t;
		}
		BigDecimal div = new BigDecimal(a, 110).divide(new BigDecimal(b, 110), BigDecimal.ROUND_HALF_DOWN);
		String s = div.toPlainString().substring(0, 101);
		System.out.println(s+"5");
	}
}

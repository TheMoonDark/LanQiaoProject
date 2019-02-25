package lanQiaoTest2;
/**
 * 十六进制转八进制
 * @author haodechen
 *
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value =Integer.toString(Integer.parseInt("123ABC", 16), 8);
		System.out.println(value);
	}

}

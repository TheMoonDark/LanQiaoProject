package lanQiaoTest4;

import java.util.Calendar;
/**
 * 世纪末的星期
 * @author haodechen
 *
 */
public class LanQiao2013_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		for(int i = 1999; i<1000000; i+=100) {
			calendar.set(Calendar.YEAR, i);
			calendar.set(Calendar.MONTH, 11);
			calendar.set(Calendar.DAY_OF_MONTH, 31);
			if(calendar.get(Calendar.DAY_OF_WEEK) == 1) {
				System.out.println(i);
				System.exit(1);
			}
		}
	}

}

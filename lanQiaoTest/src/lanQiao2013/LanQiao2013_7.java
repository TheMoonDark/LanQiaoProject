package lanQiao2013;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class LanQiao2013_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int line = 0, sum = 0, n=scan.nextInt();
		scan.nextLine();
		ArrayList<Integer> list = new ArrayList<>();
		String[] str = new String[n];
		while(sum<n) {
			str[sum] = scan.nextLine();
			sum++;
		}
		for (String string : str) {
			String[] str1 = string.split(" ");
			for (String string2 : str1) {
				list.add(Integer.parseInt(string2));
			}
		}
		Collections.sort(list);
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i) + 1 != list.get(i+1)) {
				System.out.print(list.get(i)+1+" ");
				break;
			}
		}
			
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i) == list.get(i+1)) {
				System.out.print(list.get(i)+" ");
				break;
			}
		}
		
	}

}

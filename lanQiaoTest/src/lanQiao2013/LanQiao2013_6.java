package lanQiaoTest4;

public class LanQiao2013_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[14];
		a[0] = 25;
		a[1] = 18;
		a[2] = -2;
		a[3] = 0;
		a[4] = 16;
		a[5] = -5;
		a[6] = 33;
		a[7] = 21;
		a[8] = 0;
		a[9] = 19;
		a[10] = -16;
		a[11] = 25;
		a[12] = -3;
		a[13] = 0;
		sort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}
	static void sort(int[] x)
	{
		int p = 0;
		int left = 0;
		int right = x.length-1;
		
		while(p<=right){
			if(x[p]<0){
				int t = x[left];
				x[left] = x[p];
				x[p] = t;
				left++;
				p++;
			}
			else if(x[p]>0){
				int t = x[right];
				x[right] = x[p];
				x[p] = t;
				right--;			
			}
			else if(x[p]==0){
				int t;
				if(x[p+1] == 0) {
					t = x[p+2];
					x[p+2] = x[p];
					x[p] = t;
				}else {
					t = x[p+1];
					x[p+1] = x[p];
					x[p] = t;
				}
			}
		}
	}

}

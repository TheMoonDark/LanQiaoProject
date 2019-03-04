package lanQiao2013;

public class LanQiao2013_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rational a = new Rational(1,3);
		Rational b = new Rational(1,6);
		Rational c = a.add(b);
		System.out.println(a + "+" + b + "=" + c);

	}
	static class Rational
	{
		private long ra;
		private long rb;
		
		private long gcd(long a, long b){
			if(b==0) return a;
			return gcd(b,a%b);
		}
		public Rational(long a, long b){
			ra = a;
			rb = b;	
			long k = gcd(ra,rb);
			if(k>1){ //��ҪԼ��
				ra /= k;  
				rb /= k;
			}
		}
		// �ӷ�
		public Rational add(Rational x){
			return new Rational(x.ra * rb + ra * x.rb, x.rb * rb);  //���λ��
		}
		// �˷�
		public Rational mul(Rational x){
			return new Rational(ra*x.ra, rb*x.rb);
		}
		public String toString(){
			if(rb==1) return "" + ra;
			return ra + "/" + rb;
		}
	}

}
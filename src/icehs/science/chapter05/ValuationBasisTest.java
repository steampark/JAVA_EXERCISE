package icehs.science.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=40;
		int d=50;
		int e=80;
		double k=0.6*a*b/2 + 0.13*(c+d)/2 + e*0.27;
		if(k>=95) System.out.println("Special Class입니다.");
		else if(k>=90) System.out.println("Gold Class입니다.");
		else if(k>=85) System.out.println("Silver Class입니다.");
		else if(k>=80) System.out.println("Bronze Class입니다.");
		else System.out.println("Member입니다.");
		System.out.println(k);
	}

}

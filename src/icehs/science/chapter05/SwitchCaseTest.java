package icehs.science.chapter05;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=40;
		int d=50;
		int e=80;
		double k=0.6*a*b/2 + 0.13*(c+d)/2 + e*0.27;
		switch((int) k/10) {
			case 9: System.out.println("Special Class"); break;
			case 8: System.out.println("Gold Class"); break;
			case 7: System.out.println("Silver Class"); break;
			case 6: System.out.println("Bronze Class"); break;				
			default : System.out.println("Member");
		}
		System.out.println(k); 
	}

}

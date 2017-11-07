package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 1000000;
		int yon = 12*money;
		int bonus = 2*4*money/10;
		System.out.println("연봉 : "+yon);
		System.out.println("세후 연봉 : "+(yon*9/10));
		System.out.println("보너스 : "+bonus);
		System.out.println("세후 보너스 : "+(bonus*945/1000));
		System.out.println("지급액 : "+(yon*9/10 + bonus*945/1000));
	}
}

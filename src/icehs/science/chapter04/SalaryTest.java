package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 1000000;
		int yon = 12*money;
		int bonus = 2*4*money/10;
		System.out.println("���� : "+yon);
		System.out.println("���� ���� : "+(yon*9/10));
		System.out.println("���ʽ� : "+bonus);
		System.out.println("���� ���ʽ� : "+(bonus*945/1000));
		System.out.println("���޾� : "+(yon*9/10 + bonus*945/1000));
	}
}

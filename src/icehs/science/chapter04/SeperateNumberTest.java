package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 456;
		int n1 = n/100;
		int n2 = (n%100 - n%10)/10;
		int n3 = n%10;
		System.out.println("���� : "+n);
		System.out.println("���� �ڸ� �� : "+n1);
		System.out.println("���� �ڸ� �� : "+n2);
		System.out.println("���� �ڸ� �� : "+n3);
	}

}

package icehs.science.chapter04;

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 64;
		System.out.println("¦���Դϱ�? : " + (n%2==0));
		System.out.println("3�� ����Դϱ�? : " + (n%3==0));
		System.out.println("2�� ����̸鼭 7�� ����Դϱ�? : " + ((n%2==0)&&(n%7==0)));
		System.out.println("2�� ����̰ų� 7�� ����Դϱ�? : " + ((n%2==0)||(n%7==0)));
	}

}

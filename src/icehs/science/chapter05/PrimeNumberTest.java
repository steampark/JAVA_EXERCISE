package icehs.science.chapter05;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = getUserInput();
		for(int i=2;i<=k-1;i++) {
			if(k%i==0) {
				System.out.println(k+"��(��) �Ҽ��� �ƴմϴ�.");
				break;
			}
			if(i==k-1) {
				System.out.println(k+"��(��) �Ҽ��Դϴ�.");
			}
		}
		/*for(int i=2;i<=25;i++) {
			if(26%i==0) {
				System.out.println("26�� �Ҽ��� �ƴմϴ�.");
				break;
			}
			if(i==22) {
				System.out.println("26�� �Ҽ��Դϴ�.");
			}
		}*/
	}
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
}

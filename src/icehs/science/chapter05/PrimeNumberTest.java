package icehs.science.chapter05;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = getUserInput();
		for(int i=2;i<=k-1;i++) {
			if(k%i==0) {
				System.out.println(k+"은(는) 소수가 아닙니다.");
				break;
			}
			if(i==k-1) {
				System.out.println(k+"은(는) 소수입니다.");
			}
		}
		/*for(int i=2;i<=25;i++) {
			if(26%i==0) {
				System.out.println("26은 소수가 아닙니다.");
				break;
			}
			if(i==22) {
				System.out.println("26은 소수입니다.");
			}
		}*/
	}
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
}

package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int people = 0;
		int sum=0;
		System.out.print("모임이 몇 차까지 진행되었습니까?");
		int k = getUserInput();
		System.out.println("============================");
		System.out.print("각 차에서 얼마나 썼습니까?");
		while(i<=k) {
			System.out.print(i+"차 비용:");
			sum+=getUserInput();
		}
		System.out.print("총 비용은"+sum+"원입니다.");
		System.out.println("============================");
		System.out.print("모임의 인원수는 몇명입니까?");
		people = getUserInput();
		System.out.println("============================");
		System.out.println("더치페이 금액은??");
	}
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
}

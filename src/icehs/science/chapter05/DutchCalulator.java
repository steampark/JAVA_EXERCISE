package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int people = 0;
		int sum=0;
		int duch = 0;
		int lastduch = 0;
		System.out.print("모임이 몇 차까지 진행되었습니까?");
		int k = getUserInput();
		System.out.println("============================");
		System.out.println("각 차에서 얼마나 썼습니까?");
		while(i<=k) {
			System.out.print(i+"차 비용:");
			sum+=getUserInput();
			++i;
		}
		System.out.print("총 비용은"+sum+"원입니다.");
		System.out.println("============================");
		System.out.print("모임의 인원수는 몇명입니까?");
		people = getUserInput();
		System.out.println("============================");
		System.out.println("더치페이 금액은??");
		i=1;
		duch = sum/people;
		lastduch = sum;
		while(i<=people) {
			if(i==people) System.out.println(people+"."+lastduch);
			else System.out.println(i+"."+duch);
			lastduch -= duch;
			++i;
		}
	}
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
}

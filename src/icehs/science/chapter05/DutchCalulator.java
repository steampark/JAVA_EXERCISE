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
		System.out.print("������ �� ������ ����Ǿ����ϱ�?");
		int k = getUserInput();
		System.out.println("============================");
		System.out.println("�� ������ �󸶳� ����ϱ�?");
		while(i<=k) {
			System.out.print(i+"�� ���:");
			sum+=getUserInput();
			++i;
		}
		System.out.print("�� �����"+sum+"���Դϴ�.");
		System.out.println("============================");
		System.out.print("������ �ο����� ����Դϱ�?");
		people = getUserInput();
		System.out.println("============================");
		System.out.println("��ġ���� �ݾ���??");
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

package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int people = 0;
		int sum=0;
		System.out.print("������ �� ������ ����Ǿ����ϱ�?");
		int k = getUserInput();
		System.out.println("============================");
		System.out.print("�� ������ �󸶳� ����ϱ�?");
		while(i<=k) {
			System.out.print(i+"�� ���:");
			sum+=getUserInput();
		}
		System.out.print("�� �����"+sum+"���Դϴ�.");
		System.out.println("============================");
		System.out.print("������ �ο����� ����Դϱ�?");
		people = getUserInput();
		System.out.println("============================");
		System.out.println("��ġ���� �ݾ���??");
	}
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
}

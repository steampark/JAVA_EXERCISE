package icehs.science.chapter05;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		System.out.print("반의 학생 수는? ");
		int k = getUserInput();
		int sum=0;
		double average=0;
		for(int i=1;i<=k;i++) {
			System.out.print(i+"번 점수 : ");
			sum += getUserInput();
		}
		average = (double) sum/k;
		System.out.println("===============================");
		System.out.println(sum);
		System.out.println(average);
		System.out.println("===============================");
	}
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

}

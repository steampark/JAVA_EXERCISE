package icehs.science.chapter05;
import java.util.*;

public class NumberCheckTest {

	public static void main(String[] args) {
		System.out.print("첫번째 수는?");
		int k1 = getUserInput();
		System.out.print("두번째 수는?");
		int k2 = getUserInput();
		int k = k1*k2;
		if(k<0) System.out.println("음수는 확인하지 않습니다.");
		else if(k<10) System.out.println("한 자리 수 입니다.");
		else if(k<100) System.out.println("두 자리 수 입니다.");
		else System.out.println("세 자리 수 이상입니다.");
	}
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

}
package icehs.science.chapter05;
import java.util.*;

public class NumberCheckTest {

	public static void main(String[] args) {
		System.out.print("ù��° ����?");
		int k1 = getUserInput();
		System.out.print("�ι�° ����?");
		int k2 = getUserInput();
		int k = k1*k2;
		if(k<0) System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		else if(k<10) System.out.println("�� �ڸ� �� �Դϴ�.");
		else if(k<100) System.out.println("�� �ڸ� �� �Դϴ�.");
		else System.out.println("�� �ڸ� �� �̻��Դϴ�.");
	}
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

}
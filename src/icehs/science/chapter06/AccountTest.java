package icehs.science.chapter06;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account();
		account.accountOwner = "ȫ�浿";
		account.accountNumber = "123-456789";
		account.accountMoney = 10000;
		account.show();
		

		while(true) {
			System.out.println("�Ա��ϽǷ��� 1, ����ϽǷ��� 2, ���������� �˰� ������ 0�� �����ʽÿ�.");
			int service = getUserInput();
			
			
			if(service == 1) {
				System.out.print("�Աݱݾ� : ");
				int dep = getUserInput();
				
				if(dep<0) {
					System.out.println("�ݾ׿� ������ �Է��� �� �����ϴ�.");
					continue;
				}
				
				account.deposit(dep);
				System.out.println("�ܾ� : " + account.outMoney());
			}
			
			
			else if(service == 2) {
				System.out.print("��ݱݾ� : ");
				int wit = getUserInput();
				
				if(wit<0) {
					System.out.println("�ݾ׿� ������ �Է��� �� �����ϴ�.");
					continue;
				}
				else if(account.outMoney()-wit<0) {
					System.out.println("�ܾ��� �����մϴ�.");
					continue;
				}
				
				account.withdraw(wit);
				System.out.println("�ܾ� : " + account.outMoney());
			}
			
			
			else if(service == 0) account.show();
			
			
			else System.out.println("�߸��� �Է��Դϴ�. �ٸ� �Է��� ��Ź�մϴ�.");
			System.out.println();
		}
	}
	
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
}

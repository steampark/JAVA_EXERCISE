package icehs.science.chapter06;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account();
		account.accountOwner = "홍길동";
		account.accountNumber = "123-456789";
		account.accountMoney = 10000;
		account.show();
		

		while(true) {
			System.out.println("입금하실려면 1, 출금하실려면 2, 계좌정보를 알고 싶으면 0을 누르십시오.");
			int service = getUserInput();
			
			
			if(service == 1) {
				System.out.print("입금금액 : ");
				int dep = getUserInput();
				
				if(dep<0) {
					System.out.println("금액에 음수를 입력할 수 없습니다.");
					continue;
				}
				
				account.deposit(dep);
				System.out.println("잔액 : " + account.outMoney());
			}
			
			
			else if(service == 2) {
				System.out.print("출금금액 : ");
				int wit = getUserInput();
				
				if(wit<0) {
					System.out.println("금액에 음수를 입력할 수 없습니다.");
					continue;
				}
				else if(account.outMoney()-wit<0) {
					System.out.println("잔액이 부족합니다.");
					continue;
				}
				
				account.withdraw(wit);
				System.out.println("잔액 : " + account.outMoney());
			}
			
			
			else if(service == 0) account.show();
			
			
			else System.out.println("잘못된 입력입니다. 다른 입력을 부탁합니다.");
			System.out.println();
		}
	}
	
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
}

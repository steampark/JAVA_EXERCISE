package icehs.science.chapter06;

public class Account {
	String accountOwner;
	String accountNumber;
	int accountMoney;
	
	public void deposit(int dep) {
		System.out.println(dep + "원 입금합니다.");
		accountMoney += dep;
	}
	
	public void withdraw(int wit) {
		System.out.println(wit + "원 출금합니다.");
		accountMoney -= wit;
	}
	
	public int outMoney() {
		return accountMoney;
	}
	
	public void show() {
		System.out.println("예금주 : " + accountOwner);
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("잔액 : " + accountMoney);
	}
}

package icehs.science.chapter06;

public class Account {
	String accountOwner;
	String accountNumber;
	int accountMoney;
	
	public void deposit(int dep) {
		System.out.println(dep + "�� �Ա��մϴ�.");
		accountMoney += dep;
	}
	
	public void withdraw(int wit) {
		System.out.println(wit + "�� ����մϴ�.");
		accountMoney -= wit;
	}
	
	public int outMoney() {
		return accountMoney;
	}
	
	public void show() {
		System.out.println("������ : " + accountOwner);
		System.out.println("���¹�ȣ : " + accountNumber);
		System.out.println("�ܾ� : " + accountMoney);
	}
}

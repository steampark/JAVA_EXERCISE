package icehs.science.chapter06;

public class Chocolate {
	String name;
	String type;
	int price;
	public String getName() {
		return name;
	}
	public int calculateTotalPrice(int count) {
		return count*price;
	}
	public void changeChocolateInfo(String newName, int newPrice) {
		name = newName;
		price = newPrice;
		printChocolateInfo();
	}
	public void printChocolateInfo() {
		System.out.println("�̸� : " +name + ", ���� : " + type + ", ���� : " +price);
	}
}

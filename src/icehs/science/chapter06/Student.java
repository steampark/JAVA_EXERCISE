package icehs.science.chapter06;

public class Student {
	String name;
	String stId;
	int kor;
	int math;
	int eng;
	
	public double average() {
		double avg = (kor+math+eng)/3;
		return avg;
	}
	
	public void show( ) {
		System.out.println("�л��� �̸� : " + name);
		System.out.println("�л��� �й� : " + stId);
		System.out.println("�л��� �������� : " + kor);
		System.out.println("�л��� �������� : " + math);
		System.out.println("�л��� �������� : " + eng);
		System.out.println("�л��� ��� : " + average());
	}
	
	public void changeStId(String a) {
		stId = a;
	}
}

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
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 학번 : " + stId);
		System.out.println("학생의 국어점수 : " + kor);
		System.out.println("학생의 수학점수 : " + math);
		System.out.println("학생의 영어점수 : " + eng);
		System.out.println("학생의 평균 : " + average());
	}
	
	public void changeStId(String a) {
		stId = a;
	}
}

package icehs.science.chapter05;

public class GradeIfElseifTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dongscore = 92;
		if(dongscore >= 90) {
			System.out.println("홍길동 : A학점 입니다.");
		}
		if(dongscore >= 80) {
			System.out.println("홍길동 : B학점 입니다.");
		}
		if(dongscore >= 70) {
			System.out.println("홍길동 : C학점 입니다.");
		}
		if(dongscore >= 60) {
			System.out.println("홍길동 : D학점 입니다.");
		}
		else {
			System.out.println("홍길동 : 낙제했습니다.");
		}
	}

}

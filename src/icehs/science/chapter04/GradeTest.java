package icehs.science.chapter04;

public class GradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 75;
		System.out.println("A학점 : " + ((90 <= score)&&(score<=100)));
		System.out.println("B학점 : " + ((80 <= score)&&(score<=89)));
		System.out.println("C학점 : " + ((70 <= score)&&(score<=79)));
		System.out.println("D학점 : " + ((60 <= score)&&(score<=69)));
	}

}

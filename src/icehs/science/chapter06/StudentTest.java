package icehs.science.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.name = "ȫ�浿";
		student.stId = "S001";
		student.kor = 94;
		student.eng = 80;
		student.math = 89;
		
		student.show();
		student.changeStId("STU0001");
		student.show();
		
	}

}

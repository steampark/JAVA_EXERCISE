package icehs.science.chapter05;

public class ConditionIfElseifEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15;
		if(age>=19) {
			System.out.println("확인되었습니다.");
			System.out.println("즐거운 시간 보내시길 바랍니다.");
		}
		else if(age>=13) {
			System.out.println("청소년 확인했습니다.");
			System.out.println("보호자의 동의가 있으면 입장이 가능합니다.");
		}
		else {
			System.out.println("어린이로 확인되었습니다.");
			System.out.println("입장이 불가합니다.");
		}
	}

}

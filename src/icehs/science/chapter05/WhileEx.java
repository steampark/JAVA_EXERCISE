package icehs.science.chapter05;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int index=1;
		while(sum<10) {
			sum+=index;
			System.out.println(index++ + ":" +sum);
		}
	}

}

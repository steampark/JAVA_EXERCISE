package icehs.science.chapter05;

public class BreakSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
			if(sum>=30) break;
		}
		System.out.print(sum);
	}

}

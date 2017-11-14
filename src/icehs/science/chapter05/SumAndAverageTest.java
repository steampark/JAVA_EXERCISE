package icehs.science.chapter05;

public class SumAndAverageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		double average=0;
		for(int i=1;i<=500;i++) {
			sum+=i;
		}
		average=sum/500;
		System.out.println(sum);
		System.out.println(average);
	}

}

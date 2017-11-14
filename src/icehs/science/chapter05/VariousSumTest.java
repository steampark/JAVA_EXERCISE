package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int EvenSum = 0;
		int OddSum = 0;
		for(int i=1;i<=1000;i++) {
			if(i%2==0) EvenSum += i;
			else OddSum +=i;
		}
		System.out.println(EvenSum);
		System.out.println(OddSum);
	}

}

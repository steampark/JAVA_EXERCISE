package icehs.science.chapter05;

public class MultipleFiveSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int index=1;
		while(sum<100) {
			sum+=5*index;
			System.out.println(index + ".(+" + 5*index + ") " + sum);
			index++;
		}
	}

}

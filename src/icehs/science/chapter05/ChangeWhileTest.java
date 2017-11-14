package icehs.science.chapter05;

public class ChangeWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, j=1;
		while(i<=10) {
			while(j<=10) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			j=1;
		}
	}

}

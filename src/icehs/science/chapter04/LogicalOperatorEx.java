package icehs.science.chapter04;

public class LogicalOperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10, n2 = 3;
		boolean r1 = (n1>n2)&&(n1>5);
		boolean r2 = (n1>n2)&&(n1==n2);
		boolean r3 = (n1<=n2)||(n1!=5);
		boolean r4 = (n1<=n2)&&(n1>n2);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(!r4);
	}

}

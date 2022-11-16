package br.com.myproject;

public class MathematicsTest {

	public static void main(String[] args) {
		
		Mathematics m = new Mathematics();
		int larger = m.larger(20, 30);
		System.out.println(larger);
		
		double sum = m.sum(50, 60);
		System.out.println(sum);
	}
}

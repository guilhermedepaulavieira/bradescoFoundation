package br.com.myproject;

public class Mathematics {

	int larger(int one, int two) {
		if (one > two) {
			return one;
		} else {
			return two;
		}
	}
	
	double sum(double one, double two) {
		double s = one + two;
		return s;
	}
}

package model;

public class Circle {
	
	/*
	 * Utility methods: not requiring creating of objects in order to use them.
	 */
	public int calc(int m) {
		int k = -1, b = -1;
		while (b < 18) {
			k += 3;
			b++;
		}
		return k;
	}
}

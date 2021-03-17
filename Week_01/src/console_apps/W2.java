package console_apps;

public class W2 {
	public static double[] method(int[] a, double x) {
		double [] b = new double [2];
		b[0] = a[0] + x;
		b[1] = a[1] + x;
		return b;
	}
public static void method(int[] a, int m) {
	double[] b = method (a, 6.0);
	a[0] = a[0] * m;
	a[2] = (int) (b[0] + b[1]);
	m = m + 5;
}

public void question() {
	int[] a = {4,1,3,5};
	method(a,2);
	System.out.println(a[0]);
}
}


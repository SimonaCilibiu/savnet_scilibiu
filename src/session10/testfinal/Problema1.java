package session10.testfinal;

public class Problema1 {
	public static double harmonicAvg(int a, int b) {
		double mh = 0;
		mh = (2 * a * b) / (a + b);
		if (a + b == 0) {
			return 0;
		}
		return mh;
	}
}

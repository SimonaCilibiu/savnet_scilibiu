package session10.testfinal;

public class Problema3 {
	public static int next(int[] arr, int n) {
		if (n == arr.length - 1) {
			return -1;
		} else if (n > arr.length) {
			return -2;
		}
		return arr[n + 1];
	}
}

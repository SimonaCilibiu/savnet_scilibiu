package session10.testfinal;

public class Problema3 {
	public static int next(int[] arr, int n) {
		if (n == arr.length - 1) {
			return -1;
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == n) {
					return arr[i + 1];
				}
			}
			return -2;
		}
	}
}

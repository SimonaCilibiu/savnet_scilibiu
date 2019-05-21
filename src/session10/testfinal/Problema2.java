package session10.testfinal;

public class Problema2 {
	public static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i - 1] < arr[i]) {
				return true;
			}
		}
		return false;
	}
}
package session10.testfinal;

public class Problema4 {
	public static int[] insert(int[] arr, int pos, int n) {
		int[] result = new int[n];
		if (pos < 0 || pos > arr.length) {
			return null;
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (pos == arr.length) {
					result[n] = arr[pos - 1];

					if (pos < arr.length) {
						result[n] = arr[pos];
						return result;
					}
				}
			}
		}
		return result;
	}
}
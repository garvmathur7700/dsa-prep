public class SearchIn2dMatrix {
	public static boolean searchMatrix(int[][] matrix, int k) {
		 return binarySearch(
				 matrix, 
				 k, 
				 0, 
				 ((matrix.length * matrix[0].length) - 1));
	}

	private static boolean binarySearch(
			int[][] matrix, 
			int k, 
			int start, 
			int end) {

		int low = start;
		int high = end;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			int m = mid / matrix[0].length;
			int n = mid % matrix[0].length;

			if (k == matrix[m][n]) return true;
			else if (k < matrix[m][n]) high = mid - 1;
			else if (k > matrix[m][n]) low = mid + 1;
		}

		return false;
	}

	public static void main (String[] argv) {
		int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
		System.out.println(searchMatrix(matrix, 5));
	}
}

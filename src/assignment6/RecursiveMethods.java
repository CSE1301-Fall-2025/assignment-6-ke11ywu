package assignment6;

public class RecursiveMethods {

	/**
	 * Recursively computes base ^ exponent
	 * 
	 * @param base the base - can be positive or negative
	 * @param exp  the exponent - can be positive or negative
	 * @return base ^ exponent
	 */
	public static double exponent(int base, int exp) {
			
			if (exp == 0){
				return 1;
			}
			if (exp < 0) {
				return 1.0 / (base) * (exponent(base, exp+1));
				
			} else {
				return base * exponent(base, exp-1);
			}

			// FIXME Recursively compute base^exp
			
	}

	

	/**
	 * Recursively compute the sum of elements in an array
	 * 
	 * @param array an array of integers
	 * @return the sum of the elements in values
	 */
	public static int arraySum(int[] array) {
			int sum = 0;
			int index = 0;
			sum = addSum(array, index, sum);
			// FIXME: Recursively compute the sum of the values in an array
			return sum;
			
	}

	public static int addSum(int[] array, int index, int sum){
		if (index == array.length){
				return sum;
			}
		sum = sum + array[index] + addSum(array, index + 1, sum);
		return sum;
	}

	/**
	 * Recursively computes string representations of dragon curves
	 * 
	 * @param n the desired degree of the dragon curve
	 * @return the nth dragon curve
	 */
	public static String dragon(int n) {
			
			// FIXME Recursively compute dragon curves
			return "";
			
	}

	

	/**
	 * Finds the length of the longest path in the given 2D array from the specified
	 * start position.
	 * 
	 * @param chart 2D array of stones
	 * @param r     start position row
	 * @param c     start position column
	 * @return the length of the longest path that was found
	 */
	public static int maxPathLength(boolean[][] chart, int r, int c) {
		if (r < 0 || r >= chart.length || c < 0 || c >= chart[0].length){
			return 0;
		}
		if (!chart[r][c]){
			return 0;
		}

		chart[r][c] = false;
		int moveUp = maxPathLength(chart, r - 1, c);
		int moveDown = maxPathLength(chart, r + 1, c);
		int moveLeft = maxPathLength(chart, r, c - 1);
		int moveRight = maxPathLength(chart, r, c + 1);

		// FIXME Find and return the length of the longest path in the array
		int maxNeighbor = Math.max(Math.max(moveUp, moveDown), Math.max(moveLeft, moveRight));

		chart[r][c] = true;

		return 1 + maxNeighbor;
			
	}
}

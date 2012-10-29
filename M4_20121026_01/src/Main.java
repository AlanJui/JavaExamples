
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*****		
		long [] row;
		row = new long[2];
		row[1] = 6;
		System.out.println(row[0]);
		System.out.println(row[1]);
//		System.out.println(row[2]);
		
//		row = null;
//		System.out.println(row[1]);
		
		long[] col = new long[] {1, 2, 3, 4, 5};
		long[] numList = {1, 2, 3, 4, 5};
		
		int[][] grid = {
				{5, 4, 3},
				{7, 8, 9}
		};
		int r = 1; int c = 2;
		System.out.printf("grid[%d][%d] = %d", r, c, grid[r][c]);
	*****/
		long[] row = new long[4];
		long[] copy = row;
		System.out.println(copy[0]);
		row[0]++;
		System.out.println(copy[0]);
		
		/*
		 * 純手工打造，Array 的複製
		 */
		System.out.println("============================================");
		long[] copyArray = new long[4];
		for (int i=0; i<row.length; i++) {
			copyArray[i] = row[i];
		}
		
		int idx = 0;
		for (long valueOfElement: copyArray) {
			System.out.printf("copyArray[%d] = %d\n", idx++, valueOfElement);
		}
		/*
		 * 改用 Class 的 Method 來完成 Array 複製
		 */
		System.out.println("============================================");
		long[] cloneArray = ArrayTool.createArray(4);
		ArrayTool.copyArray(row, cloneArray);
		ArrayTool.printArray(cloneArray);
		
		System.out.println("============================================");
		int[] array;
		array = new int[] {1, 2, 3};
		System.out.println("array = " + array);
		System.out.printf("array = %s\n", array);
//		System.out.printf("array = %d\n", array);
		
		/*
		 * 以下均為 Array 變數錯誤用法的示範
		 * 正確：int[] array1 = new int[] {1, 2, 3, 4} ;
		 */
		// 1.
//		int[] array1;
//		arra1 = {1, 2, 3, 4};
		
		// 2.
//		int[] array1 = new int[4] {1, 2, 3, 4};
		
		// 3.
//		int[] array1 = new int[];
	}

}

class ArrayTool {
	
	static long[] createArray(int size) {
		long[] result = new long[size];
		return result;
	}
	
	static void copyArray(long[] source, long[] target) {
		
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
	}
	
	static void printArray(long[] array) {
		int idx = 0;
		for (long valueOfElement: array) {
			System.out.printf("array[%d] = %d\n", idx++, valueOfElement);
		}
	}
}

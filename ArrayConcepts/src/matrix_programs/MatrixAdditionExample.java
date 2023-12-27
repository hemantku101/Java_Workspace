package matrix_programs;

public class MatrixAdditionExample {
	public static void additionMatrix(int mat1[][], int mat2[][]) {
		// creating another matrix to store the sum of two matrices
		int c[][] = new int[4][3]; // 4 rows and 3 columns

		// adding and printing addition of 2 matrices
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = mat1[i][j] + mat2[i][j]; // use - for subtraction
				System.out.print(c[i][j] + " ");
			}
			System.out.println();// new line
		}
	}

	public static void main(String args[]) {
		// creating two matrices
		int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 }, { 4, 5, 6 }};
		int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 }, { 2, 5, 4 }};

		additionMatrix(a, b);
	}
}
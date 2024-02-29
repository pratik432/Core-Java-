package Problems;



public class ArrayOper {

	public static void main(String args[]) {

		int a[] = { 1, 1, 1, 1, 1, 1, 1 };
		a[1] = 6;
		a[2] = 5;
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i]);

		}
		System.out.println("");

		char b[][] = { { 'X', 'Y', 'Z' }, { 'A', 'B', 'C' } };

		b[0][2] = 'y';
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 2; j++)
				System.out.print(b[i][j]);
		}

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] product = {{1}};
		
		for (int i=0;i<n;i++) {
			product = multiply(product, readinMatrix(sc));
		}
		
		printNumbers(product);

	}

	private static void printNumbers(int[][] product) {
		// TODO Auto-generated method stub
		int maxEle = Integer.MIN_VALUE;
		int minEle = Integer.MAX_VALUE;
		int maxRowSum = Integer.MIN_VALUE;
		int minRowSum = Integer.MAX_VALUE;
		int maxColSum = Integer.MIN_VALUE;
		int minColSum = Integer.MAX_VALUE;
		for (int i=0;i<product.length;i++) {
			int rowSum = 0;
			for (int j=0;j<product[0].length;j++) {
				if (maxEle<product[i][j])
					maxEle = product[i][j];
				if (minEle>product[i][j])
					minEle = product[i][j];
				rowSum+=product[i][j];
			}
			if (maxRowSum<rowSum)
				maxRowSum=rowSum;
			if (minRowSum>rowSum)
				minRowSum=rowSum;
		}
		
		for (int j=0;j<product[0].length;j++) {
			int colSum=0;
			for (int i=0;i<product.length;i++) {
				colSum+=product[i][j];
			} 
			if (maxColSum<colSum)
				maxColSum=colSum;
			if (minColSum>colSum)
				minColSum=colSum;
		}
		
		System.out.println(maxEle);
		System.out.println(minEle);
		System.out.println(maxRowSum);
		System.out.println(minRowSum);
		System.out.println(maxColSum);
		System.out.println(minColSum);
		
	}

	private static int[][] readinMatrix(Scanner sc) {
		// TODO Auto-generated method stub
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] result = new int[rows][cols];
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				result[i][j]=sc.nextInt();
			}
		}
		return result;
	}

}

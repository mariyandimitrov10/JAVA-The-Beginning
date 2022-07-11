package Exercise;

public class ArrayZweidimensionaleAusgabe {

	public static void main(String[] args) {
		int[][] newArr = {{1,8,9},{4,2,10},{ 2,2,8}};
		
		for (int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
				System.out.print(newArr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}

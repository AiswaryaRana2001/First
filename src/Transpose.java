
public class Transpose {
	public static void main(String[] args) {
		
		int a[][] = {{1,1,1},{2,2,2},{3,3,3}};
		int A[][]= new int[3][3];
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				A[j][i]= a[i][j];
				System.out.print(A[j][i]);
			}
			System.out.println();
		}
		

	}
}

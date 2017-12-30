package Arrays;

public class MatrixMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				mat[i][j]=i+j+1;
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				int sum=0;
				for(int k=0;k<3;k++)
					sum+=mat[i][k]*mat[k][j];
				System.out.print(sum+" ");
			}
			System.out.println();
		}			

	}

}

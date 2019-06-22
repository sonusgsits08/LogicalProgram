package com.matrix;
/*print matrix in spiral form*/
public class MatrixScanSpiral {
	public static void main(String[] args) {
		int mat[][] = { {2, 4, 10}, {3, 6, 9}, {7, 8, 11} };						
		MatrixScanSpiral rn = new MatrixScanSpiral();
		rn.scanMatrix(mat,3,3);
	}

	void scanMatrix(int array[][],int m_row,int n_col) {
				int direction=0;  // 0=forward, 1=backward
				for(int i=0;i<m_row;i++)   // row
				{
				if(direction==0){
					int j=0;
				    while(j<n_col) 
					{
					System.out.print(" "+array[i][j]);
					j++;
					}
					direction=1;
					continue;
				}
				if(direction==1){
					int j=n_col-1;
					while(j>0){
						System.out.print(" "+array[i][j]);
					j--;
					}
					direction=0;
				}
				System.out.println();
				}

	}
}

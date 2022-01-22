/*
  if a element in matrix is zero the all the element of that row
  and col should zero
*/
// time complexity =O(N^3)
class Solution {
    public void setZeroes(int[][] matrix) {
        int i,j,k;
        int[][] result=new int[matrix.length][matrix[0].length];
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[i].length;j++){
                result[i][j]=matrix[i][j];
                
            }
        }
        
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    for(k=0;k<matrix[i].length;k++){
                        result[i][k]=0;
                    }
                    for(k=0;k<matrix.length;k++){
                        result[k][j]=0;
                    }
                }
            }
        }
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[i].length;j++){
                matrix[i][j]=result[i][j];
                
            }
        }
        
        
    }
}
class Solution {
    public void rotate(int[][] matrix) {
     int n = matrix.length;
     for(int i =0;i<n;i++)  {
        for(int j = i+1;j<n;j++){
            // mat[i][j] = mat[j][i];
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
     } 
     // reverse every row using 2 pointer
     for(int i =0;i<n;i++){
        // imagine treating each row as an array
        int left =0,right = n-1;
        while(left < right){
            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp;
            left++;
            right--;
        }

     }
    }
}

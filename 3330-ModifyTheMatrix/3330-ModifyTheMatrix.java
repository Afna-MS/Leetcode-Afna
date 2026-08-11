// Last updated: 11/08/2026, 15:59:57
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=matrix[i][j];
            }
        }
        for(int j=0;j<n;j++){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<m;i++){
                max=Math.max(max,arr[i][j]);
            }
            for(int i=0;i<m;i++){
                if(arr[i][j]==-1)
                arr[i][j]=max;
            }
        } 
        return arr;       
    }
}
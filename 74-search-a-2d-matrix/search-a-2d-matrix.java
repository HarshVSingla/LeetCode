class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;
        int a =0;

        int[] arr = new int[m*n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[a] = matrix[i][j];
                a++;
            }
        }

        int left=0;
        int right = arr.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(arr[mid]==target){
                return true;
            }

            if(target>arr[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        return false;

        
    }
}
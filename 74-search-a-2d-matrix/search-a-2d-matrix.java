class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // 1st Approach - with extra space cuz array introduced

        // int m = matrix.length;
        // int n = matrix[0].length;
        // int a =0;

        // int[] arr = new int[m*n];

        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         arr[a] = matrix[i][j];
        //         a++;
        //     }
        // }

        // int left=0;
        // int right = arr.length-1;

        // while(left<=right){
        //     int mid = left + (right-left)/2;

        //     if(arr[mid]==target){
        //         return true;
        //     }

        //     if(target>arr[mid]){
        //         left = mid+1;
        //     }
        //     else{
        //         right = mid-1;
        //     }
        // }

        // return false;


        // 2nd approach

        int n = matrix.length;
        int m = matrix[0].length;

        int left =0;
        int right = m*n -1;


        while(left<=right){

            int mid = left + (right-left)/2;
            int row = mid/m;
            int col = mid%m;

            if(matrix[row][col] == target){
                return true;
            }

            if(matrix[row][col]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }


        }

        return false;
        
    }
}
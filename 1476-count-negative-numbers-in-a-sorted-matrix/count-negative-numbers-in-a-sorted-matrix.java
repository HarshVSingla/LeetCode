class Solution {
    public int countNegatives(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int count=0;

        // 1st approach - binary of every array

        // for(int i=0;i<m;i++){

        //     int left=0;
        //     int right = n-1;
        //     int idx=n;

        //     while(left<=right){

        //         int mid = left+(right-left)/2;

        //         if(grid[i][mid]>=0){
        //             left = mid+1;
        //         }
        //         else{
        //             idx = mid;
        //             right = mid-1;
        //         }
        //     }

        //     count+= n-idx;

        // }
        // return count;


        // 2nd approach - optimal - follow up

        int row = m-1;
        int col =0;
        

        while(col<n && row>=0){

            if(grid[row][col]<0){
                count+= n-col;
                row--;
            }
            else{
                col++;
            }
        }
        return count;

    }
}
class Solution {
    public int[] concatWithReverse(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[2*n];

        for(int i=0;i<n;i++){
            ans[i] = nums[i];
        }
        int m = ans.length;

        for(int i=n-1;i>=0;i--){
            ans[m-i-1] = nums[i];
        }

        return ans;
    }
}
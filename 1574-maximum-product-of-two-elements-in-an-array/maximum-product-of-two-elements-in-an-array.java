class Solution {
    public int maxProduct(int[] nums) {
        
        int max = nums[0];
        int sec = Integer.MIN_VALUE;

        for(int i=1;i<nums.length;i++){

            if(nums[i]>=max){
                sec  = max;
                max = nums[i];
            }

            if(nums[i]<max && nums[i]>sec){
                sec = nums[i];
            }
        }

        return (max-1)*(sec-1);


        // 2nd approach

        // Arrays.sort(nums);
        // int n = nums.length;
        // return (nums[n-1] -1)*(nums[n-2]-1);

    }
}
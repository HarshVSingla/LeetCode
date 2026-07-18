class Solution {
    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length-1;

        int min = Integer.MAX_VALUE;

        while(left<=right){

            if(nums[left]<nums[right]){
                min = Math.min(min,nums[left]);
                return min;
            }
            if(nums[left]==nums[right]){
                while(right>left && nums[right]==nums[left]){
                    right--;
                }
            }

            int mid = left + (right-left)/2;

            if(nums[left]<=nums[mid]){
                min = Math.min(min,nums[left]);
                left = mid+1;
            }
            else{
                min = Math.min(min,nums[mid]);
                right = mid-1;
            }


        }

        return min;
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int left =0;
        int n = nums.length;
        int right = n-1;

        int[] ans = new int[2];
        int min = -1;
        int max = -1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(nums[mid]==target){
                min = mid;
                max = mid;

                while(min >0 && min<=max && nums[min-1]==target){
                    min--;
                }
                while(max <n-1 && max>=min && nums[max+1]==target){
                    max++;
                }

                break;


            }


            if(nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        ans[0] = min;
        ans[1] = max;

        return ans;

    }
}
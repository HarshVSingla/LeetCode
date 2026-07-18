class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        // 1st Approach: TC - O(n) -> not optimal
        // int left =0;
        // int n = nums.length;
        // int right = n-1;

        // int[] ans = new int[2];
        // int min = -1;
        // int max = -1;

        // while(left<=right){
        //     int mid = left + (right-left)/2;

        //     if(nums[mid]==target){
        //         min = mid;
        //         max = mid;

        //         while(min >0 && min<=max && nums[min-1]==target){
        //             min--;
        //         }
        //         while(max <n-1 && max>=min && nums[max+1]==target){
        //             max++;
        //         }
        //         break;
        //     }

        //     if(nums[mid]>target){
        //         right = mid-1;
        //     }
        //     else{
        //         left = mid+1;
        //     }
        // }
        // ans[0] = min;
        // ans[1] = max;
        // return ans;


        // 2nd Approach -> TC-O(log(n));

        int n = nums.length;
        int left =0;
        int right = n-1;

        int min =-1;
        int max =-1;
        int[] ans = new int[2];

        while(left<=right){
            int mid = left + (right-left)/2;

            if(nums[mid]==target){
                min = mid;
                right = mid-1;

            }

            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            } 
        }

        if(min==-1){
            ans[0] = min;
            ans[1] = -1;
            return ans;
        }
        else{

            ans[0] = min;

            left = min;
            right = n-1;

            while(left<=right){
                int mid = left + (right-left)/2;

                if(nums[mid]==target){
                    max = mid;
                    left = mid+1;
                }

                else if(nums[mid]>target){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }

            ans[1] = max;


        }

        return ans;


    }
}
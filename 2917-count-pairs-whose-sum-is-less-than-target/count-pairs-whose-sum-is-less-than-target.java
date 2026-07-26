class Solution {
    public int countPairs(List<Integer> nums, int target) {
        
        // 1st approach - most optimal 
        // Collections.sort(nums);
        // int left =0;
        // int right = nums.size() -1;
        // int count=0;
        // while(left<right){
        //     int x = nums.get(right) + nums.get(left);
        //     if(x>=target){
        //         right--;
        //     }
        //     else if(x<target){
        //         count+= right-left;
        //         left++;
        //     }
        // }
        // return count;


        // 2nd approach - binary search 

        Collections.sort(nums);

        int n = nums.size();
        int count=0;

        for(int i=0;i<n-1;i++){
            int left = i+1;
            int right = n-1;
            int valid = i;

            while(left<=right){

                int mid = left + (right-left)/2;

                if(nums.get(mid)+nums.get(i)<target){
                    valid = mid;
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }

            count+= valid-i;
        }

        return count;

    }
}
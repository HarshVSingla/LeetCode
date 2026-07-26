class Solution {
    public int countPairs(List<Integer> nums, int target) {
        
        Collections.sort(nums);

        int left =0;
        int right = nums.size() -1;
        int count=0;

        while(left<right){
            int x = nums.get(right) + nums.get(left);

            if(x>=target){
                right--;
            }
            else if(x<target){
                count+= right-left;
                left++;
            }

        }

        return count;

    }
}
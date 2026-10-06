class Solution {
    public double findMaxAverage(int[] nums, int k) {

        
        int left =0;
        int right =0;
        double sum =0;

        while(right<k){
            sum+= nums[right];
            right++;
        }

        double maxv = sum/k;

        while(right<nums.length){
            sum-= nums[left];
            left++;
            sum+= nums[right];
            right++;
            double avg = sum/k;
            maxv = Math.max(maxv,avg);
        }

        return maxv;
        
    }
}
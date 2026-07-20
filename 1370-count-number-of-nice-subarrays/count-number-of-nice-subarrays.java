class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int left =0;
        int count =0;
        int sum =0;
        int n = nums.length;


        for(int right =0;right <n;right++){

            sum+= nums[right]%2;

            while(sum>k){
                sum-= nums[left]%2;
                left++;
            }

            count += right-left +1;
        }

        int countles =0;
        left =0;
        sum =0;
        if(k!=0){

            for(int right=0;right<n;right++){
                sum+= nums[right]%2;

                while(sum>=k){
                    sum-= nums[left]%2;
                    left++;
                }

                countles+=  right-left+1;
            }
        }

        return count-countles;
    }
}
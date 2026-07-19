class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int count =0;
        int prefix =0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int right =0;right<nums.length;right++){

            prefix+= nums[right];

            count+= map.getOrDefault(prefix-goal,0);
            map.put(prefix,map.getOrDefault(prefix,0)+1);     

        }

        return count;
        
    }
}
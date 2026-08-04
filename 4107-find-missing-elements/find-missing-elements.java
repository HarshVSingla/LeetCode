class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int n = nums.length;

        int max = nums[0];
        int min = nums[0];

        for(int i=0;i<n;i++){

            set.add(nums[i]);
            if(nums[i]>max){
                max = nums[i];
            }
            else if(nums[i]<=min){
                min = nums[i];
            }
        }

        for(int i=min+1;i<=max-1;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}
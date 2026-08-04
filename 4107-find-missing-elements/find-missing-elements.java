class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();

        if(nums.length== 0){
            return ans;
        }
        int n = nums.length;

        int max = nums[0];
        int min = nums[0];

        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
            }
            else if(nums[i]<=min){
                min = nums[i];
            }
        }

        for(int i = min+1;i<=max-1;i++){
           ans.add(i); 
        }

        for(int i=0;i<n;i++){
            if(ans.contains(nums[i])){
                ans.remove(Integer.valueOf(nums[i]));
            }
        }

        Collections.sort(ans);
        return ans;
    }
}
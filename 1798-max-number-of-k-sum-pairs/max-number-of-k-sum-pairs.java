class Solution {
    public int maxOperations(int[] nums, int k) {
        
        int oper = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(!map.containsKey(k-nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            else{
                oper++;
                map.put(k-nums[i],map.get(k-nums[i])-1);
                if(map.get(k-nums[i])==0){
                    map.remove(k-nums[i]);
                }
            }

        }

        return oper;

    }
}
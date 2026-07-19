class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int mx =0;
        for(Integer num : map.values()){
            mx = Math.max(mx,num);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<mx;i++){

            int size = map.size();

            List<Integer> arr = new ArrayList<>();

            for(Integer num : new ArrayList<>(map.keySet())){
                arr.add(num);
                map.put(num,map.get(num)-1);
                if(map.get(num)==0){
                    map.remove(num);
                }
            }

            ans.add(arr);

        }

        return ans;


        
    }
}
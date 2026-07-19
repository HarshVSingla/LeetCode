class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        // 1st approach

        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // int mx =0;
        // for(Integer num : map.values()){
        //     mx = Math.max(mx,num);
        // }
        // List<List<Integer>> ans = new ArrayList<>();

        // for(int i=0;i<mx;i++){

        //     int size = map.size();

        //     List<Integer> arr = new ArrayList<>();

        //     for(Integer num : new ArrayList<>(map.keySet())){
        //         arr.add(num);
        //         map.put(num,map.get(num)-1);
        //         if(map.get(num)==0){
        //             map.remove(num);
        //         }
        //     }

        //     ans.add(arr);
        // }
        // return ans;


        // 2nd approach:

        HashMap<Integer,Integer> map = new HashMap<>();

        List<List<Integer>> ans = new ArrayList<>();

        for(int num : nums){

            int count = map.getOrDefault(num,0);

            if(count==ans.size()){
                ans.add(new ArrayList<>());
            }

            ans.get(count).add(num);
            map.put(num,count+1);

        } 

        return ans;

        
    }
}
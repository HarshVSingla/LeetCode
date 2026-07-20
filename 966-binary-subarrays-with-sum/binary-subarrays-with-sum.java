class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        // int count =0;
        // int prefix =0;

        // HashMap<Integer,Integer> map = new HashMap<>();
        // map.put(0,1);

        // for(int right =0;right<nums.length;right++){

        //     prefix+= nums[right];

        //     count+= map.getOrDefault(prefix-goal,0);
        //     map.put(prefix,map.getOrDefault(prefix,0)+1);     

        // }

        // return count;



        // 2nd approach - more optimal ig 

        int left =0;
        int count=0;
        int countles=0;
        int sum =0;
        int n = nums.length;


        for(int right =0;right<n;right++){

            sum+= nums[right];

            while(sum>goal){
                sum-= nums[left];
                left++;
                if(left==n){
                    break;
                }
            }

            count+= right-left+1;
  
        }
        sum =0;
        left=0;

        if(goal==0){
            countles =0;
        }
        else{

            for(int right =0;right<n;right++){
            sum+= nums[right];

            while(sum>=goal){
                sum-= nums[left];
                left++;
                if(left==n){
                    break;
                }
            }

            countles+= right-left+1;
        }


        }
        
        return count-countles; 
        
    }
}
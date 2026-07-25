class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 1st approach:

        // HashMap<Character,Integer> map = new HashMap<>();
        // int max=0;
        // int left=0;
        // for(int right=0;right<s.length();right++){
        //     map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);

        //     while(map.get(s.charAt(right))>1){

        //         map.put(s.charAt(left),map.get(s.charAt(left))-1);
        //         if(map.get(s.charAt(left))==0){
        //             map.remove(s.charAt(left));
        //         }
        //         left++;
        //     }
        //     max = Math.max(max,right-left+1);
        // }
        // return max;      


        // 2nd approach; more optimal becuase while loop is not used, 

        int max =0;
        int left =0;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int right =0;right<s.length();right++){

            char x = s.charAt(right);

            if(map.containsKey(x)){
                left = Math.max(left,map.get(x)+1);
            }

            map.put(x,right);

            max = Math.max(max,right-left+1);
        }

        return max;
    }
}
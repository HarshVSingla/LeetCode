class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
    HashSet<Integer> set = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();

    for(int x: nums1){
        set.add(x);
    }

    for(int x : nums2){
        if(set.contains(x)){
            set2.add(x);
        }
    }

    
    int[] ans = new int[set2.size()];
    int a =0;
    for(Integer x : set2){
        ans[a++] = x;
    }

    return ans;



    // 2nd approach: 




    }
}
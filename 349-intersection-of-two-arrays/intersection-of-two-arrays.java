class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
    HashSet<Integer> set = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();

    for(int x: nums1){
        set.add(x);
    }

    for(int x : nums2){
        set2.add(x);
    }

    set.retainAll(set2);

    int[] ans = new int[set.size()];
    int a =0;
    for(Integer x : set){
        ans[a++] = x;
    }

    return ans;
    }
}
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        // List<Integer> arr = new ArrayList<>();

        // Arrays.sort(nums);

        // int right = nums.length -1;
        // int left =0;

        // while(left<=right){
        //     int mid = left+ (right-left)/2;
        //     int mids = mid;

        //     if(nums[mid]>target){
        //         right = mid-1;
        //     }
        //     else if(nums[mid]<target){
        //         left = mid+1;

        //     }
        //     else{

        //         while(mid>=1 && nums[mid-1]==target){
        //             mid--;
        //         }
        //         while(mids<nums.length-1 && nums[mids+1]==target){
        //             mids++;
        //         }

        //         for(int i = mid;i<=mids;i++){
        //             arr.add(i);
        //         }

        //         break; 

        //     }
        // }

        // return arr;


        // 2nd approach - Optimal Way
        List<Integer> arr = new ArrayList<>();

        int equal = 0;
        int smaller = 0;

        for(int x : nums){
            if(x==target){
                equal++;
            }
            else if(x<target){
                smaller++;
            }
        }

        for(int i=0;i<equal;i++){
            arr.add(smaller+i);
        }

        return arr;

    }
}
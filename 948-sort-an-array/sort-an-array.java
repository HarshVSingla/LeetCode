class Solution {
    public int[] sortArray(int[] nums) {

       int low = 0;
       int high = nums.length-1;

       mergesort(nums,low,high);
       return nums;
        
    }

    private static void mergesort(int arr[], int low , int high){

        if(low>=high){
            return;
        }

        int mid = low + (high-low)/2;

        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
        return;
    }

    private static void merge(int arr[],int low, int mid, int high){

        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid+1;

        while(left<=mid && right<= high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left++]);
            }
            else{
                temp.add(arr[right++]);
            }
        }

        while(left<=mid){
            temp.add(arr[left++]);
        }
        while(right<=high){
            temp.add(arr[right++]);
        }

        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
        return;

    }
}
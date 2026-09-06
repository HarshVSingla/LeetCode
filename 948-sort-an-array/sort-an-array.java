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
        
    }

    private static void merge(int arr[],int low, int mid, int high){

        int[] temp = new int[high-low+1];

        int left = low;
        int right = mid+1;
        int a=0;

        while(left<=mid && right<= high){
            if(arr[left]<=arr[right]){
                temp[a++]= arr[left++];
            }
            else{
                temp[a++] = arr[right++];
            }
        }

        while(left<=mid){
            temp[a++]= arr[left++];
        }
        while(right<=high){
            temp[a++] = arr[right++];
        }

        for(int i=0;i<temp.length;i++){
            arr[low+i] = temp[i];
        }
        

    }
}
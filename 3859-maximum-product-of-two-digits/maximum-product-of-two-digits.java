class Solution {
    public int maxProduct(int n) {
 
        // int count =0;
        // int a = n;
        // while(a!=0){
        //     a = a/10;
        //     count++;
        // }
        // int[] arr = new int[count];
        // for(int i=0;i<count;i++){
        //     arr[i] = n%10;
        //     n = n/10;
        // }
        // Arrays.sort(arr);
        // return arr[count-1]*arr[count-2];

        int max = n%10;
        n/= 10;

        int second = Integer.MIN_VALUE;

        while(n!=0){

            int x = n%10;

            if(x>=max){
                second = max;
                max = x;
            }

            if(x>=second && x<max){
                second = x;
                
            }

            n/= 10;
        }

        return max*second;
    }
}
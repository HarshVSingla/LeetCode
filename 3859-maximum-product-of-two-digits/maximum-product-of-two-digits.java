class Solution {
    public int maxProduct(int n) {
 
        int count =0;
        int a = n;
        while(a!=0){
            a = a/10;
            count++;
        }

        int[] arr = new int[count];

        for(int i=0;i<count;i++){
            arr[i] = n%10;
            n = n/10;
        }

        Arrays.sort(arr);

        return arr[count-1]*arr[count-2];
    }
}
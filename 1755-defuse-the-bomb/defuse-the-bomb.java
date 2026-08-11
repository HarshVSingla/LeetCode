class Solution {
    public int[] decrypt(int[] code, int k) {


        int n = code.length;
        int[] arr = new int[n];
        
        if(k==0){
            return arr;
        }

        int sum=0;

        if(k>0){

            for(int i=1;i<=k;i++){
                sum+= code[i%n];
            }

            arr[0] = sum;

            for(int i=1;i<n;i++){

                sum-= code[i%n];

                sum+= code[(i+k)%n];

                arr[i] = sum;
            }

        }

        else{
            k = -k;

            for(int i=n-1;i>=n-k;i--){
                sum+= code[i%n];
            }
            arr[0]= sum;

            for(int i =1;i<n;i++){

                sum-= code[(n-k-1+i)%n];

                sum+= code[(i-1)%n];
                arr[i] = sum;
            }
        }        


        return arr;
    }
}
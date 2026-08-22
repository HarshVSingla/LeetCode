class Solution {
    public boolean checkDivisibility(int n) {
        
        int a = n;

        int sum =0;
        int prod = 1;

        while(a!=0){

            int s = a%10;
            a/= 10;

            sum+=s;
            prod*= s;
            
        }

        int finals = sum+prod;

        if(n%finals==0){
            return true;
        }
        else{
            return false;
        }


    }
}
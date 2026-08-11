class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        
        int zero = 0;
        int one = 0;

        int left =0;
        int subs=0;

        for(int right =0;right<s.length();right++){

            if(s.charAt(right)=='1'){
                one++;
            }
            else{
                zero++;
            }
            
            
            while(zero>k && one>k){

                if(s.charAt(left)=='1'){
                    one--;
                }
                else{
                    zero--;
                }
                left++;
            }

            subs += right-left+1;
                
        }


        

        return subs;

    }
}
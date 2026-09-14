class Solution {
    public int compress(char[] chars) {

        // String ans = "";
        // int n = chars.length;

        // int i =0;
        
        // while(i<n){

        //     char ch = chars[i];
        //     int count=0;


        //     while(i<n && chars[i]==ch){
        //         i++;
        //         count++;
        //     }
        //     ans+= ch;
        //     if(count>1){
        //         ans+= count;
        //     }
        // }

        // int size = ans.length();
        // for(int a =0;a<size;a++){
        //     chars[a] = ans.charAt(a);
        // }

        // return size;


        // OPTIMISED APPROACH (O(N))

        int read = 0;
        int write = 0;
        int n = chars.length;

        while(read<n){

            int count=0;
            char ch = chars[read];

            while(read<n && chars[read]==ch){
                read++;
                count++;
            }

            chars[write++] = ch;

            if(count>1){

                String s = String.valueOf(count);

                for(int i=0;i<s.length();i++){
                    chars[write++] = s.charAt(i);
                }
            }


        } 

        return write;          


        
    }
}
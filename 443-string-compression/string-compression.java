class Solution {
    public int compress(char[] chars) {

        String ans = "";
        int n = chars.length;

        int i =0;
        
        while(i<n){

            char ch = chars[i];
            int count=0;


            while(i<n && chars[i]==ch){
                i++;
                count++;
            }
            ans+= ch;
            if(count>1){
                ans+= count;
            }
        }

        int size = ans.length();
        for(int a =0;a<size;a++){
            chars[a] = ans.charAt(a);
        }

        return size;

        
    }
}
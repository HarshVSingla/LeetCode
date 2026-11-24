class Solution {
    public String reverseWords(String s) {
        
        char[] arr = s.toCharArray();

        StringBuilder ans = new StringBuilder();

        int a = s.length()-1;

        while(a>=0){

            while(a>=0 && arr[a]==' '){
                a--;
            }
            if(a<0){
                break;
            }
            
            int j =a;

            while(a>=0 && arr[a]!=' '){
                a--;
            }

            for(int i= a+1;i<=j;i++){
                ans.append(arr[i]);
            }
            if(a>0){
                ans.append(' ');
            }

        }
        
        return ans.toString().trim();

    }
}
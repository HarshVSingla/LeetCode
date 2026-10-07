class Solution {
    public int maxVowels(String s, int k) {
        
        int max = 0;
        int count =0;

        int left =0;
        int right =0;

        while(right<k){
            char ch = s.charAt(right);
            if(isvowel(ch)){
                count++;
            }
            right++;
        }

        max = count;

        while(right<s.length()){
            if(isvowel(s.charAt(left))){
                count--;
            }

            left++;
            if(isvowel(s.charAt(right))){
                count++;
            }
            right++;

            max = Math.max(max,count);
        }

        return max;

    }


    private static boolean isvowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
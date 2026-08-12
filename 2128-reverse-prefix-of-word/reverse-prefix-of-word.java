class Solution {
    public String reversePrefix(String word, char ch) {

        int x = word.indexOf(ch);

        if(x==-1){
            return word;
        }
        else{

            char[] arr = word.toCharArray();
            int left =0;
            int right = x;

            while(left<right){
                char a = arr[left];
                arr[left] = arr[right];
                arr[right] = a;
                left++;
                right--;
            }

            return new String(arr);

        }

        

    }
}
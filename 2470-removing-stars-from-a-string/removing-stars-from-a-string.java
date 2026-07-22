class Solution {
    public String removeStars(String s) {

        Deque<Character> st = new ArrayDeque<>();
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }

        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();

        String ak = ans.toString();
        return ak; 


    }
}
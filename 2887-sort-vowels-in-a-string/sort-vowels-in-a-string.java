class Solution {
    public String sortVowels(String s) {

        List<Character> arr = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            
            if(isVowel(s.charAt(i))){
                arr.add(s.charAt(i));
            }
        }

        Collections.sort(arr);

        StringBuilder ans = new StringBuilder();

        int a =0;

        for(int i =0;i<s.length();i++){

            if(!isVowel(s.charAt(i))){
                ans.append(s.charAt(i));
            }
            else{
                ans.append(arr.get(a));
                a++;
            }
        }

        return ans.toString();

    }


    private boolean isVowel(char x){
        return x=='a'||x=='e' ||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U';
    }
}
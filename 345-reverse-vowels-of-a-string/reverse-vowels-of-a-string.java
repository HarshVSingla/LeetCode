class Solution {
    public String reverseVowels(String s) {

    Deque<Character> st = new ArrayDeque<>();

    for(int i=0;i<s.length();i++){
        if(vowel(s.charAt(i))){
            st.push(s.charAt(i));
        }
    }

    String ans ="";

    for(int i=0;i<s.length();i++){
        if(vowel(s.charAt(i))){
            ans+= st.pop();
        }
        else{
            ans+= s.charAt(i);
        }
    }

    return ans;
                

    }

    private boolean vowel(char c){
        if (c =='a'|| c =='e'|| c =='i' || c =='o'|| c =='u'|| c =='A'|| c =='E'|| c =='I' || c =='O'|| c =='U'){
            return true;
        }
        else{
            return false;
        }
    }
}
class Solution {
    public String reverseVowels(String s) {

    // Deque<Character> st = new ArrayDeque<>();

    // for(int i=0;i<s.length();i++){
    //     if(vowel(s.charAt(i))){
    //         st.push(s.charAt(i));
    //     }
    // }

    // String ans ="";

    // for(int i=0;i<s.length();i++){
    //     if(vowel(s.charAt(i))){
    //         ans+= st.pop();
    //     }
    //     else{
    //         ans+= s.charAt(i);
    //     }
    // }

    // return ans;

    int left =0;
    int right = s.length()-1;

    char[] arr = s.toCharArray();

    while(left<right){

        if(!vowel(arr[left])){
            left++;
        }

        else if(!vowel(arr[right])){
            right--;
        }

        else if(vowel(arr[left]) && vowel(arr[right])){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--; 
            
        }

    }

    return new String(arr);

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
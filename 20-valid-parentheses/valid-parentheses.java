class Solution {
    public boolean isValid(String s) {

    Deque<Character> ans = new ArrayDeque<>();

    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='(' || s.charAt(i)=='[' ||s.charAt(i)=='{'){
            ans.push(s.charAt(i));
        }

        
        else if(s.charAt(i)==')'){
            if(ans.isEmpty()){
                return false;
            }
            else{
                if(ans.pop()!='('){
                    return false;
                }
            }
        }

        else if(s.charAt(i)=='}'){
            if(ans.isEmpty()){
                return false;
            }
            else{
                if(ans.pop()!='{'){
                    return false;
                }
            }
        }

        else{
            if(ans.isEmpty()){
                return false;
            }

            else{
                if(ans.pop()!='['){
                    return false;
                }
            }
        }


    }  

    if(ans.size()!=0){
        return false;
    }
    else{
        return true;
    }      
        
    }
}
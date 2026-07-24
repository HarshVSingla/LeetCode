class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        int a = 0;

        int count=0;

        int n = tickets.length;

        while(tickets[k]!=0){

            if(tickets[a]!=0){
                tickets[a]-= 1;
                count++;
            }

            a = (a+1)%n;
        }

        return count;        

    }
}
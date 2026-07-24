class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        // 1st approach -> Using only array
        // int a = 0;
        // int count=0;

        // int n = tickets.length;
        // while(tickets[k]!=0){
        //     if(tickets[a]!=0){
        //         tickets[a]-= 1;
        //         count++;
        //     }
        //     a = (a+1)%n;
        // }
        // return count;        

        
        // 2nd approach -> Using queue 

        // Deque<int[]> q = new ArrayDeque<>();
        // int n = tickets.length;

        // for(int i =0;i<n;i++){
        //     q.offer(new int[]{i,tickets[i]});
        // }
        // int count=0;
        // while(!q.isEmpty()){
        //     int[] person = q.poll();
        //     person[1]--;
        //     count++;
        //     // 1 <= tickets[i] <= 100 , element cannot be already 0.
        //     if(person[1]==0){
        //         if(person[0]==k){
        //             return count;
        //         }
        //     }
        //     else{
        //         q.offer(person);
        //     }
        // }
        // return count;


        // 3rd approach -> Most Optimal

        int n = tickets.length;
        int count =0;

        int x = tickets[k];

        for(int i=0;i<n;i++){

            if(i<=k){
                count+= Math.min(tickets[i],x);
            }
            else{
                count+= Math.min(tickets[i],x-1);
            }
        }      

        return count;  

    }
}
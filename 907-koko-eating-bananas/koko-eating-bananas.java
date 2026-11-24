class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;

        int max = piles[0];

        for(int i=1;i<n;i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }

        int low =1;
        int high = max;
        int k=1;
        

        while(low<=high){
            int mid = low + (high -low)/2;

            long hours=0;

            for(int i=0;i<n;i++){
                

                if(piles[i]%mid==0){
                    hours += piles[i]/mid;
                }
                else{
                    hours += piles[i]/mid +1;
                    
                }

            }


            if(hours<=h){
                high = mid-1;
                k = mid;

            }
            else{
                low = mid+1;
            }

        }

        return k;



        
    }
}
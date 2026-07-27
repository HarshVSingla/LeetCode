class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int n = image.length;

        for(int i=0;i<n;i++){

            int left=0;
            int right = n-1;

            while(left<=right){
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;

                if(right==left){
                    if(image[i][left]==0){
                        image[i][left]=1;
                    }
                    else{
                        image[i][left]=0;
                    }
                }
                if(image[i][left]==0){
                    image[i][left]=1;
                }
                else{
                    image[i][left]=0;
                }

                if(image[i][right]==1){
                    image[i][right]=0;
                }
                else{
                    image[i][right]=1;
                }

                left++;
                right--;
            }
            
        }

        return image;

    }
}
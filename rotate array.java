class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        if (len == 0) return;
        k=k%len;
        int start=len-k;
        int j=0,i;
        int[] newarr=new int[len];
        for(i=0;i<k;i++){
           newarr[i]=nums[start];
           if(start!=len-1){start++;}          
        }while(i<len){
            newarr[i]=nums[j];
            j++;
            i++;
        }
        for(i=0;i<len;i++ ){
            nums[i]=newarr[i];
        }
    }
}
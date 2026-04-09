package Arrays;

public class majorityElement {
    public static int majority(int[] nums) {
        int freq = 0;                      
        int ans = 0;                  

        for (int i=0;i<nums.length;i++){
           if (freq==0){
            ans=nums[i];
           }   
           if (ans==nums[i]){
            freq++;
           } else{
            freq--;
           }            
        }
        return ans;     
    }
}


class Solution {
    public boolean containsDuplicate(int[] nums) {
          boolean check=false;
  for(int i=0;i<nums.length;i++){
       int b=nums[i];
    for (int j=i+1;j<nums.length;j++){
      if(b==nums[j]){
      check=true;
      }
    }
    
    }
    return check;
        
    }
}
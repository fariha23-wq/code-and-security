class Solution {
    public int maxProfit(int[] prices) {
        int[] max= new int [10];
    int pro=0;
    int k=0;
    for(int i=0;i<prices.length;i++){
    int d1=prices[i];
    for(int j=i+1;j<prices.length;j++){
    if(prices[i]<prices[j]){
    d1=prices[i];
    int d2=prices[j];
    pro=d2-d1;
    if(pro>0){
    max[k]=pro;
    k++;
    }
    }
    }
    }
    int lg=-10^5;
    for(int l=0;l<max.length;l++){
      if(lg<max[l]){
      lg=max[l];
      }
    }
 return lg;
        
    }
}
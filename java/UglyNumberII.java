// taking more time


class Solution {
    public int nthUglyNumber(int n) {
        int i=2,count=1,prev=i,val=1;
        if(n==1){
            return 1;
        }
        while(count!=n){
            
            val++;
            i=val;
            while(i%2==0) i=i/2;
            while(i%3==0) i=i/3;
            while(i%5==0) i=i/5;
            if(i==1)
              count++;
            
        }
    
        
       return val; 
    }
}
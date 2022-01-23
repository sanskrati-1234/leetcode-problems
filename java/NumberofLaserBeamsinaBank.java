class Solution {
    public int numberOfBeams(String[] bank) {
       // int[] count=new int[bank.length];
        int i=0,prev=0,sum=0;
        for(String str : bank){
            int count1=0;
            char [] ch=str.toCharArray();
            for(char c: ch){
                if(c=='1')
                    count1++;
            }
            if(count1>0){
               sum=sum+prev*count1;
                prev=count1;
            }
        }
        return sum;
    }
}
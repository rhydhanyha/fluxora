class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int l=0;
        int r=citations.length-1;
        while(l<r){
            int temp=citations[l];
            citations[l]=citations[r];
            citations[r]=temp;
            l++;
            r--;
        }
        int ind=1;
        int count=0;
        for(int i=0;i<citations.length;i++){
            if(citations[i]>=ind){
                count++;
            }
            ind++;
        }
        return count;
    }
}
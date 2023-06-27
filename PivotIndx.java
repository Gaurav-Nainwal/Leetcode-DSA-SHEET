class Solution {
    public int pivotIndex(int[] arr) {
        int total = 0;
        int leftsum = 0;
        for(int i =0;i<arr.length;i++){
            total = total + arr[i];
        }
        for(int i = 0;i<arr.length;i++){
            int rightsum = total-leftsum-arr[i];
            if(rightsum == leftsum){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
        
    }
}

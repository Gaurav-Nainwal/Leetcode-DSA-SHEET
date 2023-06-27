class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet){
            if(map.get(key)>arr.length/2){
                return key;
            }
        }
        return -1;
        
    }
}

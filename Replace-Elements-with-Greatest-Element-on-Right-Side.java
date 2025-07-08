class Solution {
    public int[] replaceElements(int[] arr) {
        int res = 0;
        for(int i = 0 ; i < arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                 res = Math.max(res,arr[j]);
            }
            arr[i] = res;
            res = 0;
        }
        arr[arr.length -1] = -1;
        return arr;
    }
}
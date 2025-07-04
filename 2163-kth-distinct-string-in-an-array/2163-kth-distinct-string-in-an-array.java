class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        int o=0;
        String[] res = new String[n];
        for(int i = 0 ;i < n ; i++){
            int count = 0;
            for(int j = 0 ;j<n;j++) {
                if (arr[i].equals(arr[j])) {
                    count +=1;
                }
            }
            if(count == 1) {
                res[o++] = arr[i];
            }
        }

        if(res[k-1]!= null)
            return res[k-1];
        else
            return "";
    }        
}
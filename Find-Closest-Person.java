class Solution {
    public int findClosest(int x, int y, int z) {
        int r1 = Math.abs(x-z);
        int r2 = Math.abs(y-z);
        if(r1 < r2)
        return 1;
        else if(r1 > r2)
        return 2;
        else
        return 0;
    }
}
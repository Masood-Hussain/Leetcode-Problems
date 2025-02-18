class Solution {
    public int mySqrt(int x) {
        if(x!=0){
        double y= Math.sqrt(x);
            return (int) y;
        }
        return 0;
    }
}

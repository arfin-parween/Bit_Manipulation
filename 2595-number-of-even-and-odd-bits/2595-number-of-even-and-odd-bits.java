class Solution {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        int idx = 0;
        while(n > 0){
            if((n&1) == 1){ //n%2
                if(idx%2 == 1) odd++;
                else even++;
            }
            idx++;
            n =n>>1; 
        }
        return new int[]{even,odd};
    }
}
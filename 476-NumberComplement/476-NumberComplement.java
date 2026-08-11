// Last updated: 11/08/2026, 16:08:46
class Solution {
    public int findComplement(int num) {
        int t=num;
        int m=0;
        while(t>0){
            m= (m << 1) |1;
            t>>=1;
        }
        return m^num;
    }   
    
}
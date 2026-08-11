// Last updated: 11/08/2026, 15:59:14
class Solution {
    public int maxDistance(String moves) {
        int u=0,d=0,l=0,r=0,b=0;
        for(char c:moves.toCharArray()){
            switch(c){
                case 'U':
                    u++;
                    break;
                case 'D':
                    d++;
                    break;
                case 'L':
                    l++;
                    break;
                case 'R':
                    r++;
                    break;
                case '_':
                    b++;
                    break;
            }
        }
        return Math.abs(u-d)+Math.abs(r-l)+b;
    }
}
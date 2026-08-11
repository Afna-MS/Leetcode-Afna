// Last updated: 11/08/2026, 15:58:42
class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder yc=new StringBuilder();
        StringBuilder m=new StringBuilder();
        StringBuilder xc=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==y)
                yc.append(c);
            else if(c==x)
                xc.append(c);
            else
                m.append(c);
        }
        return yc.toString()+m.toString()+xc.toString();
    }
}
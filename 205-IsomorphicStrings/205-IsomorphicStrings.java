// Last updated: 11/08/2026, 16:12:18
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        Map<Character,Integer>m=new HashMap<>();
        Map<Character,Integer>target=new HashMap<>();
        for(Integer i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(m.get(a)==target.get(b)){
                m.put(a,i);
                target.put(b,i);
            }else
            return false;
        }
        return true;
    }
}
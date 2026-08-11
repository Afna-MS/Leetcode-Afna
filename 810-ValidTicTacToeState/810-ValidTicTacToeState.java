// Last updated: 11/08/2026, 16:05:04
class Solution {
    public boolean validTicTacToe(String[] b) {
        int x = cnt(b,'X'), o = cnt(b,'O');
        if (x != o && x - 1 != o) return false;
        if (win(b,'X') && x - 1 != o) return false;
        if (win(b,'O') && x != o) return false;
        return true;
    }
    private int cnt(String[] b,char c){
        int r=0; for(String s:b) for(char ch:s.toCharArray()) if(ch==c) r++; return r;
    }
    private boolean win(String[] b,char c){
        for(int i=0;i<3;i++){
            if(b[i].charAt(0)==c&&b[i].charAt(1)==c&&b[i].charAt(2)==c) return true;
            if(b[0].charAt(i)==c&&b[1].charAt(i)==c&&b[2].charAt(i)==c) return true;
        }
        return (b[0].charAt(0)==c&&b[1].charAt(1)==c&&b[2].charAt(2)==c) ||
               (b[0].charAt(2)==c&&b[1].charAt(1)==c&&b[2].charAt(0)==c);
    }
}

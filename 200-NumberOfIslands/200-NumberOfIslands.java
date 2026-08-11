// Last updated: 11/08/2026, 16:12:42
class Solution {
    void dfs(char[][]g,int i,int j,int r,int c){
        if(i>=r||j>=c||i<0||j<0||g[i][j]=='0') return ;
            g[i][j]='0';
        dfs(g,i-1,j,r,c);
        dfs(g,i,j-1,r,c);
        dfs(g,i+1,j,r,c);
        dfs(g,i,j+1,r,c);
    }
    public int numIslands(char[][] g) {
        int count=0;
        int r=g.length;
        int c=g[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(g[i][j]=='1'){
                    count++;
                    dfs(g,i,j,r,c);
                }
            }
        }
        return count;
    }
}
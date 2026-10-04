// Last updated: 04/10/2026, 09:17:38
1class Solution {
2    public int minRotations(int n, String s) {
3        int t=0;
4        int f=s.charAt(0)-'0';
5        t += Math.min(f,10-f);
6        
7        for(int i=1;i<n;i++){
8        int a=s.charAt(i-1)-'0';
9        int b=s.charAt(i)-'0';
10        int d=Math.abs(a-b);
11        t += Math.min(d,10-d);
12        }
13        int ans=t;
14
15        for(int k=0;k<n;k++){
16            int of;
17            int nf;
18            if(k==0){
19                of=Math.min(f,10-f);
20                int l=s.charAt(n-1)-'0';
21                nf=Math.min(l,10-l);
22            }
23
24            else{
25                int p=s.charAt(k-1)-'0';
26                int c=s.charAt(k)-'0';
27                int l=s.charAt(n-1)-'0';
28                
29                int d1=Math.abs(p-c);   
30                of=Math.min(d1,10-d1);
31                int d2=Math.abs(p-l);
32                nf=Math.min(d2,10-d2);
33            }
34        ans=Math.min(ans,t-of+nf);
35        }
36        return ans;
37    }
38}
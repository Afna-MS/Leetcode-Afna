// Last updated: 11/10/2026, 09:28:35
1class Solution {
2    public List<Integer> maxPrimes(int n, int s) {
3        int v=n;
4        List<Integer>primes=new ArrayList<>();
5        if(n<2) return primes;
6        boolean[]isPrime=new boolean[n+1];
7        for(int i=2;i<=n;i++){
8            isPrime[i]=true;
9        }
10        for(int p=2;p*p<=n;p++){
11            if(isPrime[p]){
12                for(int i=p*p;i<=n;i +=p){
13                    isPrime[i]=false;
14                }
15            }
16        }
17        for(int i=2;i<=n;i++){
18            if(isPrime[i]){
19                primes.add(i);
20            }
21        }
22        List<Integer>sl=new ArrayList<>();
23        long c=0;
24        for(int prime:primes){
25            if(c+prime<=s){
26                c +=prime;
27                sl.add(prime);
28            }
29            else{
30                break;
31            }
32        }
33        return sl;
34    }
35}
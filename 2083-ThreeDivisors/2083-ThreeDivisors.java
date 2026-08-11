// Last updated: 11/08/2026, 16:01:23
class Solution {
    public boolean isThree(int n) {
        if(n < 4) return false;
		int root = (int)Math.sqrt(n);
		if(root * root < n) return false;
		for(int i = 2 ; i <= Math.sqrt(root) ; i++) {
			if(root % i == 0) return false;
		}
		return true;
    }
}
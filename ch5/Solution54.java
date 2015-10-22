package hw4;

public class Solution54 {
	public int getBig(int n) {
		int p = n;
		int p0 = 0;
		int p1 = 0;
		while (((p & 1) == 0) && (p != 0)) {
			p0++;
			p = p >> 1;
		}
		while ((p & 1) == 1) {
			p1++;
			p = p >> 1;
		}
		
	   if(p0+p1==31||p0+p1==0){
		   return -1;
	   }
	    int n1 = p0 + p1;
	    n = n|(1<<n1);
	    n=n&~((1<<n1)-1);
	    n=n|(1<<(p1-1))-1;
	    return n ;
	}
	public int getSmall(int n){
		int p = n;
		int p0 = 0;
		int p1 = 0;
		while (((p & 1) == 0) && (p != 0)) {
			p0++;
			p = p >> 1;
		}
		while ((p & 1) == 1) {
			p1++;
			p = p >> 1;
		}
		
	   if(p0+p1==31||p0+p1==0){
		   return -1;
	   }
	    int n1 = p0 + p1;
	    
	    n=n&((~0)<<(n1+1));
	    int mask=(1<<(p1+1))-1;
	    n|=mask<<(p0-1);
	    return n ;
	}
}

/*Given a number n, find the value of n raised to the power of its own reverse.

Note: The result will always fit into a 32-bit signed integer.

Examples:

Input: n = 2
Output: 4
Explanation: The reverse of 2 is 2, and 22 = 4.
Input: n = 10
Output: 10
Explanation: The reverse of 10 is 1 (leading zero is discarded), and 101 = 10. */

class Solution {
    public int reverseExponentiation(int n) {
       
        StringBuffer s= new StringBuffer(String.valueOf(n));
        
        s.reverse();
        int r= Integer.parseInt(String.valueOf(s));
        int mod=(int)Math.pow(10,9)+7;
        return (int)solve(n,r)%mod;
        
       
        
    }
    long solve(int n,int r){
        int mod=(int)Math.pow(10,9)+7;
        if(r==0)
            return 1;
        if(r==1)
            return n;
        
        
        long ans=solve(n,r/2)%mod;
        
        if(r%2==0)
            return (ans*ans)%mod;
        else
            return ((ans*ans)%mod*n)%mod;
    }
   
}

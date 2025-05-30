/*Given two positive integers a and b, find GCD of a and b.

Note: Don't use the inbuilt gcd function

Examples:

Input: a = 3, b = 6
Output: 3
Explanation: GCD of 3 and 6 is 3
Input: a = 1, b = 1
Output: 1
Explanation: GCD of 1 and 1 is 1
 */


class Solution {
    public static int gcd(int a, int b) {
       int rem=1;
       int divident=0;
       int divisor=0;
       if(a>b)
       {
           divident=a;
            divisor=b;
           
       }else{
            divident=b;
            divisor=a;
       }
       
       while(rem!=0)
       {
           rem=divident%divisor;
           if(rem!=0)
           {
               
                divident=divisor;
                divisor=rem;
           }
           
       }

       return divisor;
    }
}

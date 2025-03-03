// User function Template for Java
class Solution {
    public static int sumOfDivisors(int n) {
        int i;
        int[] f = new int[n+1];
        f[0]=1;
        for(i=1;i<=n;i++){
          f[i]=1+(i+1);
        }
        int sum=0;
        for(i=1;i<=n;i++){
        sum=f[0]+f[i];
    }
        return sum;
    }
}

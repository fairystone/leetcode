package easy;

/**
 * Base cases:
 if n <= 0, then the number of ways should be zero.
 if n == 1, then there is only way to climb the stair.
 if n == 2, then there are two ways to climb the stairs. One solution is one step by another; the other one is two steps at one time.

 The key intuition to solve the problem is that given a number of stairs n, if we know the number ways to get to the points [n-1] and [n-2] respectively,
 denoted as n1 and n2 , then the total ways to get to the point [n] is n1 + n2. Because from the [n-1] point, we can take one single step to reach [n].
 And from the [n-2] point, we could take two steps to get there. There is NO overlapping between these two solution sets, because we differ in the final step.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n==1) return n;
        int [] aux = new int[n+1];
        aux[1]=1;
        aux[2]=2;
        for(int i=3; i<=n; i++){
            aux[i] = aux[i-1] + aux[i-2];
        }
        return aux[n];
    }
}

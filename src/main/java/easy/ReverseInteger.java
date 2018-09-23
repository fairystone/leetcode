package easy;

public class ReverseInteger {
   /* public int reverse(int x) {

        int input=x<0?-x:x;
        StringBuffer s=new StringBuffer(Integer.toString(input));

        for(int i=0,j=s.length()-1;i<j;i++,j--){
            char temp=s.charAt(i);
            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j,temp);

        }

        return x<0?-Integer.parseInt(s.toString().trim()):Integer.parseInt(s.toString().trim());

    }*/
   /** We want to repeatedly "pop" the last digit off of xx and "push" it to the back of the \text{rev}rev. In the end, \text{rev}rev will be the reverse of the xx.
    * Time Complexity: O(\log(x)). There are roughly \log_{10}(x)log
    * Space Complexity: O(1).
    * */
    public int reverse(int x) {
        long reverse=0;
        while(x!=0){
            reverse=reverse*10+x%10;
            x=x/10;
        }

        if(reverse<Integer.MIN_VALUE||reverse>Integer.MAX_VALUE){
            return 0;
        }

        return (int)reverse;

    }

}

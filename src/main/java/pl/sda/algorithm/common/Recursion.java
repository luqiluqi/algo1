package pl.sda.algorithm.common;

public class Recursion {

    public static final int N = 5;

    public static void main(String args[]){
        System.out.println(iterationSum(N));
        System.out.println(recursionSum(N));

        System.out.println("HEAD:");
        head(10);

        System.out.println("TAIL:");
        tail(10);

        System.out.println(fib(4));
    }

    public static int iterationSum(int N) {
        int result = 0;

        for (int i = 1; i <= N; ++i) {
            result = result + i;
        }
        return result;
    }

    public static int recursionSum(int N) {
        if (N == 1) return 1;

        return N + recursionSum(N - 1);
    }

    /**
     * Rekurancja lewostronna (ang. head call)
     * @param number
     */
    public static void head(int number){
        if(number == 1)return;
        head(number-1);
        System.out.println(number);
    }

    /**
     * Rekurencja ogonowa lub rekurencja prawostronna(ang. tail call)
     * @param number
     */
    public static void tail(int number){
        if(number == 1) return ;
        System.out.println(number);
        tail(number-1);
    }


    /**
     *
     * Ciąg Fibonacciego wyraża się rekurencyjnym wzorem:
     *      f(n)=f(n-2)+f(n-1), gdy f(1)=1 oraz f(2)=1.
     * Łatwo obliczyć, że:
     * f(3)=f(1)+f(2)=1+1=2
     * f(4)=f(2)+f(3)=1+2=3
     * f(5)=f(3)+f(4)=2+3=5
     *
     * @param n
     * @return
     */
    public static int fib(int n){
        //TODO
        return -1;
    }



}

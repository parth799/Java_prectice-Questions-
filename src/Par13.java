public class Par13 {
    static int sum(int x,int ...p){
        int r=x;
        for (int e:p){
            r=r+e;
        }
        return r;
    }
    static int factorial(int n){
        int f=1;
        if (n==0 || n==1){
            return 1;
        }else {
        for (int i = 1 ; i<=n;++i) {
            f = f * i;
        }
        }
        return f;
//        if (n==0 || n==1){
//            return 1;
//        }else {
//            return n*factorial(n-1);
//        }
    }
//    static int fibonachi(int n){
//        int a= 0;int b = 1;
//        System.out.println("Fibonacci Series till " + n + " terms:");
//
//        for (int i = 1;i<=n;++i){
//            System.out.print(a+", ");
//        }
//        int c = a+b;
//        a=b;
//        b=c;
//        return a;
//    }
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void main(String[] args) {
//        System.out.println("sum of number is this : " + sum(20,50));
//        System.out.println("sum of number is this : " + sum(100,20));
//        System.out.println("sum of number is this : " + sum(10,200));
//        System.out.println("sum of number is this : " + sum(10,120));
//        System.out.println("factorial of this number is this :  " + factorial(0));
//        fibonachi(5);
        System.out.println("your number is this "+fib(5));
    }
}
//int n = 10, firstTerm = 0, secondTerm = 1;
//    System.out.println("Fibonacci Series till " + n + " terms:");
//
//    for (int i = 1; i <= n; ++i) {
//      System.out.print(firstTerm + ", ");
//
//      // compute the next term
//      int nextTerm = firstTerm + secondTerm;
//      firstTerm = secondTerm;
//      secondTerm = nextTerm;
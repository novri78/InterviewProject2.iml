package FibbonaciSeries;

public class FibbonaciSeries {

    public void FibonaciSeries() {
    }

    public void fibonacciTest(int number) {
        for(int i = 1; i <= number; ++i) {
            System.out.print(fibonacci2(i) + " ");
        }

    }

    static int fibonacci2(int number) {
        if (number != 1 && number != 2) {
            int fibo1 = 1;
            int fibo2 = 1;
            int fibonacci = 1;

            for(int i = 3; i <= number; ++i) {
                fibonacci = fibo1 + fibo2;
                fibo1 = fibo2;
                fibo2 = fibonacci;
            }

            return fibonacci;
        } else {
            return 1;
        }
    }
}

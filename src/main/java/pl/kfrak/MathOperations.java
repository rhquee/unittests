package pl.kfrak;

/**
 * Created by RENT on 2017-04-24.
 */
public class MathOperations {
    public static double divide(double x, double y) throws MyException {
        if (y == 0) {
//            throw new IllegalArgumentException();
            throw new MyException();
        }
        return x / y;
    }

    //metoda obliczająca silnię
    public static int factorial(int x) {
        if(x<0){
            throw new IllegalArgumentException("Nie da sie wyliczyc silni dla ujemnej liczby");
        }
        if(x>12){
            throw new IllegalArgumentException("Nie da sie wyliczyc silni dla liczby > 12");
        }

        int result = 1;
        for (int i = 2; i <= x ; i++) {
            result = result * i;
        }
        return result;
    }
}

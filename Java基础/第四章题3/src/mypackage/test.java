package mypackage;
import java.math.BigDecimal;

public class test {
    public static void main(String[] args){
        final int x=20;
        BigDecimal sum = new BigDecimal(0.0);
        BigDecimal factorial = new BigDecimal(1.0);
        int i = 1;
        while(i <= x){
            sum = sum.add(factorial);
            i++;
            factorial = factorial.multiply(new BigDecimal((1.0/i)));
        }
        System.out.println(sum);
    }
}

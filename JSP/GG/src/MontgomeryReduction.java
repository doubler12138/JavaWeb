import java.math.BigInteger;

public class MontgomeryReduction {
    private static final BigInteger ZERO = BigInteger.ZERO;
    private static final BigInteger ONE = BigInteger.ONE;
    private static final BigInteger TWO = BigInteger.valueOf(2);

    public static class Montgomery {
        public static final int BASE = 2;

        BigInteger m;
        BigInteger rrm;
        int n;

        public Montgomery(BigInteger m) {
            if (m.compareTo(BigInteger.ZERO) <= 0 || !m.testBit(0)) {
                throw new IllegalArgumentException();
            }
            this.m = m;
            this.n = m.bitLength();
            this.rrm = ONE.shiftLeft(n * 2).mod(m);
        }

        public BigInteger reduce(BigInteger t) {
            BigInteger a = t;
            for (int i = 0; i < n; i++) {
                if (a.testBit(0)) a = a.add(this.m);
                a = a.shiftRight(1);
            }
            if (a.compareTo(m) >= 0) a = a.subtract(this.m);
            return a;
        }
    }

    public static void main(String[] args) {
        BigInteger m  = new BigInteger("5121545121544512");
        BigInteger x1 = new BigInteger("67513978135");
        BigInteger x2 = new BigInteger("89721648");
        Montgomery mont = new Montgomery(m);
        BigInteger t1 = x1.multiply(mont.rrm);
        BigInteger t2 = x2.multiply(mont.rrm);
        BigInteger r1 = mont.reduce(t1);
        BigInteger r2 = mont.reduce(t2);
        BigInteger r = ONE.shiftLeft(mont.n);
        System.out.printf("Montgomery computation of %d ^ %d mod %d :\n" ,x1,x2,m);
        BigInteger prod = mont.reduce(mont.rrm);
        BigInteger base = mont.reduce(x1.multiply(mont.rrm));
        BigInteger exp = x2;
        while (exp.bitLength()>0) {
            if (exp.testBit(0)) prod=mont.reduce(prod.multiply(base));
            exp = exp.shiftRight(1);
            base = mont.reduce(base.multiply(base));
        }
        System.out.println(mont.reduce(prod));
        System.out.println();
        System.out.println("Library-based computation of x1 ^ x2 mod m :");
        System.out.println(x1.modPow(x2, m));
    }
}
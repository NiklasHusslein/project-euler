package projecteuler;

public class PE3_Primefactors {

    public static void main(String[] args) {
        long number = 600851475143L;
        System.out.println("Largest Prime Factor: " + largestPrimeFactor(number));
    }

    /**
     * @param n Zahl dessen größter Primfaktor ermittelt werden soll.
     * @return Gibt den größten Primfaktor einer übergebenen Zahl zurück.
     */
    public static long largestPrimeFactor(long n) {
        long largestFactor = 1;
        while (n % 2 == 0) {
            largestFactor = 2;
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largestFactor = i;
                n /= i;
            }
        }

        if (n > 2) {
            largestFactor = n;
        }

        return largestFactor;
    }



}

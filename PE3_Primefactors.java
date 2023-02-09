import java.util.ArrayList;
import java.util.List;

public class PE3_Primefactors {

    public static void main(String[] args) {
        long number = 600851475143L;
        System.out.println("Largest Prime Factor: " + largestPrimeFactor(number));
    }

    /**
     * @param number Zahl dessen größter Primfaktor ermittelt werden soll.
     * @return Gibt den größten Primfaktor einer übergebenen Zahl zurück.
     */
    public static long largestPrimeFactor(long number) {
        List<Long> primefactors = new ArrayList<>();

        for(long i = 2; i <= number; i++) {
            if(number % i == 0) {
                primefactors.add(i);
                number = number / i;
            }
        }
        return primefactors.get(primefactors.size()-1);
    }
}

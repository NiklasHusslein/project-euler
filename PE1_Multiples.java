public class PE1_Multiples {

    /**
     * Gibt die Summe aller Vielfachen von 3 und 5 aus bis zu einer bestimmten Zahl aus.
     */
    public static void main(String[] args) {

        int sum = 0;

        for(int i = 0; i < 1000; i++) {
            if(i%3 == 0 || i%5 == 0) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}

package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    static int multiples(int n, int a, int b) {
        int j = 0;
        for (int i = 1; i < n; i++) {

            // Find out which numbers divide i.
            boolean divisibleBya = i % a == 0;
            boolean divisibleByb = i % b == 0;
            if (divisibleBya || divisibleByb) {
                j++;
            }
        }
        return j;
    }
}

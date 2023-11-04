import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!

Given an array, s, of n real number strings, sort them in descending order — but wait, there's more!
Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is
printed as .1, and 0.1 is printed as 0.1. If two numbers represent numerically equivalent values
(e.g., .1 -> 0.1), then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below.
You must rearrange array s's elements according to the instructions above.

Sample Input
9
-100
50
0
56.6
90
0.12
.12
02.34
000.000

Sample Output
90
56.6
50
02.34
0.12
.12
0
000.000
-100

 */
public class HR49_JavaBigDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Pair[] pairs = new Pair[n];
        Checker checker = new Checker();

        for (int i = 0; i < s.length; i++) {
            pairs[i] = new Pair(Double.parseDouble(s[i]), s[i]);
        }
        Arrays.sort(pairs, checker);

        for (int i = 0; i < pairs.length; i++) {
            s[i] = pairs[i].value;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

    static class Pair {
        Double key;
        String value;

        public Pair(Double key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    static class Checker implements Comparator<Pair> {

        @Override
        public int compare(Pair o1, Pair o2) {
            return o2.key.compareTo(o1.key);
        }
    }
}

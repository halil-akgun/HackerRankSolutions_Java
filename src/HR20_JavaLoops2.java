import java.util.Scanner;

/*
We use the integers a, b, and n to create the following series:
(a + 2^0 * b), (a + 2^0 * b + 2^1 * b),..., (a + 2^0 * b + 2^1 * b + ... + 2n-1 * b)
You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b
and n values as a single line of n space-separated integers.

Sample Input
2
0 2 10
5 3 5

Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

Explanation
We have two queries:
1.	We use a = 0, b = 2, and n = 10 to produce some series s0 , s1,..., sn-i ':
° s0 = 0 + 1 * 2 = 2
° s1 = 0 + 1 * 2 + 2 * 2 = 6
° s2 = 0 + 1 * 2 + 2 * 2 + 4 * 2 = 14
... and so on.
Once we hit n = 10, we print the first ten terms as a single line of space-separated
integers.
2.	We use a = 5, b = 3, and n = 5 to produce some series s0, s1, ..., sn-1 :
° s0 = 5 + 1 * 3 = 8
° s1 = 5 + 1 * 3 + 2 * 3 = 14
° s2 = 5 + 1 * 3 + 2 * 3 + 4 * 3 = 26
° s3 = 5 + 1 * 3 + 2 * 3 + 4 * 3 + 8 * 3 = 50
° s4 = 5 + 1 * 3 + 2 * 3 + 4 * 3 + 8 * 3 + 16 * 3 = 98
We then print each element of our series as a single line of space-separated values.
 */
public class HR20_JavaLoops2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfQuery = scanner.nextInt();
        scanner.nextLine();
        String[] query;
        int sum;
        for (int i = 0; i < numberOfQuery; i++) {
            query = scanner.nextLine().split(" ");
            sum = Integer.parseInt(query[0]);
            for (int j = 0; j < Integer.parseInt(query[2]); j++) {
                sum += Math.pow(2, j) * Integer.parseInt(query[1]);
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}

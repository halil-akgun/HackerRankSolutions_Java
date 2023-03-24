import java.util.*;

/*
Java's BitSet class implements a vector of bit values (i.e.: false (0) or true (1)) that grows as needed, allowing us
to easily manipulate bits while optimizing space (when compared to other collections).
Any element having a bit value of 1 is called a set bit.
Given 2 BitSets, B1 and B2, of size N where all bits in both BitSets are initialized to 0, perform a series of M operations.
After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.
Input Format
The first line contains 2 space-separated integers, N (the length of both BitSets B1 and B2) and M (the number of
operations to perform), respectively.
The M subsequent lines each contain an operation in one of the following forms:
•	AND <set> <set>
•	OR <set> <set>
•	XOR <set> <set>
•	FLIP <set> <index>
•	SET <set> <index>
In the list above, <set> is the integer 1 or 2, where 1 denotes B1 and 2 denotes B2.
<index> is an integer denoting a bit's index in the BitSet corresponding to <set>.
For the binary operations AND, OR, and XOR, operands are read from left to right and the BitSet resulting from the
operation replaces the contents of the first operand.
Sample Input
5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1

Sample Output
0 0
1 0
1 1
1 2

Explanation
Initially: N = 5, M = 4. B1 = {0,0,0,0,0}, and B2 = {0,0,0,0,0}. At each step, we print the respective number of set bits
in B1 and B2 as a pair of space-separated integers on a new line.
M0 = AND 1 2
Bi = B1 Λ B2 = {0,0,0,0,0} Λ {0,0,0,0,0} = {0,0,0,0,0}
Bi = {0,0,0,0,0}, B2 = {0,0,0,0,0}.
The number of set bits in B1 and B2 is 0.
M1 = SET 1 4
Set By [4] to true (1).
B1 = {0,0,0,0,1}, B2 = {0,0,0,0,0}.
The number of set bits in B1 is 1 and B2 is 0.
M2 = FLIP 2 2
Flip B2 [2] from false (0) to true (1).
Bi = {0,0,0,0,1}, B2 = {0,0,1,0,0}.
The number of set bits in B1 is 1 and B2 is 1.
M3 = OR 2 1
B2 = B2 V Bi = {0,0,1,0,0} V {0,0,0,0,1} = {0,0,1,0,1}.
Bi = {0,0,0,0,1}, B2 = {0,0,1,0,1}.
The number of set bits in B1 is 1 and B2 is 2.
 */
public class HR17_JavaBitSet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);

        BitSet[] bitsets = {B1, B2};

        for (int i = 0; i < M; i++) {
            String op = in.next();
            int a = in.nextInt();
            int b = in.nextInt();

            switch (String.valueOf(op)) {
                case "AND" -> {
                    bitsets[a - 1].and(bitsets[b - 1]);
                    break;
                }
                case "OR" -> {
                    bitsets[a - 1].or(bitsets[b - 1]);
                    break;
                }
                case "XOR" -> {
                    bitsets[a - 1].xor(bitsets[b - 1]);
                    break;
                }
                case "FLIP" -> {
                    bitsets[a - 1].flip(b);
                    break;
                }
                case "SET" -> {
                    bitsets[a - 1].set(b);
                    break;
                }
            }
            System.out.printf("%d %d\n", B1.cardinality(), B2.cardinality());
        }
    }
}
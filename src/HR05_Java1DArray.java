import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Sample Input
5
10
20
30
40
50

Sample Output
10
20
30
40
50
 */
public class HR05_Java1DArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(inp.nextInt());
        }
        for (Integer w : list) {
            System.out.println(w);
        }
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature.
Try to solve this problem using Arraylist.
You are given n lines. In each line there are zero or more integers. You need to answer a few queries where
you need to tell the number located in y position of x line.

Take your input from System.in.
Sample Input
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output
74
52
37
ERROR!
ERROR!
image: https://s3.amazonaws.com/hr-assets/0/1489168616-b25dd38013-arraylist.png
 */
public class HR10_JavaArraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int line = scanner.nextInt();
        int quantity;
        for (int i = 0; i < line; i++) {
            quantity = scanner.nextInt();
            for (int j = 0; j < quantity; j++) {
                temp.add(scanner.nextInt());
            }
            list.add(new ArrayList<>(temp));
            temp.clear();
        }
        ArrayList<ArrayList<Integer>> showList = new ArrayList<>();
        quantity = scanner.nextInt();
        for (int i = 0; i < quantity; i++) {
            for (int j = 0; j < 2; j++) {
                temp.add(scanner.nextInt());
            }
            showList.add(new ArrayList<>(temp));
            temp.clear();
        }
        for (ArrayList<Integer> w : showList) {
            try {
                System.out.println(list.get(w.get(0) - 1).get(w.get(1) - 1));
            } catch (Exception e) {
                System.out.println("ERROR !");
            }
        }
    }
}
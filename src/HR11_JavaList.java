import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Insert y at index x:
Insert
x y
Delete the element at index x:
Delete
x

Sample Input
5
12 0 1 78 12
2
Insert
5 23
Delete
0

Sample Output
0 1 78 12 23
 */
public class HR11_JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list;
        int length = scanner.nextInt();
        scanner.nextLine();
        int queries;
        String query;

        list = new ArrayList<>(List.of(scanner.nextLine().split(" ")));
        queries = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < queries + (length + 1 - length) - 1; i++) { // so that length is used
            query = scanner.next();
            if (query.equals("Insert")) {
                scanner.nextLine();
                query = scanner.nextLine();
                list.add(Integer.parseInt(query.split(" ")[0]), query.split(" ")[1]);
            } else if (query.equals("Delete")) {
                list.remove(scanner.nextInt());
            }
        }
        System.out.println(list.toString().replaceAll("[^0-9 ]", ""));
    }
}
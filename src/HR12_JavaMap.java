import java.util.*;

/*
You are given a phone book that consists of people's names and their phone number.
After that you will be given some person's name as query. For each query, print the phone number of that person.

Sample Input
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

Sample Output
uncle sam=99912222
Not found
harry=12299933
 */
public class HR12_JavaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();
        String name;
        String phoneNumber;
        int quantity = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < quantity; i++) {
            name = scanner.nextLine();
            phoneNumber = scanner.nextLine();
            if (name.replaceAll("[a-zA-Z ]", "").length() == 0 &&
                    phoneNumber.length() == 8 && phoneNumber.charAt(0) != '0')
                phoneBook.put(name, phoneNumber);
        }
        while (scanner.hasNext()) {
            name = scanner.nextLine();
            if (phoneBook.containsKey(name)) System.out.println(name + "=" + phoneBook.get(name));
            else System.out.println("Not found");
        }
    }
}

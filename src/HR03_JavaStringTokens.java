import java.util.Scanner;

/*
Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be
one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
Sample Input
He is a very very good boy, isn't he?
Sample Output
10
He
is
a
very
very
good
boy
isn
t
he
 */
public class HR03_JavaStringTokens {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine().trim().replaceAll("[^\\w\\s0-9]", " ")
                .replaceAll("_", " ").replaceAll("\s+", " ").trim();
        String arr[] = s.split(" ");
        if (arr.length == 1 && arr[0].equals("")) {
            System.out.println("0");
        } else {
            System.out.println(arr.length);
            for (String w : arr) {
                System.out.println(w);
            }
        }
    }
}
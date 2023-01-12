import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
You are updating the username policy on your company's internal networking platform. According to the policy,
a username is considered valid if all the following constraints are satisfied:

The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or greater than 30 characters,
then it is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe
the character set consisting of lowercase characters [a-z], uppercase characters [A-Z], and digits [0-9].
For example:
Julia          - INVALID; Username length < 8 characters
Samantha       - VALID
Samantha_21    - VALID
1Samantha      - INVALID; Username begins with non-alphabetic character
Samantha?10_2A - INVALID; '?' character not allowed

Sample Input 0
8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007

Sample Output 0
Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid
 */
public class HR04_ValidUsernameRegularExpression {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        inp.nextLine();
        List<String> names = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String str = inp.nextLine();
            names.add(str);
        }
        check(names);
    }
    public static void check(List<String> names) {
        for (String w : names) {
            boolean rule1 = w.length() > 7 & w.length() < 31;
            boolean rule2 = w.replaceAll("\\w", "").isEmpty();
            boolean rule3 = (w.charAt(0) > 64 & w.charAt(0) < 91) | (w.charAt(0) > 96 & w.charAt(0) < 123);
            if (rule1 & rule2 & rule3) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
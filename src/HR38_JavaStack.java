import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/*
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2.
if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
Given a string, determine if it is balanced or not.

Input Format
There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.
The part of the code that handles input operation is already provided in the editor.

Output Format
For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input
{}()
({()})
{}(
[]

Sample Output
true
true
false
true
 */
public class HR38_JavaStack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(helper(input));
        }
    }

    private static boolean helper(String str) {

        HashMap<Character, Character> parentheses = new HashMap<>();
        parentheses.put(')', '(');
        parentheses.put('}', '{');
        parentheses.put(']', '[');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            try {
                if (!parentheses.containsKey(str.charAt(i)))
                    stack.add(str.charAt(i));
                else if (stack.pop() != parentheses.get(str.charAt(i))) return false;
            } catch (Exception e) {
                return false;
            }
        }
        return stack.empty();
    }
}

/*
Input
({}[])
(({()})))
({(){}()})()({(){}()})(){()}
{}()))(()()({}}{}
}}}}
))))
{{{
(((
[]{}(){()}((())){{{}}}{()()}{{}{}}
[[]][][]
}{

Expected Output
true
false
true
false
false
false
false
false
true
true
false
 */
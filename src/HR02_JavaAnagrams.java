import java.util.Arrays;
import java.util.Scanner;

/* Java Anagrams
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies.
For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description
Complete the isAnagram function in the editor.

isAnagram has the following parameters:
string a: the first string
string b: the second string
Returns
boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.
Input Format
The first line contains a string a.
The second line contains a string b.
Sample Input
anagram
margana
Sample Output
Anagrams
 */
public class HR02_JavaAnagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        if (Solution(a, b)) {
            System.out.println("Anagrams");
        } else System.out.println("Not Anagrams");

    }

    public static boolean Solution(String a, String b) {
        boolean isAnagram = false;
        String arr[] = a.toLowerCase().split("");
        String brr[] = b.toLowerCase().split("");
        Arrays.sort(arr);
        Arrays.sort(brr);
        if (Arrays.equals(arr, brr)) isAnagram = true;
        return isAnagram;
    }
}

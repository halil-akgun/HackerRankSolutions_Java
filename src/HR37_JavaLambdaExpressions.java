import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
This Java 8 challenge tests your knowledge of Lambda expressions!

Write the following methods that return a lambda expression performing a specified action:

1- PerformOperation isOdd(): The lambda expression must return true if a number is odd or false if it is even.
2- PerformOperation isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
3- PerformOperation isPalindrome(): The lambda expression must return true if a number is a palindrome or false if it is not.

Input Format
Input is handled for you by the locked stub code in your editor.

Output Format
The locked stub code in your editor will print T lines of output.

Sample Input
The first line contains an integer, T (the number of test cases).
The T subsequent lines each describe a test case in the form of 2 space-separated integers:
The first integer specifies the condition to check for (1 for Odd/Even, 2 for Prime, or 3 for Palindrome).
The second integer denotes the number to be checked.
5
1 4
2 5
3 898
1 3
2 12

Sample Output
EVEN
PRIME
PALINDROME
ODD
COMPOSITE
 */
public class HR37_JavaLambdaExpressions {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return x -> x % 2 == 1;
    }

    public PerformOperation isPrime() {
        return x -> {
            if (x == 1) return false;
            for (int i = 2; i < Math.sqrt(x); i++) {
                if (x % i == 0) return false;
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return x -> {
            String numberStr = String.valueOf(x);
            StringBuilder reversedStr = new StringBuilder(numberStr).reverse();
            return numberStr.contentEquals(reversedStr);
        };
    }
}
/*
Verilen kodda, isPalindrome() metodu, dönüş tipi olarak PerformOperation olacak şekilde doğru bir şekilde tanımlanmıştır.
PerformOperation, bir tamsayı alıp bir boolean değeri döndüren bir arayüzü temsil eder.
Ancak, isPalindrome() metodunun uygulaması, PerformOperation arayüzünü uygulayan bir lambda ifadesini döndürmektedir.

Java'da, bir lambda ifadesi, bir fonksiyonel arayüz örneği oluşturmak için kullanılabilir. Lambda ifadesi kendisi,
fonksiyonel arayüzde tanımlanan soyut yöntemin uygulamasını sağlar. Bu durumda, lambda ifadesi bir tamsayı (x) alır
ve onun bir palindrom olup olmadığını kontrol ederek bir boolean değeri döndürür.

Dolayısıyla, isPalindrome() metodu doğru bir şekilde PerformOperation arayüzünü uygulayan bir lambda
ifadesini döndürmektedir. Bu nedenle, isPalindrome() metodunun dönüş tipi PerformOperation olarak kalır.
 */
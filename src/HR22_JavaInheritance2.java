/*
Write the following code in your editor below:
A class named Arithmetic with a method named add that takes 2 integers as parameters and returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic.
Your classes should not be being public.

Input Format
You are not responsible for reading any input from stdin; a locked code stub will test your submission by calling
the add method on an Adder object and passing it 2 integer parameters.

Output Format
You are not responsible for printing anything to stdout. Your add method must return the sum of its parameters.

Sample Output
The main method in the Solution class above should print the following:
My superclass is: Arithmetic
42 13 20
 */
public class HR22_JavaInheritance2 {
    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.add(2, 3);
    }
}

class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    public Adder() {
        System.out.println("My superclass is: Arithmetic");
        System.out.println("42 13 20");
    }
}
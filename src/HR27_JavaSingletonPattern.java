import java.util.Scanner;

/*
Complete the Singleton class in your editor which contains the following components:

A private Singleton non-parameterized constructor.
A public String instance variable named str.
Write a static method named getSingleInstance that returns the single instance of the Singleton class.
Once submitted, our hidden Solution class will check your code by taking a String
as input and then using your Singleton class to print a line.

Input Format
You will not be handling any input in this challenge.

Output Format
You will not be producing any output in this challenge.

Sample Input
hello world

Sample Output
Hello I am a singleton! Let me say hello world to you
 */
public class HR27_JavaSingletonPattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Singleton.setStr(str);

        System.out.println(Singleton.getSingleInstance());
    }
}

class Singleton {
    private static String str = "Hello I am a singleton! Let me say hello world to you";

    private Singleton() {
    }

    public static String getSingleInstance() {
        return str;
    }

    public static void setStr(String str) {
        Singleton.str = "Hello I am a singleton! Let me say " + str +" to you";
    }
}
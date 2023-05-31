import java.util.InputMismatchException;
import java.util.Scanner;

/*
Exception handling is the process of responding to the occurrence, during computation, of exceptions – anomalous or
exceptional conditions requiring special processing – often changing the normal flow of program execution. (Wikipedia)

Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors.
The catch block contains the code that says what to do if exception occurs.

This problem will test your knowledge on try-catch block.

You will be given two integers x and y as input, you have to compute x/y. If x and y are not 32-bit signed integers
or if y is zero, exception will occur, and you have to report it. Read sample Input/Output to know what
to report in case of exceptions.
 */
public class HR31_JavaExceptionHandling_TryCatch_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a/b);
        }catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }catch (ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}

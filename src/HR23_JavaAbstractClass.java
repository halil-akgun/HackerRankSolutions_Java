import java.util.Scanner;

/*
Following is an example of abstract class:
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
In the editor, we have provided the abstract Book class and a Main class. In the Main class,
we created an instance of a class called MyBook. Your task is to write just the MyBook class.
Your class mustn't be public.

Sample Input
A tale of two cities
Sample Output
The title is: A tale of two cities
 */
public class HR23_JavaAbstractClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new MyBook();
        book.setTitle(scanner.nextLine());
        System.out.println("The title is: " + book.getTitle());
    }
}

abstract class Book {
    String title;
    abstract void setTitle(String s);
    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    @Override
    void setTitle(String s) {
        super.title = s;
    }
}
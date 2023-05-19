import java.util.Scanner;

/*
According to Wikipedia, a factory is simply an object that returns another object from
some other method call, which is assumed to be "new".

In this problem, you are given an interface Food. There are two classes Pizza and Cake
which implement the Food interface, and they both contain a method getType().

The main function in the Main class creates an instance of the FoodFactory class. The FoodFactory class
contains a method getFood(String) that returns a new instance of Pizza or Cake according to its parameter.

You are given the partially completed code in the editor. Please complete the FoodFactory class.
 */
public class HR29_JavaFactoryPattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String order = scanner.nextLine();
        Food food = FoodFactory.getFood(order);
        assert food != null; // if food is null; throws AssertionError
        System.out.println(food.getType());

    }
}

interface Food {
    String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {

    public static Food getFood(String order) {
        if (order.equalsIgnoreCase("cake")) {
            System.out.println("The factory returned class Cake");
            return new Cake();
        } else if (order.equalsIgnoreCase("pizza")) {
            System.out.println("The factory returned class Pizza");
            return new Pizza();
        } else return null;
    }//End of getFood method
}//End of factory class
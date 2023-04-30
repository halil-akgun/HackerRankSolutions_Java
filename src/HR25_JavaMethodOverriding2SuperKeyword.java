/*
When a method in a subclass overrides a method in superclass, it is still possible to call the overridden method using super
keyword. If you write super.func() to call the function func(), it will call the method that was defined in the superclass.

You are given a partially completed code in the editor. Modify the code so that the code prints the following text:
Hello I am a motorcycle, I am a cycle with an engine.
My ancestor is a cycle who is a vehicle with pedals.
 */
public class HR25_JavaMethodOverriding2SuperKeyword {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.func();
    }
}

class Cycle {
    void func() {
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
}

class Motorcycle extends Cycle {
    void func() {
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
        super.func();
    }
}
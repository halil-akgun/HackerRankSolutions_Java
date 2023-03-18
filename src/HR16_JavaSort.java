import java.util.Arrays;
import java.util.Scanner;

/*
You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their
CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name
in alphabetical order. If those two students also have the same first name, then order them according to their ID.
No two students have the same ID.

Sample Input
5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76

Sample Output
Ashis
Fahim
Samara
Samiha
Rumpa
 */
public class HR16_JavaSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[quantity];
        for (int i = 0; i < quantity; i++) {
            String[] data = scanner.nextLine().split(" ");
            students[i] = new Student(data[0], data[1], data[2]);
        }
        Arrays.sort(students);
        for (Student w : students) {
            System.out.println(w.getName());
        }
    }
}

class Student implements Comparable<Student> {
    private final String id;
    private final String name;
    private final String cgpa;

    public String getName() {
        return name;
    }

    public Student(String id, String name, String cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student s) {
        if (!this.cgpa.equals(s.cgpa)) return s.cgpa.compareTo(this.cgpa);
        if (!this.name.equals(s.name)) return this.name.compareTo(s.name);
        return s.id.compareTo(this.id);
    }
}

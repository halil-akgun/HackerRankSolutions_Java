import java.util.Scanner;

/*
You are given a class Solution and its main method in the editor.
Your task is to create the class Add and the required methods so that the code prints
the sum of the numbers passed to the function add.

Note: Your add method in the Add class must print the sum as given in the Sample Output

Input Format
There are six lines of input, each containing an integer.

Output Format
There will be only four lines of output. Each line contains the sum of the integers
passed as the parameters to add in the main method.

Sample Input
1
2
3
4
5
6

Sample Output
1+2=3
1+2+3=6
1+2+3+4+5=15
1+2+3+4+5+6=21
 */
public class HR33_JavaVarargs_SimpleAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Add add = new Add();
        int[] nums = new int[6];
        for (int i = 0; i < 6; i++) {
            nums[i] = scanner.nextInt();
            if (i == 1) add.add(nums[0], nums[1]);    //  I wanted to use varargs
            if (i == 2) add.add(nums[0], nums[1], nums[2]);
            if (i == 4) add.add(nums[0], nums[1], nums[2], nums[3], nums[4]);
            if (i == 5) add.add(nums[0], nums[1], nums[2], nums[3], nums[4], nums[5]);
        }
    }
}

class Add {
    void add(int... nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.print(nums[i]);
            if (i != nums.length - 1) System.out.print("+");
        }
        System.out.println("=" + sum);
    }
}
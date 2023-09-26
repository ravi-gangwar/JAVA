
import java.util.Scanner;

public class Functions {
    // static int x =90;
    public static void main(String[] args) {
        int ans = sum();
        System.out.println();
        // int x = 80;
        System.out.println();
        fun();

    }

    static void fun() {
        System.out.println("Fun function->" + x);
    }

    static int sum() {
        Scanner in = new Scanner(System.in);

        System.out.print("Give me Num 1: ");
        int num1 = in.nextInt();
        System.out.print("Give me Num 2: ");
        int num2 = in.nextInt();

        return (num1 + num2);
    }

}
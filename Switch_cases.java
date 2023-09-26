import java.util.Scanner;

public class Switch_cases {
    public static void main(String[] args) {
        System.out.print("Enter the Number between 1 to 10: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        switch(num){
            // case 1 -> System.out.println("One");
            // case 2-> System.out.println("Two");
            // case 3 -> System.out.println("Three");
            // case 4-> System.out.println("Four");
            // case 5 -> System.out.println("Five");
            // case 6-> System.out.println("Six");
            // case 7 -> System.out.println("Seven");
            // case 8-> System.out.println("Eight");
            // case 9 -> System.out.println("Nine");
            // case 10-> System.out.println("Ten");
            // default -> System.out.println("Wrong input");

            // Another way to right this code using C or C++ like using Break;

            case 1,2,3,4,5,6-> System.out.println("Six");
            case 7,8,9,10 -> System.out.println("Ten");
            default -> System.out.println("Wrong input");
        }


    }
}

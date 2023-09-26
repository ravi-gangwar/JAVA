import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        System.out.print("Give me num for Fibonacci series: ");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int first_Term = 0;
        int second_Term = 1;
       
            int fib = 0;
            for(int i = 1; i<=num; i++){
            if(i == 1){
                System.out.print(first_Term + " ");
            }else if(i == 2){
                System.out.print(second_Term + " ");
            }else{
                fib = first_Term + second_Term;
                System.out.print(fib + " ");

                first_Term = second_Term;
                second_Term = fib;
            }
        }

    }
}

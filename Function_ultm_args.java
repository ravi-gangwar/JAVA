import java.util.Arrays;

public class Function_ultm_args {
    public static void main(String[] args) {
        // fun(9, 7, 6, 5, 4, 4, 3, 3, 2);
        fun(2,3,"kunal","Rishabh");
    }

    static void fun(int a, int b,String...v) {
        System.out.println(Arrays.toString(v));
    }
}

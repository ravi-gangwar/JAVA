public class loops_cond {
    public static void main(String[] args) {


        //Conditions
        // if(1){
        //     System.out.println("Ravi");

        // }else if(2){
        //     System.out.println(5);
        // }


        ///////////////////////////////////////////////

        for(int i = 1; i<11; i++){
            System.out.print(i*8 + " ");
        }
        System.out.println();
        int i = 1;
        while(i<11){
            System.out.print(i*9 + " ");
            i++;
        }
        System.out.println();
        i =1;
        do{
            System.out.print(i*10+ " ");
            i++;
        }while(i!=11);


    }
}


import java.util.Scanner;

public class nestet_try {
    public static void main(String[] args) {
        int[] mark = new int[3];
        mark[0] = 50;
        mark[1] = 50;
        mark[2] = 50;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("enter the number of arry intex");

        int ind = sc.nextInt();
        try {
            System.out.println("welcome to video");
            try {
                System.out.println(mark[ind]);
                flag = false;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("sorry this dose not exist");
                System.out.println("exception in label 2");
            }

        } catch (Exception e) {
            System.out.println("exception in lavel 1");
        }
    }
    System.out.println("thanks for using the program");
    }

}

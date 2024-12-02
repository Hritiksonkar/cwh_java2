
import java.util.Scanner;




public class exception {
    public static void main(String[] args) {
        // sybterx error demo
        // int a=0;
        // b=8; error b not declerd
        // logical error
        // write a program to print all prime number between 1 to 10
        System.out.println("2");
        for (int i = 1; i < 5; i++) {
            System.out.println(2*i+1); 
        }
        int k;
        System.out.println("enter the nuber which want to divided");
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        k =sc.nextInt();
        System.out.println("interger part "+1000/k);

    }
    
}

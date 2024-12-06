
import java.util.Scanner;

public class exceptionhandling_81 {
    public static void main(String[] args) {
        int [] mark =new int [3];
        mark[0]=56;
        mark[1]=20;
        mark[2]=30;
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        // sc.close();this function is not use even scanner is not allowed to enter the value
        System.out.println("enter the arry index: ");
        int ide=sc.nextInt();
        System.out.println("enter the divided number with arry value ");
        int number=sc.nextInt();
       try {
            System.out.println("enter the value arry: " + mark[ide]);
            System.out.println("enter the number of divided part: " + mark[ide]/number);

            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("enter the number is arryoutofbound");
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("the enter number to be cheak");
            System.out.println(e);

        }  catch (Exception e) {
            System.out.println("some anther occer in");
            System.out.println(e);
        }

    }
    
}

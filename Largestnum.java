import java.util.Scanner;

public class Largestnum{
    public static void main(String[] args) {
        System.out.println("This program returns the largest of three numbers entered by the user");
        System.out.println("Enter three numbers ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if(b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.println("The largest number is " +max);
    }
}
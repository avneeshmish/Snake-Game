import java.util.Random;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int x1 = sc.nextInt();
        System.out.println(x1);

        Random r = new Random();
        int x = r.nextInt(5);
        System.out.println(x);



        if (x <x1){
            System.out.println("to low");
        } else if (x >x1) {
            System.out.println("to high");
        } else if (x == x1) {
            System.out.println("match");
        } else {
            System.out.println("not match");
        }
    }
}

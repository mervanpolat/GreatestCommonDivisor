import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int gcd, n1, n2;
        System.out.println("Enter two numbers: ");
        n1 = input.nextInt();
        n2 = input.nextInt();

        //Logic to find the gcd
        if (n1 > n2) {
            gcd = n2;
        } else {
            gcd = n1;
        }

        //If the below condition is not fulfilled then decrease gcd by one, until both numbers are divided without any rest by the gcd.
        //In other words, execute the following logic until the condition is met.
        while (!(n1 % gcd == 0 && n2 % gcd == 0)) {
            gcd--;
        }

        System.out.println("GCD for " + n1 + " and " + n2 + " is: " + gcd);

    }

}
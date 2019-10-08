/***
 * *
 * * Description: This program show you how percent accrued on deposit monthly.
 */

import java.util.Scanner;
public class Cpitalization {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double t;
        System.out.println("Enter month : ");
        t = num.nextDouble();
        int P;
        System.out.println("How many money do you want  to put : ");
        P = num.nextInt();
        double r;
        System.out.println("What the percent do you have : ");
        r = num.nextDouble()/100;
        double sum=P;
        for(int i=1;i<=t;i++) {
            System.out.println("=== Month " + i + " ===");
            System.out.println("percent : " + (sum*Math.pow(Math.E, r/12)-sum));
            sum=sum*Math.pow(Math.E, r/12);
            System.out.println("sum   : " + sum);
        }
    }
}

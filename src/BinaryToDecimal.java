import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Binary Number");
        long a= sc.nextLong();
        System.out.println("Decimal of " + a +" is " + solution1(a));

    }
    // for solution1, TC=O(log n) and SC=O(1)

    static int solution1(long n){
        int decimal=0;
        int pow=1;
        while (n!=0){
            long rem=n%10;
            n=n/10;
            decimal+=rem*pow;
            pow=pow*2;
        }
        return decimal;
    }
    static int solution2(long n){
        String str = Long.toString(n);
        return (Integer.parseInt(str, 2));
    }
}

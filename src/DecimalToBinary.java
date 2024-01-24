import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a integer to convert it into Binary");
        int a = sc.nextInt();
        System.out.println("Binary of " + a +" is " + solution1(a));
    }
    static String solution2(int n){
        String binary = Integer.toBinaryString(n);
        return binary;
    }
    // for solution1, TC=O(log n) and SC=O(1)
    static long solution1(int n){
        long binary=0;
        int rem;
        int pow=1;
        while (n!=0){
            rem =n%2;
            n=n/2;
            binary+= rem*pow;
            pow*=10;
        }
        return binary;
    }
}

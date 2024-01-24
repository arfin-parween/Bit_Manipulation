import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        System.out.println("Enter 2nd number");
        int b= sc.nextInt();
        and(a,b);
        or(a,b);
        xor(a,b);
        not(a,b);
    }
    // AND , TC=O(1) and SC=O(1)
    static void and(int a, int b){

        System.out.println("AND of "+ a +" and "+ b + " is: " + (a&b));
    }
    // OR leftShift , TC=O(1) and SC=O(1)
    static void or(int a, int b){

        System.out.println("OR of "+ a +" and "+ b + " is: " + (a|b));
    }
    // XOR , TC=O(1) and SC=O(1)
    static void xor(int a, int b){

        System.out.println("XOR of "+ a +" and "+ b + " is: " + (a^b));
    }
    // NOT, TC=O(1) and SC=O(1)
    static void not(int a, int b){
        System.out.println("Complement/NOT of " +a +" is "+ (~a));
        System.out.println("Complement/NOT of " +b +" is "+ (~b));

    }
}

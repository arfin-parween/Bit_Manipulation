import java.util.Scanner;

public class ShiftOperator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter till what bit you want to shift");
        int b= sc.nextInt();
        leftShift(a,b);
        rightShift(a,b);
    }

    static void leftShift(int a, int b){

        System.out.println("Left Shifting "+a +" by "+b +" is " + (a<<b));
    }
    static void rightShift(int a, int b){

        System.out.println("Right Shifting "+a +" by "+b +" is " + (a>>b));
    }
}

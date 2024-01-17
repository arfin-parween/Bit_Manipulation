import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is power of four or not");
        int a= sc.nextInt();
        System.out.println(solution2(a));
    }
    static boolean solution1(int n){
        if(n<1) return false;
        while (n!=1){
            if(n%4!=0) return false;
            n=n/4;
        }
        return true;
    }

    static boolean solution2(int n){
        return (n & (n - 1)) == 0 && (n % 3 == 1);
    }
    static boolean solution3(int n){
        if (n<1) return false;
        if (n==1) return true;
        if (n%4!=0) return false;
        return solution3(n/4);
    }
}

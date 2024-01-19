import java.util.Scanner;

public class HammingDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st Integer");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Integer");
        int b = sc.nextInt();
        System.out.print("The Hamming distance between two integers is ");
        System.out.println(solution(a,b));
    }

    static int solution(int x, int y) {
        int count =0;
        for (int i = 0; i <= 32; i++) {
            if((x&1) != (y&1)){
                count++;
            }
            x= x>>1;
            y= y>>1;
        }
        return  count;
    }
}
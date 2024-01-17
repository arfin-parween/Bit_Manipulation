import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is power of two or not");
        int a= sc.nextInt();
        System.out.println(solution4(a));
    }
    static boolean solution1(int n){
        if(n==0) return false;
        while (n!=1){
            if(n%2!=0) return false;
            n=n/2;
        }
        return true;
    }
    static boolean solution2(int n){
        if (n<1) return false;
        if (n==1) return true;
        int count=0;
        for(int i=0;i<32;i++){
            if((n&1)==1)
                count++;
            n=n>>1;
        }
        if (count==1) return true;
        else return false;
    }
    static boolean solution3(int n){
        if (n<1) return false;
        if (n==1) return true;
        return ((n & (n-1)) == 0);
    }
    static boolean solution4(int n){
        if (n<1) return false;
        if (n==1) return true;
        if (n%2!=0) return false;
        return solution4(n/2);
    }
}

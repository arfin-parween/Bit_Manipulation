import java.util.Scanner;

public class BitMasking {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= sc.nextInt();
        System.out.println("Enter bit position");
        int k =sc.nextInt();
        System.out.println(setBit(n,k));
        System.out.println(unSetBit(n,k));
        System.out.println(togglingBit(n,k));
        System.out.println(checkBit(n,k));
    }
    // for setBit , TC=O(1) and SC=O(1)
    static int setBit(int n, int k){
        System.out.print("After Setting " + k+"th bit, the answer will be: ");
        return n= n | (1<<k);
    }
    // for unSetBit , TC=O(1) and SC=O(1)
    static int unSetBit(int n, int k){
        System.out.print("After unsetting " + k+"th bit, the answer will be: ");
        return n= n & ~(1<<k);
    }
    // for togglingBit , TC=O(1) and SC=O(1)
    static int togglingBit(int n, int k){
        System.out.print("After toggling " + k+"th bit, the answer will be: ");
        return n= n ^ (1<<k);
    }
    // for checkBit , TC=O(1) and SC=O(1)
    static boolean checkBit(int n, int k){
        System.out.print("Checking " + k+"th bit, the answer is: ");
        if((n & (1<<k))==0) return false;
        else return true;
    }
}

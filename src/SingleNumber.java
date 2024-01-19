import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        int[] array = new int[30000];
        System.out.println("Enter the elements of the array (Odd number): ");
        for (int i = 1; i <= n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Single Element is ");
        System.out.println(solution(array));
    }
// This is Leetcode problem Single Number (136)
    static int solution(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}
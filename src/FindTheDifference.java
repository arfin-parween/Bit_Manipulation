import java.util.Scanner;

public class FindTheDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String  a = sc.next();
        System.out.println("Enter 2nd string");
        String b= sc.next();
        System.out.println(solution2(a,b));
    }
    static char solution1(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }
    static char solution2(String s, String t) {
        int i = 0, result = 0;
        while (i < s.length()) {
            result ^= t.charAt(i) ^ s.charAt(i);
            i++;
        }
        if (i < t.length())
            result ^= t.charAt(i);
        return (char) result;
    }
}
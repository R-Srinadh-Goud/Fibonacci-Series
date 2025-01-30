import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number of terms
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        // Initialize the first two terms
        int first = 0, second = 1;
        
        // Print Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        
        sc.close();
    }
}

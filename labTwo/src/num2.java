import java.util.Scanner;

public class num2 {
    public static void m(int x) {
        if (x != 1) {
            m(x / 2);
        }
        System.out.print(x%2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        m(num);
    }
}
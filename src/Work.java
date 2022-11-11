import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();

        System.out.println(numbers / 100);
        System.out.println(numbers / 10 % 10);
        System.out.println(numbers % 10);

    }
}

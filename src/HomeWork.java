import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <= 9){
            System.out.println("OneNumber");
        }
        if (number >= 10 && number <= 99){
            System.out.println("TwoNumbers");
        }
        if (number >= 100 && number <= 999){
            System.out.println("ThreeNumbers");}
        }
    }


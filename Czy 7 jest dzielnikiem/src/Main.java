import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int myNumber = scanner.nextInt();
        if (myNumber % 7 == 0) {
            System.out.println("7 jest dzielnikiem liczby " + myNumber);
        }
        else {
            System.out.println("7 nie jest dzielnikiem liczby " + myNumber);
        }
    }
}

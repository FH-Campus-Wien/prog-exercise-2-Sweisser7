package at.ac.fhcampuswien;

import org.graalvm.compiler.lir.aarch64.AArch64Compare;

import java.util.Scanner;

public class App {


    //todo Task 1
    public void largestNumber() {

        int count = 1;
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number "+ count++ + ": ");
        double number = x = scanner.nextDouble();

        if (number <= 0) {
            System.out.println("No number entered.");
        } else {
            while (number > 0) {
                System.out.print("Number " + count + ": ");
                number = scanner.nextDouble();
                if (x < number) {
                    x = number;
                }
                count++;
            }
            System.out.printf("The largest number is %.2f" + System.lineSeparator(), x);
        }
        // input your solution here
    }

        

    //todo Task 2
    public void stairs() {
        Scanner scan = new Scanner(System.in);
        final int COUNT = scan.nextInt();
        int y = 1;
        System.out.print("n: ");
        if (COUNT >= 0) {
            for (int i = 0; i < COUNT; i++) {
                for (int j = COUNT; j >= COUNT - i; j--) {
                    System.out.print(y + " ");
                    y++;
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 3
    public void printPyramid(){
        int ROW = 6;

        for (int x = 1; x <= ROW; x++) {
            for (int y = ROW; y > x; y--) {
                System.out.print(" ");
            }
            for (int z = 0; z < x*2-1; z++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int number = scanner.nextInt();
        int x = 0;
        int sum = 0;

        while (number != 1) {
            sum = 0;
            while (number != 0) {
                x = number % 10;
                sum = sum + (x * x);
                number = number / 10;
            }
            number = sum;
            if (number == 4) {
                System.out.println("Sad number!");
                return;
            }
        }
        System.out.println("Happy number!");
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}
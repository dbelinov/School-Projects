import java.util.Random;
import java.util.Scanner;

//User enters width and height of imaginary monitor -> |symbols|
//User picks type of 'monitor icons' count -> random / user choice
//If preferred icon input is 'random' -> random amount of icons per row is selected
//If preferred icon input is 'input' -> user enters values for each row of the monitor
//Monitor is printed
public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        /* Input */
        System.out.print("Въведете широчина на монитора: ");
        int widthOfMonitor = inp.nextInt();
        System.out.print("Въведете височина на монитора: ");
        int heightOfMonitor = inp.nextInt();

        int[] icons = new int[heightOfMonitor - 2];

        /* Type of Icons Selector */
        System.out.print("Въведете тип икони: random/input: ");
        String typeOfIcons = inp.next();

        /* Icons Input */
        System.out.println("Въведете брой икони за всеки ред от монитора");
        for (int row = 0; row < heightOfMonitor - 2; row++) {
            int iconsOnRow;
            if (typeOfIcons.equals("input")) {
                /* Inputted Icons */
                iconsOnRow = inp.nextInt();
            }
            else {
                /* Random Icons */
                Random random = new Random();
                iconsOnRow = random.nextInt(widthOfMonitor - 2);
            }

            /* Valid Amount */
            if (iconsOnRow <= widthOfMonitor - 2) {
                icons[row] = iconsOnRow;
            }
            /* Invalid Amount */
            else {
                System.out.println("Невалиден брой икони! Въведете нов брой за същия ред");
                row--;
            }
        }

        /* Monitor Print */
        for (int row = 1; row <= heightOfMonitor; row++) {
            if (row == 1 || row == heightOfMonitor) {
                for (int starsOnRow = 0; starsOnRow < widthOfMonitor; starsOnRow++) {
                    System.out.print("*");
                }
            }
            else {
                /* Left Frame */
                System.out.print("*");

                /* Icons */
                for (int iconsOnRow = 0; iconsOnRow < icons[row - 2]; iconsOnRow++) {
                    System.out.print("*");
                }

                /* Intervals */
                for (int intervalsOnRow = 0; intervalsOnRow < widthOfMonitor - icons[row - 2] - 2; intervalsOnRow++) {
                    System.out.print(" ");
                }

                /* Right Frame */
                System.out.print("*");
            }

            PrintPC(widthOfMonitor);

            System.out.println();
        }

        /* Monitor Stand Print */
        for (int row = 0; row < heightOfMonitor / 2; row++) {
            /* Upper Part */
            if (row != heightOfMonitor / 2 - 1) {
                /* Intervals Left */
                for (int intervalsOnRow = 0; intervalsOnRow < widthOfMonitor / 2; intervalsOnRow++) {
                    System.out.print(" ");
                }
                /* Stand */
                System.out.print("*");
                /* Intervals Right */
                for (int intervalsOnRow = 0; intervalsOnRow < widthOfMonitor / 2; intervalsOnRow++) {
                    System.out.print(" ");
                }
            }
            /* Bottom Part */
            else {
                //Intervals Left
                for (int intervalsOnRow = 0; intervalsOnRow < widthOfMonitor / 4; intervalsOnRow++) {
                    System.out.print(" ");
                }
                //Stand
                for (int starsOnRow = 0; starsOnRow < widthOfMonitor / 2 + 1; starsOnRow++) {
                    System.out.print("*");
                }
                //Intervals Right
                for (int intervalsOnRow = 0; intervalsOnRow < widthOfMonitor / 4; intervalsOnRow++) {
                    System.out.print(" ");
                }
            }

            PrintPC(widthOfMonitor);

            System.out.println();
        }
    }

    private static void PrintPC(int widthOfMonitor) {
        /* Intervals Between Monitor and PC */
        for (int intervalsOnRow = 0; intervalsOnRow < widthOfMonitor / 8; intervalsOnRow++) {
            System.out.print(" ");
        }

        /* PC */
        for (int starsOnRow = 0; starsOnRow < widthOfMonitor / 3; starsOnRow++) {
            System.out.print("*");
        }
    }
}
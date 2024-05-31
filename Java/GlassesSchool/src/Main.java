import java.util.Scanner;

//User chooses size of glasses -> |symbols|
//Program prints a shape of glasses in the chosen size

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Въведете размер на очилата: ");
        int num = inp.nextInt();

        //sides
        for (int sides = num; sides > 0; sides--) {

            for (int intervalsLeftSide = sides - 1; intervalsLeftSide > 0; intervalsLeftSide--) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int intervalsRightSide = 1; intervalsRightSide < 2 * num + num / 2 - 1; intervalsRightSide++) {
                System.out.print(" ");
            }

            System.out.print("*");

            System.out.println();
        }


        for (int row = 1; row <= num; row++) {
            for (int fullRowLeftGlass = 1; fullRowLeftGlass <= num; fullRowLeftGlass++) {
                if (row == 1 || row == num) {
                    System.out.print("*");
                }
                else {
                    System.out.print("* ");
                    if (fullRowLeftGlass >= 2) break;
                    for (int intervalsLeftGlass = 1; intervalsLeftGlass <= (num - 3); intervalsLeftGlass++) {
                        System.out.print(" ");
                    }
                }
                if (row == num / 2 + 1) {
                    for (int starsConnector = 1; starsConnector <= num / 2 + 1; starsConnector++) {
                        System.out.print("*");
                    }
                    break;
                }
            }
            if (row == 1 || row == num && row != num / 2 + 1) {
                for (int intervalsConnector = 1; intervalsConnector < num / 2 + 1; intervalsConnector++) {
                    System.out.print(" ");
                }
            }
            else if (row != num / 2 + 1) {
                for (int intervalsConnector = 1; intervalsConnector < num / 2; intervalsConnector ++) {
                    System.out.print(" ");
                }
            }
            for (int fullRowRightGlass = 1; fullRowRightGlass <= num; fullRowRightGlass++) {
                System.out.print("*");
                if (row != 1 && row != num) {
                    for (int intervalsRightGlass = 1; intervalsRightGlass <= (num - 2); intervalsRightGlass++) {
                        System.out.print(" ");
                    }
                    if (fullRowRightGlass == 2) break;
                }
            }

            System.out.println();
        }

    }
}
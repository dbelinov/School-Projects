import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Въведете дума от списъка: hello, fast, school, car: ");
        String word = inp.nextLine();
        if (word.equals("teacher"))
            System.out.println("Вие намерихте тайния Easter Egg! Поздравления!");
        System.out.print("Въведете размер на буквите: ");
        int letterSize = inp.nextInt();

        if (word.equals("hello")) {
            //H
            for (int row = 1; row <= letterSize; row++) {
                if (row != letterSize / 2 + 1) {
                    for (int starsOnRow = 1; starsOnRow <= 2; starsOnRow++) {
                        System.out.print("*");
                        if (starsOnRow < 2)
                        for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                            System.out.print(" ");
                        }
                    }
                }
                else {
                    for (int starsOnRow = 2; starsOnRow <= letterSize + 2; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //E
                if (row == 1 || row == letterSize / 2 + 1 || row == letterSize) {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else {
                        System.out.print("*");
                        for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                            System.out.print(" ");
                        }
                }
                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //2*L
                for (int lCounter = 1; lCounter <= 2; lCounter++) {
                    if (row != letterSize) {
                        System.out.print("*");
                        for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                            System.out.print(" ");
                        }
                    }
                    else {
                        for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                            System.out.print("*");
                        }
                    }

                    for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                        System.out.print(" ");
                    }
                }

                //O
                if (row != 1 && row != letterSize) {
                    for (int starsOnRow = 1; starsOnRow <= 2; starsOnRow++) {
                        System.out.print("*");
                        if (starsOnRow < 2) {
                            for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                                System.out.print(" ");
                            }
                        }
                    }
                }
                else {
                    for (int starsOnRow = 1; starsOnRow <= letterSize + 1; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
        else if (word.equals("school")) {
            //S
            for (int row = 1; row <= letterSize; row++) {
                if (row == 1 || row == letterSize / 2 + 1 || row == letterSize) {
                    for (int starsOnRow =  1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else if (row <= letterSize / 2) {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                }
                else {
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //C
                if (row == 1 || row == letterSize) {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                }

                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //H
                    if (row != letterSize / 2 + 1) {
                        for (int starsOnRow = 1; starsOnRow <= 2; starsOnRow++) {
                            System.out.print("*");
                            if (starsOnRow < 2)
                                for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                                    System.out.print(" ");
                                }
                        }
                    }
                    else {
                        for (int starsOnRow = 2; starsOnRow <= letterSize + 2; starsOnRow++) {
                            System.out.print("*");
                        }
                    }
                    for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                        System.out.print(" ");
                    }

                 //2*O
                for (int oCounter = 1; oCounter <= 2; oCounter++) {
                    if (row != 1 && row != letterSize) {
                        for (int starsOnRow = 1; starsOnRow <= 2; starsOnRow++) {
                            System.out.print("*");
                            if (starsOnRow < 2) {
                                for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                                    System.out.print(" ");
                                }
                            }
                        }
                    }
                    else {
                        for (int starsOnRow = 1; starsOnRow <= letterSize + 1; starsOnRow++) {
                            System.out.print("*");
                        }
                    }
                    for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                        System.out.print(" ");
                    }
                }

                //L
                if (row != letterSize) {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                }
                else {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }

                System.out.println();
            }
        }
        else if(word.equals("fast")) {
            for (int row = 1; row <= letterSize; row++) {
                //F
                if (row == 1 || row == letterSize / 2 + 1) {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                }

                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //A
                if (row == 1 || row == letterSize / 2 + 1) {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 2; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //S
                if (row == 1 || row == letterSize / 2 + 1 || row == letterSize) {
                    for (int starsOnRow =  1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else if (row <= letterSize / 2) {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                }
                else {
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //T
                if (row == 1) {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else {
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize / 2; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                System.out.println();
            }
        }
        else if (word.equals("car")) {
            for (int row = 1; row <= letterSize; row++) {
                //C
                if (row == 1 || row == letterSize) {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                }

                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //A
                if (row == 1 || row == letterSize / 2 + 1) {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 2; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //R
                if (row == 1 || row == letterSize / 2 + 1) {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else if (row < letterSize / 2 + 1) {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 2; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                else {
                    System.out.print("*");
                    for (int intervalsOnRow = 0; intervalsOnRow < row - 1; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                System.out.println();
            }
        }
        else if (word.equals("teacher")) {
            for (int row = 1; row <= letterSize; row++) {
                //J
                if (row == 1 || row == letterSize) {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else if (row != letterSize - 1) {
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                else {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 2; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //.
                if (row <= letterSize / 2 + 1) {
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize / 2; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                }
                else {
                    for (int starsOnRow = 1; starsOnRow <= letterSize / 2; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                for (int intervalsForNextWord = 1; intervalsForNextWord <= letterSize; intervalsForNextWord++) {
                    System.out.print(" ");
                }


                //J
                if (row == 1 || row == letterSize) {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else if (row != letterSize - 1) {
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                else {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 2; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //E
                if (row == 1 || row == letterSize / 2 + 1 || row == letterSize) {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                }
                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //L
                if (row != letterSize) {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                }
                else {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }

                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //Y
                if (row == letterSize / 2 + 1 || row == letterSize) {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else if (row < letterSize / 2 + 1) {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 2; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                else {
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //A
                if (row == 1 || row == letterSize / 2 + 1) {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 2; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //Z
                for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                    if (row == 1 || row == letterSize || row + starsOnRow == letterSize + 1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //K
                System.out.print("*");
                if (row <= letterSize / 2) {
                    for (int intervalsOnRowStart = 1; intervalsOnRowStart <= letterSize - 3; intervalsOnRowStart++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    System.out.print(" ");
                }
                else if (row == letterSize / 2 + 1){
                    for (int starsOnRow = 1; starsOnRow <= letterSize - 2; starsOnRow++) {
                        System.out.print("*");
                    }
                    System.out.print(" ");
                }
                else {
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 2; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //O
                if (row != 1 && row != letterSize) {
                    for (int starsOnRow = 1; starsOnRow <= 2; starsOnRow++) {
                        System.out.print("*");
                        if (starsOnRow < 2) {
                            for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                                System.out.print(" ");
                            }
                        }
                    }
                }
                else {
                    for (int starsOnRow = 1; starsOnRow <= letterSize + 1; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //V
                if (row != letterSize && row != letterSize - 1) {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 2; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                else if (row == letterSize - 1) {
                    System.out.print(" ");
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 4; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    System.out.print(" ");
                }
                else if (row == letterSize){
                    for (int intervalsOnRowOne = 1; intervalsOnRowOne <= letterSize / 2; intervalsOnRowOne++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int intervalsOnRowTwo = 1; intervalsOnRowTwo <= letterSize / 2; intervalsOnRowTwo++) {
                        System.out.print(" ");
                    }
                }

                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //A
                if (row == 1 || row == letterSize / 2 + 1) {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 2; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                System.out.println();
            }
        }

        else {
            for (int row = 1; row <= letterSize; row++) {
                //F
                if (row == 1 || row == letterSize / 2 + 1) {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                }

                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //4
                if (row == letterSize / 2 + 1) {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else if (row < letterSize / 2 + 1) {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 2; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                else {
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //0
                if (row != 1 && row != letterSize) {
                    for (int starsOnRow = 1; starsOnRow <= 2; starsOnRow++) {
                        System.out.print("*");
                        if (starsOnRow < 2) {
                            for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                                System.out.print(" ");
                            }
                        }
                    }
                }
                else {
                    for (int starsOnRow = 1; starsOnRow <= letterSize + 1; starsOnRow++) {
                        System.out.print("*");
                    }
                }

                for (int intervalsForNextLetter = 1; intervalsForNextLetter <= letterSize / 2; intervalsForNextLetter++) {
                    System.out.print(" ");
                }

                //4
                if (row == letterSize / 2 + 1) {
                    for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                        System.out.print("*");
                    }
                }
                else if (row < letterSize / 2 + 1) {
                    System.out.print("*");
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 2; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                else {
                    for (int intervalsOnRow = 1; intervalsOnRow <= letterSize - 1; intervalsOnRow++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}
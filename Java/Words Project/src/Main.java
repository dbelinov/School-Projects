import java.util.Scanner;

//User chooses a word from the following options: hello, fast, school, car
//User chosses the size of the printed letters size -> |symbols|
//Program returns chosen word printed in large format

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
            for (int row = 1; row <= letterSize; row++) {
                H(letterSize, row);
                NextLetterInterval(letterSize);

                //E
                E(letterSize, row);
                NextLetterInterval(letterSize);

                //2*L
                for (int lCounter = 1; lCounter <= 2; lCounter++) {
                    L(letterSize, row);

                    NextLetterInterval(letterSize);
                }

                //O
                O(letterSize, row);
                System.out.println();
            }
        }
        else if (word.equals("school")) {
            //S
            for (int row = 1; row <= letterSize; row++) {
                S(letterSize, row);

                NextLetterInterval(letterSize);

                //C
                C(letterSize, row);

                NextLetterInterval(letterSize);

                //H
                H(letterSize, row);
                NextLetterInterval(letterSize);

                //2*O
                for (int oCounter = 1; oCounter <= 2; oCounter++) {
                    O(letterSize, row);
                    NextLetterInterval(letterSize);
                }

                //L
                L(letterSize, row);

                System.out.println();
            }
        }
        else if(word.equals("fast")) {
            for (int row = 1; row <= letterSize; row++) {
                //F
                C(letterSize / 2 + 1, row);

                NextLetterInterval(letterSize);

                //A
                A(letterSize, row);

                NextLetterInterval(letterSize);

                //S
                S(letterSize, row);

                NextLetterInterval(letterSize);

                //T
                T(letterSize, row);

                System.out.println();
            }
        }
        else if (word.equals("car")) {
            for (int row = 1; row <= letterSize; row++) {
                //C
                C(letterSize, row);

                NextLetterInterval(letterSize);

                //A
                A(letterSize, row);

                NextLetterInterval(letterSize);

                //R
                R(letterSize, row);

                System.out.println();
            }
        }
        else if (word.equals("teacher")) {
            for (int row = 1; row <= letterSize; row++) {
                //J
                J(letterSize, row);
                NextLetterInterval(letterSize);

                //.
                Dot(letterSize, row);
                NextWordInterval(letterSize);


                //J
                J(letterSize, row);
                NextLetterInterval(letterSize);

                //E
                E(letterSize, row);
                NextLetterInterval(letterSize);

                //L
                L(letterSize, row);

                NextLetterInterval(letterSize);

                //Y
                Y(letterSize, row);

                NextLetterInterval(letterSize);

                //A
                A(letterSize, row);

                NextLetterInterval(letterSize);

                //Z
                Z(letterSize, row);
                NextLetterInterval(letterSize);

                //K
                K(letterSize, row);
                NextLetterInterval(letterSize);

                //O
                O(letterSize, row);
                NextLetterInterval(letterSize);

                //V
                V(letterSize, row);

                NextLetterInterval(letterSize);

                //A
                A(letterSize, row);

                System.out.println();
            }
        }

        else {
            for (int row = 1; row <= letterSize; row++) {
                //4
                Four(letterSize, row);

                NextLetterInterval(letterSize);

                //0
                O(letterSize, row);

                NextLetterInterval(letterSize);

                //4
                Four(letterSize, row);

                System.out.println();
            }
        }
    }

    private static void Four(int letterSize, int row) {
        if (row == letterSize / 2 + 1) {
            for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                System.out.print("*");
            }
        }
        else if (row < letterSize / 2 + 1) {
            System.out.print("*");
            NextWordInterval(letterSize - 2);
            System.out.print("*");
        }
        else {
            NextWordInterval(letterSize - 1);
            System.out.print("*");
        }
    }

    private static void V(int letterSize, int row) {
        if (row != letterSize && row != letterSize - 1) {
            System.out.print("*");
            NextWordInterval(letterSize - 2);
            System.out.print("*");
        }
        else if (row == letterSize - 1) {
            System.out.print(" ");
            System.out.print("*");
            NextWordInterval(letterSize - 4);
            System.out.print("*");
            System.out.print(" ");
        }
        else if (row == letterSize){
            NextLetterInterval(letterSize);
            System.out.print("*");
            NextLetterInterval(letterSize);
        }
    }

    private static void K(int letterSize, int row) {
        System.out.print("*");
        if (row <= letterSize / 2) {
            NextWordInterval(letterSize - 3);
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
            NextWordInterval(letterSize - 2);
            System.out.print("*");
        }
    }

    private static void Z(int letterSize, int row) {
        for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
            if (row == 1 || row == letterSize || row + starsOnRow == letterSize + 1) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
    }

    private static void Y(int letterSize, int row) {
        if (row == letterSize / 2 + 1 || row == letterSize) {
            for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                System.out.print("*");
            }
        }
        else if (row < letterSize / 2 + 1) {
            System.out.print("*");
            NextWordInterval(letterSize - 2);
            System.out.print("*");
        }
        else {
            NextWordInterval(letterSize - 1);
            System.out.print("*");
        }
    }

    private static void Dot(int letterSize, int row) {
        if (row <= letterSize / 2 + 1) {
            NextLetterInterval(letterSize);
        }
        else {
            for (int starsOnRow = 1; starsOnRow <= letterSize / 2; starsOnRow++) {
                System.out.print("*");
            }
        }
    }

    private static void NextWordInterval(int letterSize) {
        for (int intervalsForNextWord = 1; intervalsForNextWord <= letterSize; intervalsForNextWord++) {
            System.out.print(" ");
        }
    }

    private static void J(int letterSize, int row) {
        if (row == 1 || row == letterSize) {
            for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                System.out.print("*");
            }
        }
        else if (row != letterSize - 1) {
            NextWordInterval(letterSize - 1);
            System.out.print("*");
        }
        else {
            System.out.print("*");
            NextWordInterval(letterSize - 2);
            System.out.print("*");
        }
    }

    private static void R(int letterSize, int row) {
        if (row == 1 || row == letterSize / 2 + 1) {
            for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                System.out.print("*");
            }
        }
        else if (row < letterSize / 2 + 1) {
            System.out.print("*");
            NextWordInterval(letterSize - 2);
            System.out.print("*");
        }
        else {
            System.out.print("*");
            for (int intervalsOnRow = 0; intervalsOnRow < row - 1; intervalsOnRow++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
    }

    private static void T(int letterSize, int row) {
        if (row == 1) {
            for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                System.out.print("*");
            }
        }
        else {
            NextLetterInterval(letterSize);
            System.out.print("*");
        }
    }

    private static void A(int letterSize, int row) {
        if (row == 1 || row == letterSize / 2 + 1) {
            for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                System.out.print("*");
            }
        }
        else {
            System.out.print("*");
            NextWordInterval(letterSize - 2);
            System.out.print("*");
        }
    }

    private static void C(int letterSize, int row) {
        if (row == 1 || row == letterSize) {
            for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                System.out.print("*");
            }
        }
        else {
            System.out.print("*");
            NextWordInterval(letterSize - 1);
        }
    }

    private static void S(int letterSize, int row) {
        if (row == 1 || row == letterSize / 2 + 1 || row == letterSize) {
            for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                System.out.print("*");
            }
        }
        else if (row <= letterSize / 2) {
            System.out.print("*");
            NextWordInterval(letterSize - 1);
        }
        else {
            NextWordInterval(letterSize - 1);
            System.out.print("*");
        }
    }

    private static void O(int letterSize, int row) {
        if (row != 1 && row != letterSize) {
            for (int starsOnRow = 1; starsOnRow <= 2; starsOnRow++) {
                System.out.print("*");
                if (starsOnRow < 2) {
                    NextWordInterval(letterSize - 1);
                }
            }
        }
        else {
            for (int starsOnRow = 1; starsOnRow <= letterSize + 1; starsOnRow++) {
                System.out.print("*");
            }
        }
    }

    private static void L(int letterSize, int row) {
        if (row != letterSize) {
            System.out.print("*");
            NextWordInterval(letterSize - 1);
        }
        else {
            for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                System.out.print("*");
            }
        }
    }

    private static void E(int letterSize, int row) {
        if (row == 1 || row == letterSize / 2 + 1 || row == letterSize) {
            for (int starsOnRow = 1; starsOnRow <= letterSize; starsOnRow++) {
                System.out.print("*");
            }
        }
        else {
                System.out.print("*");
            NextWordInterval(letterSize - 1);
        }
    }

    private static void NextLetterInterval(int letterSize) {
        NextWordInterval(letterSize / 2);
    }

    private static void H(int letterSize, int row) {
        if (row != letterSize / 2 + 1) {
            for (int starsOnRow = 1; starsOnRow <= 2; starsOnRow++) {
                System.out.print("*");
                if (starsOnRow < 2)
                    NextWordInterval(letterSize - 1);
            }
        }
        else {
            for (int starsOnRow = 2; starsOnRow <= letterSize + 2; starsOnRow++) {
                System.out.print("*");
            }
        }
    }
}
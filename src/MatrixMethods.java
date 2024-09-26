import java.util.Scanner;

public class MatrixMethods {

    public static void showAlphabet() {
        int i, k;
        String[][] alphabet = new String[6][5];

        alphabet[0][0] = "a";
        alphabet[0][1] = "b";
        alphabet[0][2] = "c";
        alphabet[0][3] = "d";
        alphabet[0][4] = "e";
        alphabet[1][0] = "f";
        alphabet[1][1] = "g";
        alphabet[1][2] = "h";
        alphabet[1][3] = "i";
        alphabet[1][4] = "j";
        alphabet[2][0] = "k";
        alphabet[2][1] = "l";
        alphabet[2][2] = "m";
        alphabet[2][3] = "n";
        alphabet[2][4] = "o";
        alphabet[3][0] = "p";
        alphabet[3][1] = "q";
        alphabet[3][2] = "r";
        alphabet[3][3] = "s";
        alphabet[3][4] = "t";
        alphabet[4][0] = "u";
        alphabet[4][1] = "v";
        alphabet[4][2] = "w";
        alphabet[4][3] = "x";
        alphabet[4][4] = "y";
        alphabet[5][0] = "z";
        alphabet[5][1] = "!";
        alphabet[5][2] = "?";
        alphabet[5][3] = ".";
        alphabet[5][4] = ",";

        for(i = 0; i <= 5; i++) {
            for (k = 0; k <= 4; k++) {
                System.out.print(alphabet[i][k] + " ");
            }
        }

    }

    public static void showIntNumbers () {
        int i, k;
        int[][] numbers = new int [3][4];

        numbers[0][0] = 19;
        numbers[0][1] = 25;
        numbers[0][2] = 100;
        numbers[0][3] = 99;
        numbers[1][0] = 10;
        numbers[1][1] = 7;
        numbers[1][2] = 25;
        numbers[1][3] = 14;
        numbers[2][0] = 35;
        numbers[2][1] = 2;
        numbers[2][2] = 47;
        numbers[2][3] = 74;

        for(i = 0; i <= 2; i++) {
            for (k = 0; k <= 3; k++) {
                if (i == 1 || i == 2) { if(k == 0){System.out.println();}}
                System.out.print(numbers[i][k] + " ");
            }
        }
    }

    public static void showDoubleNumbers () {
        int i, k;
        double[][] numbers = new double [3][3];

        numbers[0][0] = 1.9;
        numbers[0][1] = 2.5;
        numbers[0][2] = 10.0;
        numbers[1][0] = 1.0;
        numbers[1][1] = 7.8;
        numbers[1][2] = 2.5;
        numbers[2][0] = 3.5;
        numbers[2][1] = 2.2;
        numbers[2][2] = 4.7;

        for(i = 0; i <= 2; i++) {
            for (k = 0; k <= 2; k++) {
                if (i == 1 || i == 2) { if(k == 0){System.out.println();}}
                System.out.print(numbers[i][k] + " ");
            }
        }
    }

    public static void crazySum () {
        int i, k, sumOfOdds = 0, sumOfColumns, sumOfLines;
        int [][] crazy = new int [5][5];
        int [] vectorOfColumns = new int[5];
        int [] vectorOfLines = new int[5];
        Scanner sayToMe = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            for (k = 0; k < 5; k++) {
                System.out.printf("Write a number for [%d][%d]: ", i, k);
                crazy[i][k] = sayToMe.nextInt();
            }
        }

        for (i = 0; i < 5; i++) {
            for (k = 0; k < 5; k++) {
                if (crazy[i][k] % 2 != 0) {
                    sumOfOdds += crazy[i][k];
                }
            }
        }

        for (i = 0; i < 5; i++) {
            sumOfLines = 0;
            for (k = 0; k < 5; k++) {
                    sumOfLines += crazy[i][k];
            }
            vectorOfLines[i] = sumOfLines;
        }

        for (k = 0; k < 5; k++) {
            sumOfColumns = 0;
            for (i = 0; i < 5; i++) {
                sumOfColumns += crazy[i][k];
            }
            vectorOfColumns[k] = sumOfColumns;
        }

        System.out.println("Sum of odd numbers: " + sumOfOdds);

        System.out.println("Sum of each column: ");
        for (i = 0; i < 5; i++) {
            System.out.println(vectorOfColumns[i]);
        }

        System.out.println("Sum of each line: ");
        for (i = 0; i < 5; i++) {
            System.out.println(vectorOfLines[i]);
        }
    }

    public static void crazyQuantity () {
        int i, k, j, l, moreThanOne = 0, even = 0, odd = 0;
        int [][] crazy = new int [3][5];
        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < 3; i++) {
            for (k = 0; k < 5; k++) {
                System.out.printf("Write a number for [%d][%d]: ", i, k);
                crazy[i][k] = scanner.nextInt();
            }
        }

        for (i = 0; i < 3; i++) {
            for (k = 0; k < 5; k++) {
                for (j = 0; j < 3; j++) {
                    for (l = 0; l < 5; l++) {
                        if (crazy[i][k] == crazy[j][l]) {
                            moreThanOne++;
                        }
                    }
                }
            }
        }

        for (i = 0; i < 3; i++) {
            for (k = 0; k < 5; k++) {
                if (crazy[i][k] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }

        System.out.println("Are there repeated numbers? ");
        if (moreThanOne > 15) {
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }

        System.out.printf("\nNumber of even numbers: %d", even);

        System.out.printf("\nNumber of odd numbers: %d", odd);
    }

    public static void crazyDiagonal () {
        int i, k;
        double valueOfMainDiagonal, valueOfSecondDiagonal;
        double [][] crazy = new double[4][4];
        double [] mainDiagonal = new double[4];
        double [] secondDiagonal = new double[4];
        double [][] invertedCrazy = new double[4][4];
        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < 4; i++) {
            for (k = 0; k < 4; k++) {
                System.out.printf("Write a decimal number for [%d][%d]: ", i, k);
                crazy[i][k] = scanner.nextDouble();
            }
        }

        for (i = 0; i < 4; i++) {
            for (k = 0; k < 4; k++) {
                if (i == k) {
                    mainDiagonal[i] = crazy[i][k];
                }
            }
        }

        for (i = 0; i < 4; ) {
            for (k = 3; k > -1; k--) {
                    secondDiagonal[i] = crazy[i][k];
                    i++;
            }
        }

        for (i = 0; i < 4; i++) {
            for (k = 0; k < 4; k++) {
                invertedCrazy[k][i] = crazy[i][k];
            }
        }

        System.out.println("Values of main diagonal: ");
        for (i = 0; i < 4; i++) {
            System.out.println(mainDiagonal[i] + " ");
        }

        System.out.println("Values of second diagonal: ");
        for (i = 0; i < 4; i++) {
            System.out.println(secondDiagonal[i] + " ");
        }

        System.out.println("New Inverted Matrix: ");
        for(i = 0; i < 4; i++) {
            for (k = 0; k < 4; k++) {
                 if(k == 0){System.out.println();}
                System.out.print(invertedCrazy[i][k] + " ");
            }
        }
    }
}


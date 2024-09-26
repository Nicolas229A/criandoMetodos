import java.util.Scanner;

public class MatrixPlayMethods {
    public static void geometricShapes(String shape, int size) {
        int i, k, limit1, limit2;
        String [][] completedSquare = new String[size][size];
        String [][] box = new String[size][size];
        String [][] triangle = new String[size][size];

            for (i = 0; i < size; i++) {
                for (k = 0; k < size; k++) {
                    completedSquare[i][k] = "*";
                }
            }

            for (i = 0; i < size; i++) {
                for (k = 0; k < size; k++) {
                    if (k == 0 || k == box.length - 1) {
                        box[i][k] = "*";
                    }
                    if (i == 0 || i == box.length - 1) {
                        box[i][k] = "*";
                    }

                    if (box[i][k] == null) {
                        box[i][k] = " ";
                    }
                }
            }

            limit1 = 0;
            limit2 = 0;
            for (i = 0; i < size; i++) {
                for (k = 0; k < size; k++) {
                    if (i <= limit1 && k <= limit2) {
                        triangle[i][k] = "*";
                    } else {
                        triangle[i][k] = " ";
                    }
                }
                limit1++;
                limit2++;
            }

        if (shape.equals("Completed Square")) {
            System.out.println("Completed Square: ");
            for (i = 0; i < size; i++) {
                for (k = 0; k < size; k++) {
                    if(k == 0){System.out.println();}
                    System.out.print(completedSquare[i][k] + " ");
                }
            }
        }

        if (shape.equals("Box")) {
            System.out.println("Box: ");
            for (i = 0; i < size; i++) {
                for (k = 0; k < size; k++) {
                    if(k == 0){System.out.println();}
                    System.out.print(box[i][k] + " ");
                }
            }
        }

        if (shape.equals("Triangle")) {
            System.out.println("Triangle: ");
            for (i = 0; i < size; i++) {
                for (k = 0; k < size; k++) {
                    if(k == 0){System.out.println();}
                    System.out.print(triangle[i][k] + " ");
                }
            }
        }
    }

    public static void magicSquare(int size) {
        int i, k, sumOfColumns, sumOfLines, sumOfMainDiagonal = 0, sumOfSecondDiagonal = 0, before = 0, couting = 0;
        int [][] theSquare = new int [size][size];
        int [] vectorOfColumns = new int[size];
        int [] vectorOfLines = new int[size];
        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < size; i++) {
            for (k = 0; k < size; k++) {
                System.out.printf("Write a number for [%d][%d]: ", i, k);
                theSquare[i][k] = scanner.nextInt();
            }
        }

        for (i = 0; i < size; i++) {
            sumOfLines = 0;
            for (k = 0; k < size; k++) {
                sumOfLines += theSquare[i][k];
            }
            vectorOfLines[i] = sumOfLines;
        }

        for (k = 0; k < size; k++) {
            sumOfColumns = 0;
            for (i = 0; i < size; i++) {
                sumOfColumns += theSquare[i][k];
            }
            vectorOfColumns[k] = sumOfColumns;
        }

        for (i = 0; i < size; i++) {
            for (k = 0; k < size; k++) {
                if (i == k) {
                    sumOfMainDiagonal += theSquare[i][k];
                }
            }
        }

        for (i = 0; i < size; ) {
            for (k = (size - 1); k > -1; k--) {
                sumOfSecondDiagonal += theSquare[i][k];
                i++;
            }
        }

        System.out.println("The Square: ");
        for (i = 0; i < size; i++) {
            for (k = 0; k < size; k++) {
                if(k == 0){System.out.println();}
                System.out.print(theSquare[i][k] + " ");
            }
        }
        System.out.println();

        System.out.println("Sum of each column: ");
        for (i = 0; i < size; i++) {
            System.out.print(vectorOfColumns[i] + " ");
        }
        System.out.println();

        System.out.println("Sum of each line: ");
        for (i = 0; i < size; i++) {
            System.out.print(vectorOfLines[i] + " ");
        }
        System.out.println();

        System.out.println("Sum of main diagonal: ");
            System.out.println(sumOfMainDiagonal);

        System.out.println("Sum of second diagonal: ");
            System.out.println(sumOfSecondDiagonal);

        if (sumOfMainDiagonal == sumOfSecondDiagonal) {
            before = vectorOfColumns[0];
            for (i = 0; i < size; i++) {
                if (before == vectorOfColumns[i]) {
                    couting++;
                    before = vectorOfColumns[i];
                }
            }
        }

        if (couting == size) {
            before = vectorOfLines[0];
            for (k = 0; k < size; k++) {
                if (before == vectorOfLines[k]) {
                    couting++;
                    before = vectorOfLines[k];
                }
            }
        }

        if (couting >= (size * 2)) {
            System.out.println("This is a magic square! And " + couting );
        } else {
            System.out.println("This isn't a magic square! And " + couting);
        }
    }
}

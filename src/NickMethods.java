import java.util.Scanner;

public class NickMethods {
    public static void votacaoSindico (int andares, int apartamentos) {
        int i, j, c1 = 0, c2 = 0, c3 = 0, c4 = 0, nulos = 0;
        String nome1, nome2, nome3, nome4;
        int [][] votando = new int [andares][apartamentos];
        Scanner sayToMe = new Scanner(System.in);

        System.out.println("Qual o nome do Primeiro Candidato? ");
        nome1 = sayToMe.nextLine();
        System.out.println("Qual o nome do Segundo Candidato? ");
        nome2 = sayToMe.nextLine();
        System.out.println("Qual o nome do Terceiro Candidato? ");
        nome3 = sayToMe.nextLine();
        System.out.println("Qual o nome do Quarto Candidato? ");
        nome4 = sayToMe.nextLine();

        for (i = 0; i < andares; i++) {
            for (j = 0; j < apartamentos; j++) {
                System.out.println("Qual dos 4 candidatos a unidade " + (((i + 1)*100) + (j + 1)) + " deseja votar? \n 1 - " + nome1 + "\n 2 - " + nome2 + "\n 3 - " + nome3 + "\n 4 - " + nome4);
                votando[i][j] = sayToMe.nextInt();
                if (votando[i][j] == 1) {
                    c1++;
                }
                if (votando[i][j] == 2) {
                    c2++;
                }
                if (votando[i][j] == 3) {
                    c3++;
                }
                if (votando[i][j] == 4) {
                    c4++;
                }
                if (votando[i][j] == 5) {
                    nulos++;
                }
            }
        }

        double pc1 = MoreMethods.tranformIntoPercentage(c1, (andares*apartamentos));
        double pc2 = MoreMethods.tranformIntoPercentage(c2, (andares*apartamentos));
        double pc3 = MoreMethods.tranformIntoPercentage(c3, (andares*apartamentos));
        double pc4 = MoreMethods.tranformIntoPercentage(c4, (andares*apartamentos));
        double pnulos = MoreMethods.tranformIntoPercentage(nulos, (andares*apartamentos));

        System.out.println(nome1 + " teve " + pc1 + "%" + " dos votos");
        System.out.println(nome2 + " teve " + pc2 + "%" + " dos votos");
        System.out.println(nome3 + " teve " + pc3 + "%" + " dos votos");
        System.out.println(nome4 + " teve " + pc4 + "%" + " dos votos");
        System.out.println("Houveram " + pnulos + "%" + " de votos nulos");
    }

    public static void votacaoSindicoMelhorada (int candidatos, int andares, int apartamentos) {
        int i, j, k, l, m;
        int[] c = new int [candidatos];
        double[] pc = new double[candidatos];
        String [] nome = new String[candidatos];
        int [] numeroDosCandidatos = new int [candidatos];
        int [][] votando = new int [andares][apartamentos];
        Scanner sayToMe = new Scanner(System.in);

        for (i = 0; i < candidatos; i++) {
            System.out.println("Qual o nome do Candidato " + (i + 1) + "? ");
            nome[i] = sayToMe.nextLine();
        }
        for (i = 0; i < candidatos; i++) {
            System.out.println("Qual o número do Candidato " + (i + 1) + "? ");
            numeroDosCandidatos[i] = sayToMe.nextInt();
        }

        for (i = 0; i < andares; i++) {
            for (j = 0; j < apartamentos; j++) {
                System.out.println("Qual dos candidatos a unidade " + (((i + 1)*100) + (j + 1)) + " deseja votar? ");
                for (k = 0; k < candidatos; k++) {
                    System.out.println(numeroDosCandidatos[k] + " - " + nome[k]);
                }
                votando[i][j] = sayToMe.nextInt();
                for (l = 0; l < candidatos; l++) {
                    if (votando[i][j] == numeroDosCandidatos[l]) {
                        c[l] = c[l] + 1;
                    }
                }
            }
        }
        for (i = 0; i < candidatos; i++) {
            pc[i] = MoreMethods.tranformIntoPercentage(c[i], (andares * apartamentos));
        }

        for (i = 0; i < candidatos; i++) {
            System.out.println(nome[i] + " teve " + pc[i] + "%" + " dos votos");
        }
    }

    public static String quemEGay(String ... nomes) {

        int n = nomes.length, i;
        int sorteio = (int) (Math.random()*n);

        for (i = 0; i < n; i++) {
            if (sorteio == i) {
                return nomes[i] + " é Gay D+ Kkkkkkkkk";
            }
        }

        return "Ninguém é Gay!";
    }

    public static void showJava () {
        int i, j;
        String[][] java = new String[4][28];

        java[0][3] = "J";
        java[1][3] = "J";
        java[2][0] = "J";
        java[2][3] = "J";
        java[3][1] = "J";
        java[3][2] = "J";

        java[0][8] = "A";
        java[1][7] = "A";
        java[1][9] = "A";
        java[2][6] = "A";
        java[2][7] = "A";
        java[2][8] = "A";
        java[2][9] = "A";
        java[2][10] = "A";
        java[3][5] = "A";
        java[3][11] = "A";

        java[0][13] = "V";
        java[0][19] = "V";
        java[1][14] = "V";
        java[1][18] = "V";
        java[2][15] = "V";
        java[2][17] = "V";
        java[3][16] = "V";

        java[0][24] = "A";
        java[1][23] = "A";
        java[1][25] = "A";
        java[2][22] = "A";
        java[2][23] = "A";
        java[2][24] = "A";
        java[2][25] = "A";
        java[2][26] = "A";
        java[3][21] = "A";
        java[3][27] = "A";

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 28; j++) {
                if (java[i][j] == null) {
                    java[i][j] = " ";
                }
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 28; j++) {
                if (j == 0) {
                    System.out.println();
                }
                System.out.print(java[i][j] + " ");
            }
        }

        System.out.println();
    }

    public static String middleCharacter (String word) {
        String [] doubleChar = new String[2];
        String mainChar = String.valueOf(word.charAt(word.length() / 2));
        if (word.length() % 2 == 0) {
            doubleChar[0] = String.valueOf(word.charAt((word.length() / 2) - 1));
            doubleChar[1] = mainChar;
            return doubleChar[0] + doubleChar[1];
        } else  {
            return mainChar;
        }
    }

    public static int countVowels (String word) {
        int i, j, countVowels = 0;
        char[] vowelsLowCase = {'a', 'e', 'i', 'o', 'u'};
        char[] vowelsUpperCase = {'A', 'E', 'I', 'O', 'U'};
        for (i = 0; i < word.length(); i++) {
            for (j = 0; j < 5; j++) {
                if (word.charAt(i) == vowelsLowCase[j] || word.charAt(i) == vowelsUpperCase[j]) {
                    countVowels++;
                }
            }
        }
        return countVowels;
    }

    public static int countWords (String phrase) {
        int i, j, countWords = 0;
        for (i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == ' ') {
                countWords++;
            }
        }
        return countWords + 1;
    }

    public static int sumOfDigits(int n) {
        int i, result = 0, deposit;
        int digits = Methods.countDigits(n);

        for (i = 0; i < digits; i++) {
            deposit = n % 10;
            n = n / 10;
            result += deposit;
        }
        return result;
    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void passwordVerification() { // can use is_Letter and is_Numeric and toUpperCase
        int i, j;
        int countingDigits = 0, countingCharUp = 0, countingCharLow = 0, notValidCharacters = 0;
        String password;
        char[] lettersLowCase  = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] lettersUpperCase  = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] digits  = {'1', '2', '3', '4','5', '6', '7', '8', '9', '0'};

        Scanner sayToMe = new Scanner(System.in);
        System.out.println("1. A password must have at least ten characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits.");

        System.out.println("Input a password (You are agreeing to the above Terms and Conditions.): ");
        password = sayToMe.nextLine();

        for (i = 0; i < password.length(); i++) {
            for (j = 0; j < lettersUpperCase.length; j++) {
                if (password.charAt(i) == lettersUpperCase[j]) {
                    countingCharUp++;
                }
            }
        }

        for (i = 0; i < password.length(); i++) {
            for (j = 0; j < lettersLowCase.length; j++) {
                if (password.charAt(i) == lettersLowCase[j]) {
                    countingCharLow++;
                }
            }
        }

        for (i = 0; i < password.length(); i++) {
            for (j = 0; j < digits.length; j++) {
                if (password.charAt(i) == digits[j]) {
                    countingDigits++;
                }
            }
        }

        if (password.length() < 10 || countingDigits < 2 || notValidCharacters > 0) {
            System.out.println("Password is invalid!");
        } else {
            System.out.println("Password is valid: " + password);
            System.out.println("Number of digits: " + countingDigits);
            System.out.println("Number of Upper Case Letters: " + countingCharUp);
            System.out.println("Number of Lower Case Letters: " + countingCharLow);
        }


    }

    public static void twinPrimeNumbers() { // Resolver
        int i, j, countPrimes = 0;
        int[] numbers = new int[101];
        int[] primes = new int[101];

        for (i = 0; i < 101; i++) {
            numbers[i] = i;
        }
        for (i = 0; i < 101; i++) {
            if (Methods.isPrimeNumber(numbers[i]) == true) {
                primes[i] = numbers[i];
                countPrimes++;
            }
        }

        for (i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + " ");
        }

    }
}
public class Methods {

    public static int sumTwoNumbers(int a, int b) {
        int result;
        result = a + b;
        return result;
    }

    public static void message() {
        System.out.println("See You Later!");
    }

    public static void multiplicationTable (int n) {
        int i;
        for (i = 0; i <= 12; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static boolean isPrimeNumber (int n) {
        int counting = 0;
        if (n == 0 || n == 1) {return false;}
        if (n == 2 || n == 3 || n == 5) {
            counting = counting + 3;
        }
        if (counting != 3) {
            if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public static void fibonacci (int n) {
        int i, last = 1, beflast = 0;
        int[] numbers = new int[n];
        if (n > 1) {
            numbers[0] = 0;
            numbers[1] = 1;
            System.out.print(numbers[0] + " ");
            System.out.print(numbers[1] + " ");
        } else {System.out.println(0);}
        for (i = 2; i < numbers.length; i++) {
            numbers[i] = last + beflast;
            System.out.print(numbers[i] + " ");
            last = numbers[i];
            beflast =  numbers[i - 1];
        }
    }

    public static int countDigits (int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
         }
        return count;
    }

    public static int turnNumber (int n) {
        int i, j, newN = n, k = countDigits(n), deposit, finalNumber = 0;
        double secondDeposit;
        int[] reversedNumber = new int[countDigits(n)];
        for (i = 0; i < reversedNumber.length; i++) {
            deposit = newN % 10;
            newN = newN / 10;
            reversedNumber[i] = deposit;
        }
        for (j = 0; j < reversedNumber.length; j++) {
                secondDeposit = reversedNumber[j] * Math.pow(10, (k - 1));
                finalNumber = (int) (finalNumber + secondDeposit);
                k--;
        }

        return finalNumber;
    }

    public static boolean verifyPalindrome (int n) {
        int n2 = turnNumber(n);
        if (n == n2) {
            return true;
        } else {
            return false;
        }
    }

    public static int factorial (int n) {
        int i, finalNumber = n;
        if (n == 0 || n == 1) {
            return 1;
        }
        for (i = n; i > 2; i--) {
            finalNumber = finalNumber * (i - 1);
        }
        return finalNumber;
    }
}
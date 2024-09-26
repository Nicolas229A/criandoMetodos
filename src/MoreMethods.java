import java.util.Scanner;

public class MoreMethods {

    public static double temperature (int c, String conversion) {
        double f, k, re, ra;
        switch (conversion) {
            case "F":
                f = (c * 1.8) + 32;
                return f;
            case "K":
                k = c + 273.15;
                return k;
            case "Re":
                re = c * 0.8;
                return re;
            case "Ra":
                ra = (c * 1.8) + 32 + 459.67;
                return ra;
            default:
                System.out.println("You need to say what type of temperature you're trying to convert to!");
        }
        return c;
    }

    public static void tallestSmallestPerson () {
        int i, tol = 1, smol = 300, averageHeight, accumulatingHeight = 0, woman = 0, man = 0;
        int [] peopleHeight = new int[10];
        String [] peopleGender = new String[10];
        Scanner sayToMe = new Scanner(System.in);

        for (i = 0; i < peopleHeight.length; i++) {

            System.out.println("What's your height (cm)? And Gender (F/M)?");
            peopleHeight[i] = sayToMe.nextInt();
            peopleGender[i] = sayToMe.next();

        }

        for (i = 0; i < peopleHeight.length; i++) {
            if (peopleHeight[i] > tol) {
                tol = peopleHeight[i];
            }
            if (peopleHeight[i] < smol) {
                smol = peopleHeight[i];
            }
        }

        for (i = 0; i < peopleGender.length; i++) {
            if (peopleGender[i].equals("M")) {
                man++;
                accumulatingHeight = accumulatingHeight + peopleHeight[i];
            } else {
                woman++;
            }
        }

        averageHeight = accumulatingHeight / man;

        System.out.println("The tallest height is: " + tol);
        System.out.println("The smallest height is: " + smol);
        System.out.println("The average male height is: " + averageHeight);
        System.out.println("The number of woman is: " + woman);


    }

    public static double tranformIntoPercentage (int n1, int n2) {
        double percentage;
        percentage = ((double) n1 / n2) * 100;
        return percentage;
    }

    public static double averageSalary (int workers) {
        int i;
        double average, sumOfTheSalary = 0, theSalary;
        int [] salaryOfTheWorkers = new int [workers];
        Scanner sayToMe = new Scanner(System.in);

        for (i = 0; i < salaryOfTheWorkers.length; i++) {
            System.out.println("How much money you make per month worker number " + (i + 1) + "? ");
            theSalary = sayToMe.nextDouble();
            sumOfTheSalary = sumOfTheSalary + theSalary;
        }

        average = sumOfTheSalary / workers;

        return average;
    }

    public static double volumeOfACan (double radius, double height) {
        double volume;

        volume = 3.14159 * radius * radius * height;

        return volume;
    }

    public static int howManyHorses (double massKg, double heightMeters, int timeSeconds) {
        int horses;

        horses = (int) ((massKg * heightMeters / timeSeconds) / 745.6999);

        return horses;
    }
}

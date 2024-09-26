public class MethodsNewList {
    public static int[] searchElement(int[] intPositiveArray, int x) {
        int i, j, count = 0;

        for (i = 0; i < intPositiveArray.length; i++) {
            if (intPositiveArray[i] == x) {
                count++;
            }
        }

        int[] indexesOfX = new int[count];

        j = 0;
        for (i = 0; i < intPositiveArray.length; i++) {
            if (intPositiveArray[i] == x) {
                indexesOfX[j] = i;
                j++;
            }
        }

        return indexesOfX;
    }

    public static boolean verifyElement (int[] intPositiveArray, int x) {
        int i;
        boolean found = false;

        for (i = 0; i < intPositiveArray.length; i++) {
            if (intPositiveArray[i] == x) {
                found = true;
            }
        }
        return found;
    }
}

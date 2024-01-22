import java.util.Arrays;
import java.util.Random;

public class LotteryProg {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array1 = new int[7];
        for (int index = 0; index < array1.length; index++) {
            array1[index] = random.nextInt(10);
        }
        Arrays.sort(array1);


        int[] array2 = new int[7];
        for (int index = 0; index < array2.length; index++) {
            array2[index] = random.nextInt(10);
        }
        Arrays.sort(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));


        int matches = countArrayMatches(array1, array2);
        System.out.println("Кількість збігів: " + matches);

    }

    private static int countArrayMatches(int[] array1, int[] array2) {
        int matches = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                matches++;
            }
        }

        return matches;
    }
}

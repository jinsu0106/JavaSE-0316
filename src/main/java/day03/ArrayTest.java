package day03;

public class ArrayTest {


    public static void main(String[] args) {
        int[] ints = null;

        System.out.println(ints);

        String[] strings = new String[10];

        double[] doubles = {1, 2, 3, 4};

//        System.out.println(ints.length);

        System.out.println(strings.length);

        System.out.println(doubles[2]);

        for (int i = 0; i < 4; i++) {
            System.out.println(doubles[i]);
        }

        for (int i = 0; i < doubles.length; i++) {
            // ...
        }

        for (double aDouble : doubles) {
            // ...
        }

        int[][] ints1 = new int[3][5];

        System.out.println(ints1[2][4]);

        for (int i = 0; i < ints1.length; i++) {
            for (int j = 0; j < ints1[i].length; j++) {
                ints1[i][j] = i + j;
            }
        }

        double[][] doubles1 = {
                {0},
                {1, 2},
                {1, 2, 3}
        };
    }
}

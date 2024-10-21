import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task 1
        int[] integer = new int[]{1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        char[] chars = {'a', 'b', 'c', 100};

        System.out.println("task 2");
        for (int i = 0; i < integer.length; i++) {
            if (i != integer.length - 1) {
                System.out.print(integer[i] + ", ");
            } else {
                System.out.println(integer[i]);
            }
        }

        for (int i = 0; i < doubles.length; i++) {
            if (i == doubles.length - 1) {
                System.out.println(doubles[i]);
                break;
            }
            System.out.print(doubles[i] + ", ");
        }

        int lossElem = chars.length - 1;
        for (int i = 0; i < lossElem; i++) {
            System.out.print(chars[i] + ", ");
        }
        System.out.println(chars[lossElem]);

        System.out.println("task 3");
        lossElem = integer.length - 1;
        for (int i = lossElem; i >= 0; i--) {
            if (i != 0) {
                System.out.print(integer[i] + ", ");
            } else {
                System.out.println(integer[i]);
            }
        }

        lossElem = doubles.length - 1;
        for (int i = lossElem; i >= 0; i--) {
            if (i != 0) {
                System.out.print(doubles[i] + ", ");
            } else {
                System.out.println(doubles[i]);
            }
        }

        lossElem = chars.length - 1;
        for (int i = lossElem; i > 0; i--) {
            System.out.print(chars[i] + ", ");
        }
        System.out.println(chars[0]);

        System.out.println("task 4");
        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 2 != 0) {
                integer[i] += 1;
            }
        }
        System.out.println(Arrays.toString(integer));

    }
}
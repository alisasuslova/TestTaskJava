import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int lowBorder = 1;
        int upBorder = 299;
        int count = (int) (Math.random() * (1000 - 1));

        int[] arr = createArray(count, lowBorder, upBorder);
        System.out.println(Arrays.toString(arr));

        int stringLength = convertToString(arr);
        int stringLengthASCII = convertToASCII(arr);

        compressionRatio(stringLength, stringLengthASCII);
    }

    public static int[] createArray(int count, int lowBorder, int upBorder) {
        return IntStream
                .generate(() -> lowBorder + new Random().nextInt(upBorder - lowBorder + 1))
                .limit(count)
                .toArray();
    }

    public static int convertToString(int[] arr) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.
                    append(arr[i]);
        }
        return sb.length();
    }

    public static int convertToASCII(int[] arr) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            char ch = (char) arr[i];
            sb.append(ch);
        }
        return sb.length();
    }

    public static double compressionRatio(int stringLength, int stringLengthASCII) {

        double result = ((double) stringLengthASCII / (double) stringLength) * 100;
        System.out.println("исходная строка " + stringLength + " символов");
        System.out.println("сжатая строка " + stringLengthASCII + " символов");
        System.out.println("коэффициент сжатия " + result + "%");
        return result;
    }
}

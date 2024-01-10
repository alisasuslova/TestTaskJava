import org.testng.annotations.Test;

public class MainTest extends Main {

    @Test
    public void compressionRatio50() {
        int stringLength = convertToString(createArray((int) (Math.random() * (1000 - 1)), 1, 50));
        int stringLengthASCII = convertToASCII(createArray((int) (Math.random() * (1000 - 1)), 1, 50));
        compressionRatio(stringLength, stringLengthASCII);
    }

    @Test
    public void compressionRatio100() {
        int stringLength = convertToString(createArray((int) (Math.random() * (1000 - 1)), 1, 100));
        int stringLengthASCII = convertToASCII(createArray((int) (Math.random() * (1000 - 1)), 1, 100));
        compressionRatio(stringLength, stringLengthASCII);
    }

    @Test
    public void compressionRatio500() {
        int stringLength = convertToString(createArray((int) (Math.random() * (1000 - 1)), 1, 500));
        int stringLengthASCII = convertToASCII(createArray((int) (Math.random() * (1000 - 1)), 1, 500));
        compressionRatio(stringLength, stringLengthASCII);
    }

    @Test
    public void compressionRatio1000() {
        int stringLength = convertToString(createArray((int) (Math.random() * (1000 - 1)), 1, 1000));
        int stringLengthASCII = convertToASCII(createArray((int) (Math.random() * (1000 - 1)), 1, 1000));
        compressionRatio(stringLength, stringLengthASCII);
    }

    @Test
    public void compressionRatioZ1() {
        int stringLength = convertToString(createArray((int) (Math.random() * (1000 - 1)), 0, 9));
        int stringLengthASCII = convertToASCII(createArray((int) (Math.random() * (1000 - 1)), 0, 9));
        compressionRatio(stringLength, stringLengthASCII);
    }

    @Test
    public void compressionRatioZ2() {
        int stringLength = convertToString(createArray((int) (Math.random() * (1000 - 1)), 10, 99));
        int stringLengthASCII = convertToASCII(createArray((int) (Math.random() * (1000 - 1)), 10, 99));
        compressionRatio(stringLength, stringLengthASCII);
    }

    @Test
    public void compressionRatioZ3() {
        int stringLength = convertToString(createArray((int) (Math.random() * (1000 - 1)), 100, 999));
        int stringLengthASCII = convertToASCII(createArray((int) (Math.random() * (1000 - 1)), 100, 999));
        compressionRatio(stringLength, stringLengthASCII);
    }

    @Test
    public void compressionRatioLast900() {
        int stringLength = convertToString(createArray(900, 100, 999));
        int stringLengthASCII = convertToASCII(createArray(900, 100, 999));
        compressionRatio(stringLength, stringLengthASCII);
    }
}
public class PositiveNegativeZero {
    public static void checkNumber(int number) {
        String result = "zero";
        if (number > 0) {
            result = "positive";
        }
        
        if (number < 0) {
            result = "negative";
        }
        System.out.print(result);
    }
}

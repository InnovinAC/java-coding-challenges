public class MegaBytesConverter {
   public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        String output = "Invalid Value";
        if (kiloBytes >= 0) {
            int remainder = kiloBytes % 1024;
            int quotient = (int) Math.floor(kiloBytes/1024);
            output = kiloBytes + " KB = " + quotient + " MB and " + remainder + " KB";

        }
        System.out.print(output);
    }
}

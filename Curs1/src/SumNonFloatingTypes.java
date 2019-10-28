public class SumNonFloatingTypes {
    public static void main(String[] args) {
        sumBytes();
        sumShort();
        sumInt();
    }

    private static void sumInt() {
        int x = 5;
        int y = 10;
        int sum = x + y;
        System.out.println(sum);
    }

    private static void sumShort() {
        short x = 5;
        short y = 10;
        short sum = (short) (x + y);
        System.out.println(sum);
    }

    private static void sumBytes() {
        byte x = 5;
        byte y = 10;
        byte sum = (byte) (x + y);
        System.out.println(sum);
    }
}

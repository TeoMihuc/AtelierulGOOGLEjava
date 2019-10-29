public class PostfixIncrement {
    public static void main(String[] args) {
        int x=0;
        while(x++<10){

        }
        checkForXValue(x);
    }
    public static void checkForXValue(int x){
        int expected = 11;
        System.out.println("expected="+expected+" actual=" + x);
    }
}

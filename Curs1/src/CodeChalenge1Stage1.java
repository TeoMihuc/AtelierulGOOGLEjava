public class CodeChalenge1Stage1 {

    public static void main(String []args){

        String a= "FizzBuzz";
        String b="Fizz";
        String c="Buzz";

        for(int number=1;number<=100;number++) {

            if (!((number % 5 == 0) || (number % 3 == 0) )) {
                System.out.println(number);
            } else
                System.out.println(number % 3 == 0 ? number % 5 == 0 ? a : b : c);
        }
    }
}

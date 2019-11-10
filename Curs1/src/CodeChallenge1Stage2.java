public class CodeChallenge1Stage2 {

    public static void main(String[] args) {

        String a = "FizzBuzz";
        String b = "Fizz";
        String c = "Buzz";
        String d = "Rizz";
        String e = "Jazz";

        for (int number = 1; number <= 100; number++) {

            if(!((number%5==0) || (number%3==0) || (number%7==0) || (number%9==0))){
                System.out.println(number);
            }else if(number%7==0 || number%9==0){
                System.out.println(number%7==0?number%9==0? String.valueOf(number) :d:e);
            }else
                System.out.println(number%3==0?number%5==0?a:b:c);
        }
    }
}

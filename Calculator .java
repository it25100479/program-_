public class Calculator {
    public static void main(String[] args) {

        int answer1 =0;

        answer1 = square(add(multiply(3,4),multiply(5,7)));
        System.out.println(answer1);

        int  answer2 = 0;

        answer2 = add(square(add(4,7)),square(add(8,3)));
        System.out.println(answer2);
    }

    public static int add (int a , int b ){
        return a+b;
    }
    public static int multiply (int a , int b){
        return a*b;
    }
    public static int square (int a){
        return a*a;
    }
}
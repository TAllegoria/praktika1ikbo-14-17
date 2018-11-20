import java.util.Scanner;

public class sumOfDigits {

    static int output = 0;

    public static int calculate(int number){
        output += number % 10;
        number /= 10;
        if (number > 0) calculate(number);
                else return output;
        return output;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("A number to calculate its sum of digits: ");
        int num = in.nextInt();
        System.out.println(calculate(num));
    }
}

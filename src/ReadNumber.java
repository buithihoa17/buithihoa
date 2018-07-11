import java.util.Scanner;
public class ReadNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number need read: ");
        int n = sc.nextInt();

        if (n >= 1000 || n < 0) {
            System.out.println("out of ability");
        } else if (n <= 20) {
            System.out.println(numberLessThan20(n));
        } else if (n < 100) {
            if (n % 10 == 0) {
                System.out.println(numberFrom21to99(n / 10));
            } else {
                System.out.println(numberFrom21to99(n / 10) + " " + numberLessThan20(n % 10));
            }
        } else {
            System.out.print(numberGreaterThan99(n / 100) + " ");
            n = n % 100;
            System.out.print(numberFrom21to99(n / 10) + " " + numberLessThan20(n % 10));
        }
    }

    public static String numberLessThan20(int n) {
        String read = "";
        switch (n) {
            case 0:
                read = "zero";
                break;
            case 1:
                read = "one";
                break;
            case 2:
                read = "two";
                break;
            case 3:
                read = "three";
                break;
            case 4:
                read = "four";
                break;
            case 6:
                read = "six";
                break;
            case 7:
                read = "seven";
                break;
            case 8:
                read = "eight";
                break;
            case 9:
                read = "nine";
                break;
            case 10:
                read = "ren";
                break;
            case 11:
                read = "eleven";
                break;
            case 12:
                read = "twelve";
                break;
            case 13:
                read = "thirteen";
                break;
            case 14:
                read = "fourteen";
                break;
            case 15:
                read = "fifteen";
                break;
            case 16:
                read = "sixteen";
                break;
            case 17:
                read = "seventeen";
                break;
            case 18:
                read = "eighteen";
                break;
            case 19:
                read = "nineteen";
                break;
            case 20:
                read = "twenty";
                break;
        }
        return read;
    }

    public static String numberFrom21to99(int n) {
        String read = "";
        switch (n) {
            case 2:
                read = "twenty";
                break;
            case 3:
                read = "thirty";
                break;
            case 4:
                read = "forty";
                break;
            case 5:
                read = "fifty";
                break;
            case 6:
                read = "sixty";
                break;
            case 7:
                read = "seventy";
                break;
            case 8:
                read = "eighty";
                break;
            case 9:
                read = "ninety";
                break;
        }
        return read;
    }

    public static String numberGreaterThan99(int n) {
        String read = "";
        switch (n) {
            case 1:
                read = " one hundred";
                break;
            case 2:
                read = "two hundred";
                break;
            case 3:
                read = "three hundred";
                break;
            case 4:
                read = "four hundred";
                break;
            case 5:
                read = "five hundred";
                break;
            case 6:
                read = "six hundred";
                break;
            case 7:
                read = "seven hundred";
                break;
            case 8:
                read = "eight hundred";
                break;
            case 9:
                read = "nine hunderd";
                break;
        }
        return read;
    }
}

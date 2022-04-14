import java.util.regex.*;
import java.util.Scanner;

public class Questions {
    public static Scanner scanner = new Scanner(System.in);
    public static int repeat = 0;

    public static void question01() {

        System.out.println("                   Question 01 - Starts with aa: ");
        System.out.print("Enter the number of times you want to test the Regular Expressions: ");
        String expressionRule01 = "a{2}+[a-c]*";
        repeat = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < repeat; i++) {
            System.out.print("Enter the " + (i + 1) + "° expression you want to test: ");
            String expression01 = scanner.nextLine();
            validator(expressionRule01, expression01);
        }

    }

    public static void question02() {

        System.out.println(" Question 02 - It doesn't start with aa: ");
        System.out.print("Enter the number of times you want to test the Regular Expressions: ");
        String expressionRule02 = "c*b*a{1}+[a-c]*";
        repeat = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < repeat; i++) {
            System.out.print("Enter the " + (i + 1) + "° expression you want to test: ");
            String expression02 = scanner.nextLine();
            validator(expressionRule02, expression02);
        }

    }

    public static void question03() {

        System.out.println(" Question 03 - Ends with bbb: ");
        System.out.print("Enter the number of times you want to test the Regular Expressions: ");
        String expressionRule03 = "[a-c]*+[b][b][b]+[a-c]*";
        repeat = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < repeat; i++) {
            System.out.print("Enter the " + (i + 1) + "° expression you want to test: ");
            String expression03 = scanner.nextLine();
            validator(expressionRule03, expression03);
        }
    }

    public static void question04() {

        System.out.println(" Question 04 - It doesn't end with bbb: ");
        System.out.print("Enter the number of times you want to test the Regular Expressions: ");
        String expressionRule04 = "c*a*+b{2}+[a-c]*";
        repeat = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < repeat; i++) {
            System.out.print("Enter the " + (i + 1) + "° expression you want to test: ");
            String expression04 = scanner.nextLine();
            validator(expressionRule04, expression04);
        }
    }

    public static void question05() {

        System.out.println(" Question 05 - Contains the substring aabbb: ");
        System.out.print("Enter the number of times you want to test the Regular Expressions: ");
        String expressionRule05 = "[a-c]*a{2}+b{3}+[a-c]*";
        repeat = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < repeat; i++) {
            System.out.print("Enter the " + (i + 1) + "° expression you want to test: ");
            String expression05 = scanner.nextLine();
            validator(expressionRule05, expression05);
        }
    }

    public static void question06() {

        System.out.println(" Question 06 - Have a length greater than or equal to 3: ");
        System.out.print("Enter the number of times you want to test the Regular Expressions: ");
        String expressionRule06 = "[a-c]{3}+[a-c]*";
        repeat = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < repeat; i++) {
            System.out.print("Enter the " + (i + 1) + "° expression you want to test: ");
            String expression06 = scanner.nextLine();
            validator(expressionRule06, expression06);
        }
    }

    public static void question07() {

        System.out.println(" Question 07 - Have a length less than or equal to 3: ");
        System.out.print("Enter the number of times you want to test the Regular Expressions: ");
        String expressionRule07 = "[a-c]{1,3}";
        repeat = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < repeat; i++) {
            System.out.print("Enter the " + (i + 1) + "° expression you want to test: ");
            String expression07 = scanner.nextLine();
            validator(expressionRule07, expression07);
        }
    }

    public static void question08() {

        System.out.println(" Question 08 -  Have a length different from 3: ");
        System.out.print("Enter the number of times you want to test the Regular Expressions: ");
        String expressionRule08 = "[a-c]{1,2}|[a-c]{4}+(a|c)*";
        repeat = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < repeat; i++) {
            System.out.print("Enter the " + (i + 1) + "° expression you want to test: ");
            String expression08 = scanner.nextLine();
            validator(expressionRule08, expression08);
        }
    }

    public static void question09() {

        System.out.println(" Question 09 -  Have even length: ");
        System.out.print("Enter the number of times you want to test the Regular Expressions: ");
        String expressionRule09 = "[a-c]{2}|[a-c]{4}|[a-c]{6}|[a-c]{8}|[a-c]{10}|[a-c]{12}|[a-c]{14}|[a-c]{16}|[a-c]{18}|[a-c]{20}";
        repeat = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < repeat; i++) {
            System.out.print("Enter the " + (i + 1) + "° expression you want to test: ");
            String expression09 = scanner.nextLine();
            validator(expressionRule09, expression09);
        }
    }

    public static void question10() {

        System.out.println(" Question 10 -  Have odd length: ");
        System.out.print("Enter the number of times you want to test the Regular Expressions: ");
        String expressionRule10 = "[a-c]{1}|[a-c]{3}|[a-c]{5}|[a-c]{7}|[a-c]{9}|[a-c]{11}|[a-c]{13}|[a-c]{15}|[a-c]{17}|[a-c]{19}";
        repeat = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < repeat; i++) {
            System.out.print("Enter the " + (i + 1) + "° expression you want to test: ");
            String expression10 = scanner.nextLine();
            validator(expressionRule10, expression10);
        }
    }

    public static void question11() {

        System.out.println(" Question 11 -  Has a length multiple of 4: ");
        System.out.print("Enter the number of times you want to test the Regular Expressions: ");
        String expressionRule11 = "[a-c]{4}|[a-c]{8}|[a-c]{12}|[a-c]{16}|[a-c]{20}|[a-c]{24}|[a-c]{32}|[a-c]{36}|[a-c]{40}|[a-c]{44}";
        repeat = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < repeat; i++) {
            System.out.print("Enter the " + (i + 1) + "° expression you want to test: ");
            String expression11 = scanner.nextLine();
            validator(expressionRule11, expression11);
        }
    }

    public static void question12() {

        System.out.println(" Question 12 -  Have an even number of 'a' symbols: ");
        System.out.print("Enter the number of times you want to test the Regular Expressions: ");
        String expressionRule12 = "b*c*[a]{2}b*c*|b*c*[a]{4}b*c*|b*c*[a]{6}b*c*|b*c*[a]{8}b*c*|b*c*[a]{10}b*c*|b*c*[a]{12}b*c*|b*c*[a]{14}b*c*|b*c*[a]{16}b*c*|b*c*[a]{18}b*c*|b*c*[a]{20}b*c*";
        repeat = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < repeat; i++) {
            System.out.print("Enter the " + (i + 1) + "° expression you want to test: ");
            String expression12 = scanner.nextLine();
            validator(expressionRule12, expression12);
        }
    }

    public static void question13() {

        System.out.println(" Question 13 -  Have an odd number of 'b' symbols: ");
        System.out.print("Enter the number of times you want to test the Regular Expressions: ");
        String expressionRule13 = "a*c*[b]{1}a*c*|a*c*[b]{3}a*c*|a*c*[b]{5}a*c*|a*c*[b]{7}a*c*|a*c*[b]{9}a*c*|a*c*[b]{11}a*c*|a*c*[b]{13}a*c*|a*c*[b]{15}a*c*|a*c*[b]{17}a*c*|a*c*[b]{19}a*c*";
        repeat = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < repeat; i++) {
            System.out.print("Enter the " + (i + 1) + "° expression you want to test: ");
            String expression13 = scanner.nextLine();
            validator(expressionRule13, expression13);
        }
    }

    public static void validator(String expressionRule, String expression) {
        Pattern pattern = Pattern.compile(expressionRule);
        Matcher matcher = pattern.matcher(expression);
        if (matcher.matches()) {
            System.out.println("{Expression Valid}");
        } else {
            System.out.println("{Expression Invalid}");
        }
    }
}

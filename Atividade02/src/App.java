import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        byte option = 0;
        System.out.println(
                "======================== \nSubject: Formal Languages  \nProfessor: Iago Richard \nStudent: Vinícius Ventura \nEnrollment: 2021108015 \n========================\n");
        menu();
        do {
            System.out.println("\n\t=== ATTENTION!! ===");
            System.out.print("Choose an option from the menu above: ");
            option = scanner.nextByte();
            switch (option) {
                case 0:
                    System.out.println("Thank you teacher!");
                    break;
                case 1:
                    System.out.println();
                    Questions.question01();
                    break;
                case 2:
                    System.out.println();
                    Questions.question02();
                    break;
                case 3:
                    System.out.println();
                    Questions.question03();
                    break;
                case 4:
                    System.out.println();
                    Questions.question04();
                    break;
                case 5:
                    System.out.println();
                    Questions.question05();
                    break;
                case 6:
                    System.out.println();
                    Questions.question06();
                    break;
                case 7:
                    System.out.println();
                    Questions.question07();
                    break;
                case 8:
                    System.out.println();
                    Questions.question08();
                    break;
                case 9:
                    System.out.println();
                    Questions.question09();
                    break;
                case 10:
                    System.out.println();
                    Questions.question10();
                    break;
                case 11:
                    System.out.println();
                    Questions.question11();
                    break;
                case 12:
                    System.out.println();
                    Questions.question12();
                    break;
                case 13:
                    System.out.println();
                    Questions.question13();
                    break;
                case 14:
                    System.out.println();
                    expressions();
                    break;
                default:
                    System.out.println("Select a valid option.");
                    break;
            }
        } while (option != 0);
        scanner.close();
    }

    public static void menu() {
        System.out.println("Menu - Evaluative Activity 2.2\n");
        System.out.println(
                " 1 - Test Question 01; \n 2 - Test Question 02; \n 3 - Test Question 03; \n 4 - Test Question 04; \n 5 - Test Question 05; \n 6 - Test Question 06; "
                        + "\n 7 - Test Question 07; \n 8 - Test Question 08; \n 9 - Test Question 09; \n10 - Test Question 10; \n11 - Test Question 11; \n12 - Test Question 12; \n13 - Test Question 13.");
        System.out.println("14 - See expression rules;");
        System.out.println("\n0 - Close Vinicius' activity.");
    }

    public static void expressions() {
        String expressionRule01 = "a{2}+[a-c]*";
        String expressionRule02 = "c*b*a{1}+[a-c]*";
        String expressionRule03 = "[a-c]*+[b][b][b]+[a-c]*";
        String expressionRule04 = "c*a*+b{2}+[a-c]*";
        String expressionRule05 = "[a-c]*a{2}+b{3}+[a-c]*";
        String expressionRule06 = "[a-c]{3}+[a-c]*";
        String expressionRule07 = "[a-c]{1,3}";
        String expressionRule08 = "[a-c]{1,2}|[a-c]{4}+(a|c)*";
        String expressionRule09 = "[a-c]{2}|[a-c]{4}|[a-c]{6}|[a-c]{8}|[a-c]{10}|[a-c]{12}|[a-c]{14}|[a-c]{16}|[a-c]{18}|[a-c]{20}";
        String expressionRule10 = "[a-c]{1}|[a-c]{3}|[a-c]{5}|[a-c]{7}|[a-c]{9}|[a-c]{11}|[a-c]{13}|[a-c]{15}|[a-c]{17}|[a-c]{19}";
        String expressionRule11 = "[a-c]{4}|[a-c]{8}|[a-c]{12}|[a-c]{16}|[a-c]{20}|[a-c]{24}|[a-c]{32}|[a-c]{36}|[a-c]{40}|[a-c]{44}";
        String expressionRule12 = "b*c*[a]{2}b*c*|b*c*[a]{4}b*c*|b*c*[a]{6}b*c*|b*c*[a]{8}b*c*|b*c*[a]{10}b*c*|b*c*[a]{12}b*c*|b*c*[a]{14}b*c*|b*c*[a]{16}b*c*|b*c*[a]{18}b*c*|b*c*[a]{20}b*c*";
        String expressionRule13 = "a*c*[b]{1}a*c*|a*c*[b]{3}a*c*|a*c*[b]{5}a*c*|a*c*[b]{7}a*c*|a*c*[b]{9}a*c*|a*c*[b]{11}a*c*|a*c*[b]{13}a*c*|a*c*[b]{15}a*c*|a*c*[b]{17}a*c*|a*c*[b]{19}a*c*";

        System.out.println("Expressions in Question Order: ");
        System.out.println("01- " + expressionRule01 + "\n" + "02- " + expressionRule02 + "\n" + "03- "
                + expressionRule03 + "\n" + "04- " + expressionRule04 + "\n" + "05- " +
                expressionRule05 + "\n" + "06- " + expressionRule06 + "\n" + "07- " + expressionRule07 + "\n" + "08- "
                + expressionRule08 + "\n" + "09- " + expressionRule09 + "\n" + "10- "
                + expressionRule10 + "\n" + "11- " + expressionRule11 + "\n" + "12- " + expressionRule12 + "\n" + "13- "
                + expressionRule13 + "\n");
    }
}

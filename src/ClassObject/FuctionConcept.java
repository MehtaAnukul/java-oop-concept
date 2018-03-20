package ClassObject;

import java.util.Scanner;

class FuctionConcept {

    private int a;
    private int b;
    private Scanner readValue;

    FuctionConcept() {
        readValue = new Scanner(System.in);
        choice();
    }

    private void displayAnswer(String funName, int answer) {
        System.out.println("Anser of " + funName + " : " + answer);
        choice();
    }

    private void choice() {
        System.out.println("CHOICE HERE");
        System.out.println("1. SUM");
        System.out.println("2. MUL");
        System.out.println("3. DIV");
        System.out.println("4. SUB");
        System.out.println("5. EXIT");

        System.out.println("Enter Your Choice");
        final int choiceNum = readValue.nextInt();

        switch (choiceNum) {

            case 1:
                displayAnswer("SUM", add());
                break;
            case 2:
                displayAnswer("MUL", mul());
                break;
            case 3:
                displayAnswer("DIV", div());
                break;
            case 4:
                displayAnswer("SUB", sub());
                sub();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Number is not choice");
                break;
        }
    }

    private void getValue() {
        //read first number
        System.out.println("Enter Your First Number");
        a = readValue.nextInt();
        //read second number
        System.out.println("Enter Your Second Number");
        b = readValue.nextInt();
    }

    private int add() {
        getValue();
        return a + b;
    }

    private int mul() {
        getValue();
        return a * b;
    }

    private int div() {
        getValue();
        return a / b;
    }

    private int sub() {
        getValue();
        return a - b;
    }
}

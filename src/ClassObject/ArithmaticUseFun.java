package ClassObject;

import java.util.Scanner;

/**
 * Created by Anukul-PC on 18-03-2018.
 */
class ArithmaticUseFun {


    float result;
    float a = 3.14f;
    int add, sub, mul, div;

    Scanner s = new Scanner(System.in);

    void add(int a, int b) {
        result = a + b;
        System.out.println("\nAddition:" + result);
    }

    void sub(int a, int b) {
        result = a - b;
        System.out.println("\nSubtraction:" + result);
    }

    void mul(int a, int b) {
        result = a * b;
        System.out.println("\nMultipliction:" + result);
    }

    void div(int a, int b) {
        result = a / b;
        System.out.println("\nModulo division:" + result);
    }

    void mod(int a, int b) {
        result = a % b;
        System.out.println("\nModulo division:" + result);
    }

    void init() {

        int a, b, n;

        System.out.println("Enter the value of a:");
        a = s.nextInt();
        System.out.println("Enter the value of b:");
        b = s.nextInt();

        System.out.println("");
        System.out.println("1.sum");
        System.out.println("2.sub");
        System.out.println("3.mul");
        System.out.println("4.div");
        System.out.println("5.mod");

        System.out.println("Enter your choice");
        n = s.nextInt();

        switch (n) {
            case 1:
                add(a, b);
                break;
            case 2:
                sub(a, b);
                break;
            case 3:
                mul(a, b);
                break;
            case 4:
                div(a, b);
                break;
            case 5:
                mod(a, b);
                break;

        }
    }


}


package ClassObject;

import java.util.Scanner;

import static ClassObject.VariableConcept.a;

/**
 * Created by Anukul-PC on 30-03-2018.
 */
public class SortingArrEleUseFun {

    public Scanner scanArrayElements;

    SortingArrEleUseFun() {
        scanArrayElements = new Scanner(System.in);
        choice();
        //getvalue();
    }

    public void choice() {
        System.out.println("choice Hare");
        System.out.println("1. Ascending");
        System.out.println("2. Desending");
        System.out.println("3. EXIT");

        System.out.println("Enter Your Choice");
        final int choiceNum = scanArrayElements.nextInt();

        switch (choiceNum) {
            case 1:
                asending();
                break;
            case 2:
                desending();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Number is not choice");
                break;

        }

    }


    int[] getvalue() {
        int arraySize;
//      get the size of array
        System.out.println("Enter the size of array");
        arraySize = scanArrayElements.nextInt();
        int a[] = new int[arraySize];

//      insert value in the array
        System.out.println("Enter the " + arraySize + " elements");
        for (int i = 0; i < arraySize; i++) {
            a[i] = scanArrayElements.nextInt();
        }
//        scanArrayElements.close();
        return a;
    }

    public void asending() {

        int sortArray[] = getvalue();
        int tempNum;
        //arrage elemeant in ascending order
        for (int i = 0; i < sortArray.length; i++) {
            for (int j = i + 1; j < sortArray.length; j++) {
                if (sortArray[i] > sortArray[j]) {
                    tempNum = sortArray[i];
                    sortArray[i] = sortArray[j];
                    sortArray[j] = tempNum;
                }
            }
        }
        display(sortArray);
    }

    private void display(int[] sortArray) {
        System.out.println("Array elemant in your order");
        for (int i = 0; i < sortArray.length; i++) {
            System.out.println(sortArray[i]);
        }
    }

    public void desending() {
        int sortArray[] = getvalue();
        int tempNum;
//      arrage elemeant in ascending order
        for (int i = 0; i < sortArray.length; i++) {
            for (int j = i + 1; j < sortArray.length; j++) {
                if (sortArray[i] < sortArray[j]) {
                    tempNum = sortArray[i];
                    sortArray[i] = sortArray[j];
                    sortArray[j] = tempNum;
                }
            }
        }
        display(sortArray);
    }


}
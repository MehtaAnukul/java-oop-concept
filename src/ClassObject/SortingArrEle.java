package ClassObject;

import java.util.Scanner;

/**
 * Created by Anukul-PC on 30-03-2018.
 */
public class SortingArrEle {
    public static void main(String[] args) {
//        initialization
        int arraySize;
        int tempNum;

//        get the size of array
        Scanner scanArrayElements= new Scanner(System.in);
        System.out.println("Enter the size of array");
        arraySize = scanArrayElements.nextInt();
        int a[] = new int[arraySize];

//        insert value in the array
        System.out.println("Enter the "+arraySize+" elements");
        for(int i=0;i<arraySize;i++){
          a[i] = scanArrayElements.nextInt();
        }

//        arrage elemeant in ascending order
        for(int i=0;i<arraySize;i++) {
            for (int j = i + 1; j < arraySize; j++) {
                if (a[i] > a[j]) {
                    tempNum = a[i];
                    a[i] = a[j];
                    a[j] = tempNum;
                }

            }
        }
        System.out.println("Array elemant in asscending order");
        for(int i=0;i<arraySize;i++){
            System.out.println(a[i]);
        }
    }
}

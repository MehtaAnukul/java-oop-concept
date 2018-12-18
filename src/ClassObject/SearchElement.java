package ClassObject;

import java.util.Scanner;

/**
 * Created by Anukul-PC on 30-03-2018.
 */
public class SearchElement {
    public static void main(String[] args) {

        int arraysize,tosearch,flag=0,i;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        arraysize = s.nextInt();
        int a[] = new int[arraysize];

        System.out.println("Enter the "+arraysize+" elemeant:");
        for(i=0;i<arraysize;i++){
            a[i] = s.nextInt();
        }

        System.out.println("Enter the element to search:");
        tosearch = s.nextInt();

        for(i=0;i<arraysize;i++){
            if(a[i] == tosearch){
                flag = 1;
                break;
            }
            else{
                flag = 0;
            }
        }
        if(flag == 1){
            System.out.println("Elemeant found in position:"+(i+1));
        }
        else{
            System.out.println("Elemenat not found");
        }

    }
}

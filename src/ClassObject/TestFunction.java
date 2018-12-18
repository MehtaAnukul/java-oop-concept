package ClassObject;

/**
 * Created by Anukul-PC on 30-03-2018.
 */
public class TestFunction {


    public void init() {
        int a[] = new int[4];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        sorting(a);
    }


    public void sorting(int aaray[]) {

        for (int i = 0; i < aaray.length; i++) {
            System.out.println(aaray[i]);
        }
    }


    public static void main(String[] args) {
        TestFunction testFunction = new TestFunction();


        testFunction.init();
    }

}

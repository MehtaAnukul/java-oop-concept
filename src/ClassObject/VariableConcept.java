package ClassObject;

/**
 * Created by Anukul-PC on 20-03-2018.
 */
public class VariableConcept {

    //class variable and Instane variable
    String connection;
    static String APP_NAME = "HELLLO APP";

    static int a = 10;
    int b = 10;


    void counterA() {
        a = a + 10;
        System.out.println("A VALUES " + a);
    }

    void counterB() {
        b = b + 10;
        System.out.println("B VALUES " + b);
    }

    //
//    void firstMethod() {
//        System.out.println(AppConstance.APP_VERSION);
//        connection = "firstConnection";
//    }
//
//    void secondMethod() {
//        connection = "SecondConnection";
//
//    }


}

package ClassObject;

import javax.jws.soap.SOAPBinding;

/**
 * Created by Anukul-PC on 20-03-2018.
 */
public class RunStringConcept {
    public static void main(String[] args) {


        StringConcept stringConcept = new StringConcept();
        System.out.println(stringConcept.length("Anukul"));
        System.out.println(stringConcept.toLowerCase("ANUKUL"));
        System.out.println(stringConcept.UpperCase("anukul"));
        System.out.println(stringConcept.reverse("anukul"));
        System.out.println(stringConcept.substring("hello how are you ", 2, 5));
        System.out.println(stringConcept.substring("hello how are you ", 1));
        stringConcept.dis();

    }
}

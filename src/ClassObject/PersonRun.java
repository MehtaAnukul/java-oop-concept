package ClassObject;

/**
 * Created by Anukul-PC on 10-03-2018.
 */
public class PersonRun {

    public static void main(String[] args) {
        Person anukulPerson = new Person();
        anukulPerson.toWalk();
        anukulPerson.toEarn();
        anukulPerson.toSleep(2000);

        Person mimohPerson = new Person();
        mimohPerson.toWalk();
        mimohPerson.toEarn();
        mimohPerson.toSleep(4000);
    }
}

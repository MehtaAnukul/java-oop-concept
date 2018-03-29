package ClassObject;

/**
 * Created by Anukul-PC on 20-03-2018.
 */
public class StringConcept {
    void dis() {
        String str = "hello word";
        String a = str.substring(6);
        System.out.println(a);
    }


    public int length(String string) {
        int length = 0;
        string = string + '\0';

        for (int i = 0; string.charAt(i) != '\0'; i++) {
            length++;
        }
        return length;
    }

    public String toLowerCase(String a) {

        String newStr = "";

        for (int i = 0; i < a.length(); i++) {

            char aChar = a.charAt(i);

            if (65 <= aChar && aChar <= 90) {
                aChar = (char) ((aChar + 32));
//                System.out.print(aChar);
                newStr = newStr + aChar;

            }
        }
        return newStr;
    }

    public String UpperCase(String a) {
        String newStr = "";

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (97 <= ch && ch <= 122) {
                ch = (char) ((ch - 32));
                newStr = newStr + ch;
            }
        }
        return newStr;
    }

    public String reverse(String a) {
        char[] ch = a.toCharArray();
        int end = ch.length - 1;
        char temp;

        for (int begin = 0; end > begin; begin++) {
            temp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = temp;
            end--;
        }
        return new String(ch);
    }

    public String substring(String a, int from, int end) {
        String newStr = "";

        for (int i = from; i <= end; i++) {
            newStr = newStr + a.charAt(i);
        }

        return newStr;
    }

    public String substring(String a, int from) {
        String newStr = "";

        for (int i = from; i <= a.length() - 1; i++) {
            newStr = newStr + a.charAt(i);
        }

        return newStr;
    }


}



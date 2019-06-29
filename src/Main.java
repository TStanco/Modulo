import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String name = "Tomek Stanko";
        char[] ch = name.toCharArray();
        int sum = 0;
        for(int i=0; i<ch.length; i++)
        {
        sum +=(int) ch[i];
        }
        System.out.println(sum%2);
    }
}

import java.io.UnsupportedEncodingException;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String name = "Tomek Stanko";
        char[] ch = name.toCharArray();
        int sum = IntStream.range(0, ch.length).map(i -> (int) ch[i]).sum();

        System.out.println(sum%2);
    }
}

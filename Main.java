import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        if (args.length > 0) {
            reader = new BufferedReader(new InputStreamReader(System.in));
        } else {
            reader = new BufferedReader(new StringReader(
                """
                1101111
                """
            ));
        }

        for(;;) {
            String line = reader.readLine();
            if (null == line) {
                break;
            }
            String converted = toHex(line);
            System.out.println(converted);
        }
    }

    public static String toHex(String binary) {
        if (binary.length() % 4 != 0) {
            // append zeros
        }
        if (!Pattern.matches("[01]*", binary)) {
            return null;
        }
        

        return "1";
    }

    public static String toBinary(String hex) {

        return "01";
    }
}
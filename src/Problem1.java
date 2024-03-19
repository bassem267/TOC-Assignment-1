import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem1 {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String input;
        bw.write("1 \n");
        while (!(input = br.readLine()).equals("end")) {
            if (isValidEmail(input.trim())) {
                bw.write("valid email\n");
            } else {
                bw.write("invalid email\n");
            }
        }
        bw.write("X \n");
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}

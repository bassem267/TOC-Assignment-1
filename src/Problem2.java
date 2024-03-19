import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Problem2 {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String input;
        bw.write("2 \n");
        while (!(input = br.readLine()).equals("end")) {
            if (isValidPhoneNumber(input.trim())) {
                bw.write("valid phone number\n");
            } else {
                bw.write("invalid phone number\n");
            }
        }
        bw.write("X \n");
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        String phoneRegex = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        return phoneNumber.matches(phoneRegex);
    }
}

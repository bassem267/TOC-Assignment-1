import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Problem3 {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String input;
        bw.write("3 \n");
        while (!(input = br.readLine()).equals("end")) {
            if (isValidDate(input.trim())) {
                bw.write("valid date\n");
            } else {
                bw.write("invalid date\n");
            }
        }
        bw.write("X \n");
    }

    public static boolean isValidDate(String date) {
        String dateRegex = "^(?:(?:31\\/(?:0?[13578]|1[02]))\\/(?:19|20)\\d{2}|(?:29|30)\\/(?:0?[1,3-9]|1[0-2])\\/(?:19|20)\\d{2}|(?:0?[1-9]|1\\d|2[0-8])\\/(?:0?[1-9]|1[0-2])\\/(?:19|20)\\d{2})$";
        return date.matches(dateRegex);
    }
}

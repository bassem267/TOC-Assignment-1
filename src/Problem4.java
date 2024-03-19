import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Problem4 {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String input;
        bw.write("4 \n");
        while (!(input = br.readLine()).equals("end")) {
            if (isValidIPAddress(input.trim())) {
                bw.write("valid IP address\n");
            } else {
                bw.write("invalid IP address\n");
            }
        }
        bw.write("X \n");
    }

    public static boolean isValidIPAddress(String ipAddress) {
        String ipRegex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        return ipAddress.matches(ipRegex);
    }
}

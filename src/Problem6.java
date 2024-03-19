import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Problem6 {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String input;
        bw.write("6 \n");
        while (!(input = br.readLine()).equals("end")) {
            if (hasNoTripleB(input.trim())) {
                bw.write("valid string\n");
            } else {
                bw.write("invalid string, has 3 consecutive b's\n");
            }
        }
        bw.write("X \n");
    }

    public static boolean hasNoTripleB(String input) {
        String tripleBRegex = "(?i).*bbb.*";
        return !input.matches(tripleBRegex);
    }
}

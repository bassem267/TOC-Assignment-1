import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Problem10 {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String input;
        bw.write("10 \n");
        while (!(input = br.readLine()).equals("end")) {
            if (isValidMathExpression(input.trim())) {
                bw.write("valid mathematical expression\n");
            } else {
                bw.write("invalid mathematical expression\n");
            }
        }
        bw.write("X \n");
    }

    public static boolean isValidMathExpression(String expression) {
        String mathRegex = "^\\s*(?:[-+]?\\s*(?:(?:\\d*\\.?\\d+)|[a-zA-Z]+)\\s*)*[/*+-]\\s*(?:[-+]?\\s*(?:(?:\\d*\\.?\\d+)|[a-zA-Z]+)\\s*)*=\\s*(?:[-+]?\\s*(?:(?:\\d*\\.?\\d+)|[a-zA-Z]+)\\s*)*\\s*$";
        return expression.matches(mathRegex);
    }
}

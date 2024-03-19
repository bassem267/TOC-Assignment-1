import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Problem5 {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String input;
        bw.write("5 \n");
        while (!(input = br.readLine()).equals("end")) {
            if (isValidCppVariable(input.trim())) {
                bw.write("valid C++ variable name\n");
            } else {
                bw.write("invalid C++ variable name\n");
            }
        }
        bw.write("X \n");
    }

    public static boolean isValidCppVariable(String variable) {
        String cppVariableRegex = "^[a-zA-Z_][a-zA-Z0-9_]*$";
        return variable.matches(cppVariableRegex);
    }
}

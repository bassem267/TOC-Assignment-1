import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem8 {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String input;
        bw.write("8 \n");
        while (!(input = br.readLine()).equals("end")) {
            extractMultipleOfThreeWords(input.trim(), bw);
        }
        bw.write("X \n");
    }

    public static void extractMultipleOfThreeWords(String input, BufferedWriter bw) throws IOException {
        int count = 0;
        String regex = "\\b\\w{3}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        bw.write("*" + input + "*\n");
        while (matcher.find()) {
            count++;
            String match = matcher.group();
            bw.write("number of matched words: " + count + "\n");
            bw.write("matched word: " + match + "\n");
            bw.write("start index: " + matcher.start() + ", end index: " + matcher.end() + "\n");
        }
        if (count == 0) {
            bw.write("No word matches\n");
        }
    }
}

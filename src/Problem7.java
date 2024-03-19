import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem7 {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String input;
        bw.write("7 \n");
        while (!(input = br.readLine()).equals("end")) {
            extractOddAAndBOccurrences(input.trim(), bw);
        }
        bw.write("X \n");
    }

    public static void extractOddAAndBOccurrences(String input, BufferedWriter bw) throws IOException {
        String regex = "(?:a{2,}|b{2,})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        bw.write("*" + input + "*\n");
        int count = 0;
        while (matcher.find()) {
            String match = matcher.group();
            count++;
            bw.write("number of matched substrings: " + count + "\n");
            bw.write("matched substring: " + match + "\n");
            bw.write("start index: " + matcher.start() + ", end index: " + matcher.end() + "\n");
        }
        if (count == 0) {
            bw.write("No matched substrings\n");
        }
        bw.write("X \n");
    }
}

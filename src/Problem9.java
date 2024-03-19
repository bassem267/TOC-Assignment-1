import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem9 {
    public static void solve(BufferedReader br, BufferedWriter bw) throws IOException {
        String filename;
        bw.write("9 \n");
        while (!(filename = br.readLine()).equals("end")) {
            extractURLsFromFile(filename.trim(), bw);
        }
        bw.write("X \n");
    }

    public static void extractURLsFromFile(String filename, BufferedWriter bw) throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            return;
        }
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        String line;
        int lineNumber = 0;
        bw.write("*" + filename + "*\n");
        int urlCount = 0;
        while ((line = fileReader.readLine()) != null) {
            lineNumber++;
            String regex = "(https?://\\S+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                urlCount++;
                String url = matcher.group();
                bw.write("Number of URLs: " + urlCount + "\n");
                bw.write("URL: " + url + "\n");
                bw.write("Line: " + lineNumber + "\n");
                bw.write("start index: " + matcher.start() + ", end index: " + matcher.end() + "\n");
            }
        }
        fileReader.close();
    }
}

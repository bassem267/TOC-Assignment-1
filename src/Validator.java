import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Validator {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            bw = new BufferedWriter(new FileWriter("output.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals("end")) {
                    bw.write("X\n\n");
                    continue;
                }
                int problemNumber = Integer.parseInt(line);
                switch (problemNumber) {
                    case 1:
                        Problem1.solve(br, bw);
                        break;
                    case 2:
                        Problem2.solve(br, bw);
                        break;
                    case 3:
                        Problem3.solve(br, bw);
                        break;
                    case 4:
                        Problem4.solve(br, bw);
                        break;
                    case 5:
                        Problem5.solve(br, bw);
                        break;
                    case 6:
                        Problem6.solve(br, bw);
                        break;
                    case 7:
                        Problem7.solve(br, bw);
                        break;
                    case 8:
                        Problem8.solve(br, bw);
                        break;
                    case 9:
                        Problem9.solve(br, bw);
                        break;
                    case 10:
                        Problem10.solve(br, bw);
                        break;
                    // Add cases for other problems here if needed
                }
            }
            bw.close(); // Close the BufferedWriter after writing all output
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close(); // Ensure BufferedWriter is closed in case of exception
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

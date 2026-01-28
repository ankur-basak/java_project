package file;

import java.io.*;

public class FileIO{

public static void appendOrder(String filename, String text) throws IOException {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
        bw.write(text);
        bw.newLine();
        bw.write("-----");
        bw.newLine();
    }
}


public static String readAll(String filename) throws IOException {
    StringBuilder sb = new StringBuilder();
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line).append(System.lineSeparator());
        }
    }
    return sb.toString();
}
}

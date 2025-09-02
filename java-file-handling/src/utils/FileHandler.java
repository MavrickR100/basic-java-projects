package utils;

import java.io.*;
import java.util.*;

public class FileHandler {
    private final String filename;

    public FileHandler(String filename) {
        this.filename = filename;
    }

    public void writeLine(String line, boolean append) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, append))) {
            bw.write(line);
            bw.newLine();
        }
    }

    public List<String> readAllLines() throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    public void overwriteFile(List<String> lines) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, false))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
    }
}
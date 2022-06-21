package com.company;

import java.io.*;
import java.util.ArrayList;

public class FileParser {
    private String path;
    private InputStream in;
    private BufferedReader buf;

    ArrayList<String> lines;

    public FileParser(String path) {
        this.path = path;
        lines = new ArrayList<>();
    }

    ArrayList<String> readFileLinestoListString() throws IOException {

        String line;
        in = new FileInputStream(path);
        buf = new BufferedReader(new InputStreamReader(in));
        while ((line = buf.readLine()) !=null) {
            lines.add(line);
        }

        for(String l : lines) {
            System.out.println(l);
        }


        return lines;


    }
}

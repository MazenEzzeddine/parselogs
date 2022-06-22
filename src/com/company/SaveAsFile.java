package com.company;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class SaveAsFile {
    String fileName;
    ArrayList<String> lines;


    OutputStream out ;



    public SaveAsFile(String fileName, ArrayList<String> lines) {
        this.fileName = fileName;
        this.lines = lines;
    }

    public void savetoFile() throws IOException {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        out = new FileOutputStream( s+ "\\"+fileName);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));

        for (String l : lines) {
            bw.write(l);
            bw.newLine();
        }

        bw.close();

    }
}

package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        ArrayList<String> lines =  new ArrayList<>();
        ArrayList<String> patterns = new ArrayList<>();
        FileParser fp = new FileParser("C:\\Users\\m.ezzeddine\\Desktop\\Experiments\\FileParser\\logs27.txt");
       lines = fp.readFileLinestoListString();

        Pattern p=Pattern.compile("totalArrivalRate \\d+");
        //Regular expression

        for (String l : lines) {
            Matcher m = p.matcher(l);
            if (m.find())
                //System.out.println(" Result :  " + m);
                patterns.add(m.group());
        }

        SaveAsFile sf = new SaveAsFile("rates",patterns);
        sf.savetoFile();

    }



}

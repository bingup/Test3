package com.com.test19.test10;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(reader);
        FileWriter writer = new FileWriter("data1.txt");
        BufferedWriter bw = new BufferedWriter(writer);
        List<String> list = new ArrayList<>();
        String line = null;
        while ((line = br.readLine()) != null){
            list.add(line);
        }
        Collections.reverse(list);
        for (String s :list){
            bw.write(s);
            bw.newLine();
        }
        bw.close();
        br.close();

    }
}

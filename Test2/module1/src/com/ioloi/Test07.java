package com.ioloi;

import java.io.*;
import java.util.HashMap;

public class Test07 {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> hashMap = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
   //     BufferedWriter bw = new BufferedWriter(new FileWriter(""));
        String line =null;
        while((line = br.readLine())!=null){
            String[] sp = line.split("\\.");
            hashMap.put(sp[0],sp[1]);
        }
        br.close();

        for(int i =1;i<=hashMap.size();i++){
            String key =String.valueOf(i);
            String value = hashMap.get(key);
            System.out.println(key+value);
        }
    }
}

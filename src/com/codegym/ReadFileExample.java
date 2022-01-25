package com.codegym;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public void readFile(String path) throws IOException {
        try {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        int sum = 0;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            sum += Integer.parseInt(line);
        }
        System.out.println("Tổng là " + sum);
        bufferedReader.close();
        fileReader.close();

        } catch (Exception e) {

            System.err.println("Fie nội dung có lỗi!");
        }
    }
}

package com.codegym;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        ReadFileExample readFileExample = new ReadFileExample();
        try {
            readFileExample.readFile("demo.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

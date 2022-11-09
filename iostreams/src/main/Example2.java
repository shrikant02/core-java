package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {
    public static void main(String[] args) {
        // System.in

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);

        // IOEception and FileNotFoundException
        try {
            String line =  in.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Reader object is an abstraction that tells the input stream(buffered reader) how to read the data
// Imp Reader impl => FileReader , InputStreamReader

package org.example.practice.lesson16;

import java.io.*;

public class SecretMessageReader implements Closeable {

    private final BufferedReader bufferedReader;

    public SecretMessageReader(String filename) throws FileNotFoundException {
        bufferedReader = new BufferedReader(new FileReader(filename));
    }

    public String read() throws IOException {
        String result = null;
        String text = bufferedReader.readLine();
        while (text != null) {
            result = text;
            text = bufferedReader.readLine();
        }
        return result;
    }

    @Override
    public void close() throws IOException {
        bufferedReader.close();
    }
}

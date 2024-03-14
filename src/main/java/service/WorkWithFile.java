package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WorkWithFile {
    public String readFile() throws IOException {
        if (isHaveText()) {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
            System.out.println("Выполнен readFile() печать имеющегося массива");
            return line;
        } else {
            System.out.println("вернулся null");
            return null;

        }
    }

    private boolean isHaveText() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line = reader.readLine();
            reader.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

}


package controller;

import model.InputArrayString;
import service.WorkWithFile;

import java.io.IOException;

public class Controller {
    public void start() throws IOException {
        WorkWithFile workWithFile = new WorkWithFile();
        String line = workWithFile.readFile();
        InputArrayString inputArrayString = new InputArrayString();
        //inputArrayString.createArray(line);
    }
}

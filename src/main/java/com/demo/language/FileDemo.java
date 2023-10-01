package com.demo.language;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileDemo {
    public static void main(String[] args) {
        parseFile();
    }
    public static void parseFile(){
        //create a  variable for the filename
        //TODO fix the path, application properties
        String filename ="C:\\c2023e2e\\e2e\\src\\main\\java\\com\\demo\\language\\run.txt";
        //open the file for reading io classes
        try {
            FileReader fileReader = new FileReader(filename);
            //line by line
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            //loop until eof
            while (line !=null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }


    }

}
package com.example.Core.Java.File_Input_Output;

import java.io.*;
import java.util.UUID;

public class BufferReaderWritter {
    public static void main(String[] args) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Personal\\60_Days_Java\\core_java_60_days\\Core-Java\\src\\main\\java\\com\\example\\Core\\Java\\File_Input_Output\\writeReadFile.txt") {
        });

        writer.write("This is a Data");
        int num = 100;
        while (num > 0) {
            writer.write("\n " + (100 - num +1) + ". " + UUID.randomUUID().toString());
            num--;
        }
        writer.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Personal\\60_Days_Java\\core_java_60_days\\Core-Java\\src\\main\\java\\com\\example\\Core\\Java\\File_Input_Output\\writeReadFile.txt"));
        try {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        }catch (Exception e){
            System.out.println(e);
        }
        bufferedReader.close();
    }
}

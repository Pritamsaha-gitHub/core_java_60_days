package com.example.Core.Java.File_Input_Output.Question_1;

import com.example.Core.Java.File_Input_Output.BufferReaderWritter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;

public class TextFileReadWrite {
    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Personal\\60_Days_Java\\core_java_60_days\\Core-Java\\src\\main\\java\\com\\example\\Core\\Java\\File_Input_Output\\Question_1\\ReadFile.txt"));
            Random random = new Random();
            int randomNumber = random.nextInt(1,10);
            for (int i =1 ; i <= 10 ; i++) {
                int multiplication = randomNumber * i ;
                writer.write("\n"+randomNumber + " * " + i + " = " + multiplication);
            }
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("D:\\Personal\\60_Days_Java\\core_java_60_days\\Core-Java\\src\\main\\java\\com\\example\\Core\\Java\\File_Input_Output\\Question_1\\ReadFile.txt"));
            BufferedWriter writer1 = new BufferedWriter(new FileWriter("D:\\Personal\\60_Days_Java\\core_java_60_days\\Core-Java\\src\\main\\java\\com\\example\\Core\\Java\\File_Input_Output\\Question_1\\newReadFile.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println("\n"+line);
                writer1.write(line+"\n");
            }
            writer1.close();
            reader.close();
        }catch (Exception e) {
            System.out.println(e);
        }

    }
}

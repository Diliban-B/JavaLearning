package org.diliban.concurrency.runnables;

import java.io.*;

public class CheckFileChange implements Runnable{

    private String fileValue;
    private final File file = new File("D:\\Projects\\JavaLearning\\src\\main\\resources\\files\\test_changingFile.txt");
    @Override
    public void run() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();
            if (line != null && !line.equals(fileValue)) {
                System.out.println("File has been changed: " + line);
                fileValue = line;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File cannot be read");
        }


    }
}

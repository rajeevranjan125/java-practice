package lambda.tutorial.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class JavaFile {

    public static void main(String[] args) {

//        try{
//            createFile();
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

       writeFile();
    }

    public static void createFile() throws IOException{
        File file = new File("/Users/rajeevranjanprasad/Desktop/workspace/java practice/java oops/src/lambda/tutorial/files/arun.txt");

        if(!file.createNewFile()){
            throw new IOException("file already exist");
        }

        System.out.println("successfully created file" + file.getName());
    }

    public static void writeFile() {

       try( FileWriter fileWriter = new FileWriter("/Users/rajeevranjanprasad/Desktop/workspace/java practice/java oops/src/lambda/tutorial/files/arun.txt", true)){

           fileWriter.write("\ni am a boy");
       } catch (IOException e) {
           System.out.println("error occurred while writing a file");
       }
    }
}

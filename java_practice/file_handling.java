package java_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class File_Handling{
    public static void main(final String[] args){
        // //creating new file and check the existance of a file
        // try{
        //     File myObj = new File("file.teaxt");
        //     if(myObj.createNewFile()){
        //         System.out.println("File created: "+ myObj.getName());
        //     }else {
        //         System.out.println("File already exits");
        //     }
        // } catch(IOException e){
        //     System.out.println("An error occured");
        //     e.printStackTrace();
        // }

        // //write to a file
        // try{
        //     FileWriter myWrite = new FileWriter("filea.txt");
        //     myWrite.write("file in java might be hard but it can be done");;
        //     myWrite.close();
        //     System.out.println("file written");
        // } catch(IOException e){
        //     System.out.println("error occured");;
        //     e.printStackTrace();
        // }


        // // reading a file
        // try{
        //     final FileReader myRead = new FileReader("file.txt");
        //     final Scanner in = new Scanner(myRead);
        //     while (in.hasNextLine()){
        //         String data = in.nextLine();
        //         System.out.println(data);
        //     }
        //     in.close();
        // } catch(FileNotFoundException e){
        //     System.out.println("error");
        //     e.printStackTrace();
        // }

        //delete a file
        File myObj = new File("file.text");
        if(myObj.delete()){
            System.out.println("deleted file: "+myObj.getName());
        }else {
            System.out.println("failed to delete the file");
        }
    }
}
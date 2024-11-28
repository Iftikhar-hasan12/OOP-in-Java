/*.Develop a file processing system that reads data from a file. If the file format is incorrect, throw a custom exception. 
The system should handle this exception and log an appropriate error message.*/
// Note : Before solving it, learn file handling.

package ftp;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;



class CustomException extends Exception {

    CustomException(String s) {

        super(s);
    }
}

public class FTP {

    public static void main(String[] args) throws  CustomException {

        String name = "Zafu_Darling.txt";
        File f = new File("D:\\fourth Semester\\OOP", name);
        try {

            if (!f.exists()) {
              boolean k=f.createNewFile();
              if(!k){
                   throw new CustomException("File can't be created");
              }
                FileWriter fw = new FileWriter(f, true);
                fw.write("Hi bro !!");

                fw.close();

            } else {
                FileWriter fw = new FileWriter(f, true);
                fw.write("Hi bro !!");

                fw.close();
            }

        } catch (CustomException e) {
 System.out.println("Error : "+e.getMessage());
        }catch(IOException e){
            
        }

        try {
            if (!f.exists()) {
                 
              throw new  CustomException("File dosen't Exits");
            }

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String text;
            while ((text = br.readLine()) != null) {
                System.out.println(text);
            }

        } catch (CustomException e) {
            System.out.println("Error : "+e.getMessage());

        }

        
        catch(IOException e){
            
        }
        
    }

}

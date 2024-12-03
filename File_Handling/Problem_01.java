/*File Handling -> Writting & Reading from File*/

package ftp;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

import java.io.BufferedReader;
import java.io.FileReader;



    public class FTP {

        public static void main(String args[]) {
            
            String s = "Iftikhar.txt";
            File file = new File("D:\\fourth Semester\\OOP",s);
            try{
                if(!file.exists()){
                    file.createNewFile();
                }
                for(int i=0; i<10; i++){
                
                FileWriter fw = new FileWriter(file,true);
                String ss = "File is working bro..!! >"+i;
                fw.write(ss+"\n");
                   
                fw.close();
                }
                
                
                System.out.println("Written data is : ");
                
                String text;
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                
                
                while(( text = br.readLine())!=null)
                {   
                    System.out.println(text);
                }            
                    
                
                
            }catch(IOException e){
                System.out.println("Error Occured ");
            }
           
        }
        

    }

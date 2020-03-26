
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestIOFile {
    public static void main(String[]args){
        Number10();
    }
    
    public static void Number1(){
     System.out.println("");   
     File file = new File("/directory/");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
    
    public static void Number2(){
     System.out.println("");  
     File my_file_dir = new File("/directory/xyz.txt");
         if (my_file_dir.exists()) 
           {
            System.out.println("The directory or file exists.\n");
           } 
         else
          {
            System.out.println("The directory or file does not exist.\n");
          }
    }
    
    public static void Number3(){
     System.out.println("");   
     File file = new File("/home/students/");
           String[] list = file.list(new FilenameFilter() {
           @Override
            public boolean accept(File dir, String name) {
             if(name.toLowerCase().endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }
    
    public static void Number4(){
     System.out.println("");   
     File my_file_dir = new File("/directory/abc.txt");
         if (my_file_dir.canWrite()){
            System.out.println(my_file_dir.getAbsolutePath() + " can write.\n");
        } else{
            System.out.println(my_file_dir.getAbsolutePath() + " cannot write.\n");
          }
         if (my_file_dir.canRead()){
            System.out.println(my_file_dir.getAbsolutePath() + " can read.\n");
        } else {
            System.out.println(my_file_dir.getAbsolutePath() + " cannot read.\n");
          } 
    }
    
    public static void Number5(){
     System.out.println("");  
     File my_file_dir = new File("/directory/abc.txt");
         if (my_file_dir.isDirectory()) 
           {
            System.out.println(my_file_dir.getAbsolutePath() + " is a directory.\n");
           } 
         else
          {
            System.out.println(my_file_dir.getAbsolutePath() + " is not a directory.\n");
          }
         if (my_file_dir.isFile()) 
           {
            System.out.println(my_file_dir.getAbsolutePath() + " is a file.\n");
           } 
         else
          {
            System.out.println(my_file_dir.getAbsolutePath() + " is not a file.\n");
          } 
    }
    
    public static void Number6(){
     System.out.println("");   
     String str1 = "NusaCamp - J2SE";
       String str2 = "NusaCamp - J2SE";
       String str3 = "NusaCamp - J2EE";

       int var1 = str1.compareTo( str2 );
       System.out.println("str1 & str2 comparison: "+var1);

       int var2 = str1.compareTo( str3 );
       System.out.println("str1 & str3 comparison: "+var2);
    }
    
    public static void Number7()    {
        System.out.println("");  
        File file = new File("test.txt");
        Date date=new Date(file.lastModified());
	System.out.println("\nThe file was last modified on: "+date+"\n");	   
    }
    
    public static void Number8() throws IOException{
        System.out.println(""); 
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input your name: ");
        String name = R.readLine();
        System.out.println("Your name is: " + name);
    }
    
    public static void Number9(){
        System.out.println("");   
        File file = new File("/directory/test.txt");
        if(file.exists())
        {
        System.out.println(filesize_in_Bytes(file));
        System.out.println(filesize_in_kiloBytes(file));
        System.out.println(filesize_in_megaBytes(file));
        }
        else 
        System.out.println("File doesn't exist");
    }
        private static String filesize_in_megaBytes(File file) {
        return (double) file.length()/(1024*1024)+" mb";
        }
        private static String filesize_in_kiloBytes(File file) {
        return (double) file.length()/1024+"  kb";
        }
        private static String filesize_in_Bytes(File file) {
        return file.length()+" bytes";
        }
    
    public static void Number10(){
     System.out.println("");   
     String file_name = "/directory/test.txt";
        InputStream fins = null;
        try {
            fins = new FileInputStream(file_name);
            byte file_content[] = new byte[2*1024];
            int read_count = 0;
            while((read_count = fins.read(file_content)) > 0){
                System.out.println(new String(file_content, 0, read_count-1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(fins != null) fins.close();
            } catch(Exception ex){
                 
            }
        }
    }
    
    public static void Number11(){
     System.out.println("");  
     BufferedReader br = null;
        String strLine = "";
        try {
            br = new BufferedReader( new FileReader("/directory/test.txt"));
            while( (strLine = br.readLine()) != null){
                System.out.println(strLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
    
    public static void Number12(){
     System.out.println("");   
     StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
             BufferedReader br = new BufferedReader(new FileReader("/home/students/test.txt"));
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
    
    public static void Number13(){
     System.out.println(""); 
     StringBuilder sb = new StringBuilder();
        String strLine = "";
        String str_data = "";
        try {
             BufferedReader br = new BufferedReader(new FileReader("/home/students/test.txt"));
             while (strLine != null)
             {
                if (strLine == null)
                  break;
                str_data += strLine;
                strLine = br.readLine();
                
            }
              System.out.println(str_data);
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
    
    public static void Number14(){
     System.out.println("");   
     StringBuilder sb = new StringBuilder();
        String strLine = "";
        List<String> list = new ArrayList<String>();
        try {
             BufferedReader br = new BufferedReader(new FileReader("/home/students/test.txt"));
              while (strLine != null)
               {
                strLine = br.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if (strLine==null)
                   break;
                list.add(strLine);
            }
         System.out.println(Arrays.toString(list.toArray()));
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
    
    public static void Number15(){
     System.out.println("");   
     StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
          {
             String filename= "/home/students/myfile.txt";
             FileWriter fw = new FileWriter(filename,false); 
             fw.write("Python Exercises\n");
             fw.close();
             BufferedReader br = new BufferedReader(new FileReader("/home/students/myfile.txt"));
             //read the file content
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();                          
           }
           catch(IOException ioe)
           {
            System.err.println("IOException: " + ioe.getMessage());
           }
    }   
}

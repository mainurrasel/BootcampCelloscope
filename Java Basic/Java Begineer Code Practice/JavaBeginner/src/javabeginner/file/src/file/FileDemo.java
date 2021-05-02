package file;

import java.io.File;

public class FileDemo {
    public static void main(String[]args){
        File dir = new File("Person");
        dir.mkdir();
        String path = dir.getAbsolutePath();
        File file1 = new File(path+"File1.txt");


        try {
            file1.createNewFile();

        }catch (Exception e){
            System.out.print(e);
        }
        if(file1.exists()){
            System.out.print("File exists");}
        else System.out.print("File doesn't exists");
        }
    }


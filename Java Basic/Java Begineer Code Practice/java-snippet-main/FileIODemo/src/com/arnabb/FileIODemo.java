package com.arnabb;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIODemo {

    public static void main(String[] args) {
        System.out.println("This is a Demo code for testing File Input-Output in Java\n");

        //file path
        File employeeInfoFile = new File("assets/EmployeeInfo.txt");

        FileIODemo employeeInfo = new FileIODemo();

        employeeInfo.writeToFile(employeeInfoFile);

        employeeInfo.readFromFile(employeeInfoFile);
    }

    //write into the file
    public void writeToFile(File fileToWrite){

        System.out.println("Writing into the File. Please wait...");


        try (PrintWriter employeeInfoWriter = new PrintWriter(fileToWrite)) {

            employeeInfoWriter.println("Name : Arnab");
            employeeInfoWriter.println("Designation : Software Engineer");


        } catch (FileNotFoundException e) {
            System.out.println("File not Found!");
            throw new RuntimeException();
        } finally {
            System.out.println("Finished Writing!\n");

        }

    }

    //read file from the directory
    public void readFromFile(File fileToRead){

        System.out.println("Reading the File. Please wait...");

        try {
            Scanner employeeInfoReader = new Scanner(fileToRead);

            while (employeeInfoReader.hasNext()){
                System.out.println(employeeInfoReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

    }
}

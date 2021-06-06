package co.company.example10;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

import static com.company.fileEncodingDecoding.FileEncodingDecoding.encodeFileToBase64Binary;

public class Example10Client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name:");
        String filename = sc.next();

        BufferedReader reader =null;
        PrintWriter writer = null;

        String inetAddr = "127.0.0.1";
        int port = 8888;

        String path = "/home/mainur/Desktop/base64/";

        try{
            Socket socket = new Socket(inetAddr,port);
            System.out.println("connected");

            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));

            File f = new File(path+filename+".png");
            String encodedString =  encodeFileToBase64Binary(f);

            writer.write(filename+" " + encodedString);
            writer.flush();

            socket.close();
            System.out.println("Connection closed from the client");

        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }


}

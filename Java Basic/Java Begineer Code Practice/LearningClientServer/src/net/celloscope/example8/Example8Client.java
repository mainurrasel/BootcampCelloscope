package net.celloscope.example8;
import java.io.*;
import java.net.Socket;

public class Example8Client {

    public static void main(String[] args) {

        PrintWriter writer = null;
        BufferedReader reader = null;

        String path = "/home/mainur/";
        String filename = "test.txt";

        String inetAddr = "127.0.0.1";
        int port = 8888;

        try {
            Socket socket = new Socket(inetAddr, port);
            System.out.println("Connected");

            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));

            writer.print("filename<DL>"+"\n");
            writer.print("fileext"+"\n");

            FileInputStream file = new FileInputStream(path+ filename);
            StringBuffer buf = new StringBuffer();
            int c;
            while ((c=file.read()) !=-1){
                buf.append((char)c);
            }

            writer.print("data<DL>"+ buf.toString());
            writer.flush();

            int firstChar = reader.read();
            System.out.println("The first character as integer: "+firstChar);
            System.out.println("The first character           : "+String.valueOf((char)firstChar));

            socket.close();

        }catch (Exception e){
            System.out.println("Unable to connect");
            System.out.println(e.getMessage());
        }
    }
}

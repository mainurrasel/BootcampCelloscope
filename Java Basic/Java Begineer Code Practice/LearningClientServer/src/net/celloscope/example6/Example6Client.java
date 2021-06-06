package net.celloscope.example6;
import java.io.*;
import java.net.Socket;

public class Example6Client {

    public static void main(String[] args) {

        PrintWriter writer = null;
        BufferedReader reader = null;

        String inetAddr = "127.0.0.1";
        int port = 8888;

        try {
            Socket socket = new Socket(inetAddr, port);
            System.out.println("Connected");

            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));

            writer.print("ABCDE"+"\n");
            writer.print("FGHIJ"+"\n");
            writer.flush();

            int firstChar = reader.read();
            System.out.println("The first character as integer: "+firstChar);
            System.out.println("The first character           : "+String.valueOf((char)firstChar));


        }catch (Exception e){
            System.out.println("Unable to connect");
            System.out.println(e.getMessage());
        }
    }
}

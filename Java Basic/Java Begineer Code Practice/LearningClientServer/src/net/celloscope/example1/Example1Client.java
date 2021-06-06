package net.celloscope.example1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Example1Client {

    public static void main(String[] args) {

        OutputStream writer = null;
        BufferedReader reader = null;

        String inetAddr = "127.0.0.1";
        int port = 8888;

        try {
            Socket socket = new Socket(inetAddr, port);
            System.out.println("Connected");

            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = socket.getOutputStream();
            writer.write(65);
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

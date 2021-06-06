package net.celloscope.example2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Example2Client {

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
            writer.write(7);//F
            writer.write(65);//A
            writer.write(66);//B
            writer.write(67);//C
            writer.write(68);//D
            writer.write(69);//E
            writer.write(70);//F
            writer.write(71);//F



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

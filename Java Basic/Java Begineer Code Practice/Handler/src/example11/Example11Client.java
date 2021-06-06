package example11;

import java.io.*;
import java.net.Socket;

public class Example11Client {
    static String transmissionMethod = "SEND";


    public static void main(String[] args) {

        PrintWriter writer = null;
        BufferedReader reader = null;

        String inetAddr = "127.0.0.1";
        int port = 7777;

        String fileName = "bike2.png";
        String filePath = "/home/mainur/Desktop/base64/"+fileName; // image file

        try {
            Socket socket = new Socket(inetAddr, port);
            System.out.println("Client Connected");

            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));

            String base64ImageString = EncodeDecode.encoder(filePath);
            //System.out.println("Client Side Encoder : " + base64ImageString);

            writer.println(transmissionMethod+","+base64ImageString+","+fileName);

            writer.flush();

            socket.close();

        } catch (Exception e) {
            System.out.println("Unable to connect");
            System.out.println(e.getMessage());
        }
    }
}

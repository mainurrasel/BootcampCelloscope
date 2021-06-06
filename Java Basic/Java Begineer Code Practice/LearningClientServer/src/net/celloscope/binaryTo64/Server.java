package net.celloscope.binaryTo64;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Base64;

public class Server {
    public static void main(String[] args) {

        int port = 8888;

        BufferedReader reader = null;
        OutputStream writer = null;

        try{
            System.out.println("Connected to server Port: " + port);
            ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();

//            Thread.sleep(10000);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = socket.getOutputStream();

            String line = "";
            line = reader.readLine();

            if(line == null) {
                System.out.println("Nothing to read");
                return;
            }

            while (line != null){
                System.out.println("Server Received : " + line + "\n");

                decoder(line, "/home/mainur/Desktop/base64/lalaladecode.jpg");
                line = reader.readLine();

                System.out.println("Decoded!");

            }

            System.out.println("End of transmission");

            writer.flush();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // decoder
    public static void decoder(String base64File, String pathFile) {

        try {
            FileOutputStream imageOutFile = new FileOutputStream(pathFile);
            byte[] imageByteArray = Base64.getDecoder().decode(base64File);
            imageOutFile.write(imageByteArray);

        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e);

        } catch (IOException ioe) {
            System.out.println("Exception while reading the File " + ioe);

        }
    }
}

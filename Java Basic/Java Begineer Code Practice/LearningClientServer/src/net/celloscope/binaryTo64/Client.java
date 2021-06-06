package net.celloscope.binaryTo64;

import java.io.*;
import java.net.Socket;
import java.util.Base64;

public class Client {

    public static void main(String[] args) {

        PrintWriter writer = null;
        BufferedReader reader = null;

        String inetAddr = "127.0.0.1";
        int port = 8888;

        String filePath = "/home/mainur/Desktop/base64/lalala.jpg"; // image file

        try {
            Socket socket = new Socket(inetAddr, port);
            System.out.println("Connected");

            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));

            String base64ImageString = encoder(filePath);
            System.out.println("Client Side Encoder : " + base64ImageString);

            writer.print(base64ImageString);
            writer.flush();

//            socket.close();

        } catch (Exception e) {
            System.out.println("Unable to connect");
            System.out.println(e.getMessage());
        }
    }

    // encoder
    public static String encoder(String filePath) {

        String base64Image = "";
        File file = new File(filePath);

        try {
            FileInputStream imageInFile = new FileInputStream(file);
            byte[] fileData = new byte[(int) file.length()];
            imageInFile.read(fileData);
            base64Image = Base64.getEncoder().encodeToString(fileData);

        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e);

        } catch (IOException ioe) {
            System.out.println("Exception while reading the File " + ioe);

        }
        return base64Image;
    }

}

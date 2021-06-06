package net.celloscope.multiThreaded;

import java.io.*;
import java.net.Socket;
import java.util.Base64;

public class MultiThreadedClient {
    static PrintWriter writer = null;
    static BufferedReader reader = null;
    static String inetAddr = "127.0.0.1";
    static int port = 8888;

    //encode to base64
    public static String encoder(String imagePath) {
        String base64Image = "";
        File file = new File(imagePath);
        try (FileInputStream imageInFile = new FileInputStream(file)) {
            // Reading a Image file from file system
            byte imageData[] = new byte[(int) file.length()];
            imageInFile.read(imageData);
            base64Image = Base64.getEncoder().encodeToString(imageData);
        } catch (FileNotFoundException e) {
            System.out.println("Image not found" + e);
        } catch (IOException ioe) {
            System.out.println("Exception while reading the Image " + ioe);
        }
        return base64Image;
    }
    public static void main(String[] args) {

        try {
            Socket socket = new Socket(inetAddr, port);
            System.out.println("Connected");
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader brCli = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter image name to be sent to Server: ");
            String strCli = brCli.readLine();
            String path = "/home/mainur/Desktop/base64/"+strCli;
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
            String base64ImageString = encoder(path);
            System.out.println("Base64ImageString = " + base64ImageString);
            writer.print(base64ImageString);
            writer.flush();
            socket.close();
        } catch (Exception e) {
            System.out.println("Unable to connect");
            System.out.println(e.getMessage());
        }
    }
}
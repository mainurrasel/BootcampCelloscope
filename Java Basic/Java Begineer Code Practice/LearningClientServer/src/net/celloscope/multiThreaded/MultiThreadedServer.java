package net.celloscope.multiThreaded;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

public class MultiThreadedServer implements Runnable {
    static int port = 8888;
    static BufferedReader reader = null;
    static OutputStream writer = null;
    Socket socket;
    public MultiThreadedServer(Socket socket) {
        this.socket = socket;
    }

    public static void decoder(String base64Image, String pathFile) {
        try (FileOutputStream imageOutFile = new FileOutputStream(pathFile)) {
            // Converting a Base64 String into Image byte array
            byte[] imageByteArray = Base64.getDecoder().decode(base64Image);
            imageOutFile.write(imageByteArray);
        } catch (FileNotFoundException e) {
            System.out.println("Image not found" + e);
        } catch (IOException ioe) {
            System.out.println("Exception while reading the Image " + ioe);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("trying to connect " + port);
        ServerSocket serverSocket = new ServerSocket(port);

        while (true) {

            Socket socket = serverSocket.accept();
            System.out.println("connection from IP " + socket.getInetAddress().toString());
            System.out.println("connection from port " + socket.getPort());
            System.out.println("connection from Local IP " + socket.getLocalAddress());
            System.out.println("connection from Local PORT " + socket.getLocalPort());
            new Thread(new MultiThreadedServer(socket)).start();
        }
    }
    @Override
    public void run() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);

        String path = "/home/mainur/Desktop/base64/"+formattedDate+".png";
        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = socket.getOutputStream();
            String line = "";
            line = reader.readLine();

            if (line == null) {
                System.out.println("Nothing to read");
                return;
            }

            while (line != null) {


                System.out.println("Received: " + line);
                decoder(line, path);
                line = reader.readLine();
            }
            System.out.println("end of transmission");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}

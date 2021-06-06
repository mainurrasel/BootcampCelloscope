package example11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class Example11Server {

    static int port = 7777;
    static String outPath = "/home/mainur/Desktop/base64/";

    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try{
            System.out.println("Connected to server Port: " + port);
            serverSocket = new ServerSocket(port);

            while (true) {
                Socket socket = serverSocket.accept();

                Parser handler = new Parser(socket);

                new Thread(handler).start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // for thread purpose
    private static class Parser implements Runnable {

        private final Socket clientSocket;
        String[] receivedEncodedString;
        String[] fileName;
        String decodedFilePath="";
        Requests requests;
        Handler handler = new Handler();

        public Parser(Socket socket) {
            this.clientSocket = socket;
        }

        public void run(){
            BufferedReader reader = null;
            OutputStream writer = null;

            try{
                reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                writer = clientSocket.getOutputStream();

                String line = "";
                line = reader.readLine();

                if(line == null) {
                    System.out.println("Nothing to read");
                    return;
                }

                while (line != null){
                   // System.out.println("\nServer Received : " + line + "\n");
                    System.out.println("Please wait...");

                    receivedEncodedString = line.split(","); // splitting into encodedValue and filename
                    fileName = receivedEncodedString[2].split("\\."); // fileExt[1] = file extension
                    decodedFilePath = outPath+"decoded_"+ LocalDateTime.now() + "_" + receivedEncodedString[2];

                    requests = new Requests(receivedEncodedString[0], fileName[0], fileName[1], receivedEncodedString[1]);
                    handler.handler(requests, decodedFilePath);

                    line = reader.readLine();

                    System.out.println("Thank You! Decoded!");
                }

                System.out.println("End of transmission");

                writer.flush();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

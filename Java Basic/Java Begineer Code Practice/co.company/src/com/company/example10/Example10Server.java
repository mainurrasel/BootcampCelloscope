package com.company.example10;

import javax.swing.plaf.TableHeaderUI;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import static com.company.fileEncodingDecoding.FileEncodingDecoding.decodeFileToImage;

public class Example10Server extends Thread {

    public static void main(String[] args) {
        Example10Server thread = new Example10Server();
        thread.start();

    }

    public void run()
    {
        int port =8888;

        BufferedReader reader = null;
        OutputStream writer =null;

        String outputPath = "/home/mainur/Desktop/base64";
        try {
            System.out.println("Trying to start server on port: " + port);
            ServerSocket serverSocket = new ServerSocket(port);

            while(true)
            {
                Socket socket =  serverSocket.accept();
                System.out.println("===================");
                System.out.println("Connection from IP" + socket.getInetAddress().toString());
                System.out.println("Connection from port " + socket.getPort());
                System.out.println("Connected to local IP " + socket.getLocalAddress());
                System.out.println("Connected to local port " + socket.getLocalPort());


                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                writer = socket.getOutputStream();

                String line ="";
                line =reader.readLine();
                //System.out.println(line);


                if(line ==null)
                {
                    System.out.println("Nothing to read");
                    return;
                }

                while (line != null)
                {
                    System.out.println("Received");
                    String[] stringArray = line.split(" ");
                    decodeFileToImage(stringArray[1] , outputPath+stringArray[0]+"_output.png");
                    line = reader.readLine();
                }

                System.out.println("End of transmission");
                System.out.println("===================");
            }


        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

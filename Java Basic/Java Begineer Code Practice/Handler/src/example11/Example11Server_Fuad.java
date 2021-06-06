/*
package example11;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class Example11Server_Fuad extends Thread {

    public static void main(String[] args) {
        Example11Server thread = new Example11Server();
        thread.start();

    }

    public void run()
    {
        int port =8888;

        BufferedReader reader = null;
        PrintWriter writer =null;

        String outputPath = "/home/anfuad/";
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
                writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));


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
                    writer.write("ACK");
                    //writer.flush();
                    parser(line);
                    line = reader.readLine();
                }

                writer.flush();
                System.out.println("End of transmission");
                System.out.println("===================");
            }


        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void parser(String incoming) throws Exception {
        String[] incomingLines = incoming.split(" ");

        String method, fileName, extension, encodingMethod, encodedString;

        method= incomingLines[0];

        if(method.equals("SEND"))
        {
            fileName= incomingLines[1];
            extension = incomingLines[2];
            encodingMethod = incomingLines[3];
            encodedString = incomingLines[4];

            Request request = new Request(method,fileName,extension, encodingMethod,encodedString);
            HandlerDriver requestHandler = new HandlerDriver();
            requestHandler.handleRequest(request);
        }

        else if(method.equals("FETCH"))
        {
            fileName= incomingLines[1];
            extension = incomingLines[2];
            encodingMethod = incomingLines[3];
        }



    }


}
*/

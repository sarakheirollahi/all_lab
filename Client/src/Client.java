/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.net.Socket;


public class Client {

    public Client(){
       run();
    }
    public  void run()  {
        // need host and port, we want to connect to the ServerSocket at port 7777
        try { Socket socket = new Socket("0.0.0.0", 777);
        System.out.println("Connected!");

        // get the output stream from the socket.
        OutputStream outputStream = socket.getOutputStream();
        // create a data output stream from the output stream so we can send data
        // through it
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        System.out.println("Sending string to the ServerSocket");

        // write the message we want to send
        boolean terminate = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(!terminate) {
            String text = reader.readLine();
            if(text.equals("over")) {
                terminate = true;
            }
            dataOutputStream.writeUTF(text);
            dataOutputStream.flush(); // send the message

        }
      //  dataOutputStream.close(); // close the output stream when we're done.

        System.out.println("Closing socket and terminating program.");
       // socket.close();
    }catch (IOException ex) {
       //s System.err.println(ex.toString());
    }


}}

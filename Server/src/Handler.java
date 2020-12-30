/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class Handler extends Thread {
 int number;
    Socket channel = null ;
    String message;

    public Handler(Socket s, int number){
        channel = s ;
        this.number=number;
        start();
        message = new String();
    }


    public void run(){
        InputStream in ;
        System.out.println(number);
        try {
            InputStream inputStream = channel.getInputStream();
            // create a DataInputStream so we can read data from it.
            DataInputStream dataInputStream = new DataInputStream(inputStream);



            while(true){
                 message = message.concat(dataInputStream.readUTF());


                // read the message from the socket
                System.out.println("The message sent from the client"+number+" : "+ message);

                in = new DataInputStream( new BufferedInputStream( channel.getInputStream() ) );


            }

        } catch (IOException ex) {
            System.err.println(ex.toString());
        }

    }


}

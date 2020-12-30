/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Server {

int clientCount;
    public Server(){
        int clientCount=0;
        init();
    }

    ServerSocket server = null ;
    InputStream in = null ;
    OutputStream out = null ;


    public void init(){
       while (true){
        try {
          while (true){
            server = new ServerSocket(777);
            Socket channel = server.accept();
            clientCount++;
            Handler h = new Handler(channel,clientCount);}

        } catch(IOException e){

        }}


    }







}

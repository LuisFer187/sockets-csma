/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora.csma;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Luis Fernando Tenorio Aspiros
 */
public class Client{
    private Socket socket = null; 
    private DataInputStream  input = null; 
    private DataOutputStream out = null; 
  
    //Para connectarlo al servidor
    public Client(String address, int port) { 
        // estableciendo conexion
        try{
            socket = new Socket(address, port); 
            System.out.println("Conectado"); 
  
            // toma alguna entrada
            OutputStream os= socket.getOutputStream();
            DataOutputStream flujoDOS = new DataOutputStream(os);
            flujoDOS.writeUTF("Mensaje trivial, " + socket.getInetAddress());
        } 
        catch(UnknownHostException u){ 
            System.out.println(u); 
        } 
        catch(IOException i) { 
            System.out.println(i); 
        } 
  
        // Cerrar conexion 
        try{ 
            input.close(); 
            out.close(); 
            socket.close(); 
        } 
        catch(IOException i){ 
            System.out.println(i); 
        } 
    }
    public void main(String [] args){
        Client c = new Client("187.191.38.2", 5000); //Dejare la ip vacia por el momento
    }
}

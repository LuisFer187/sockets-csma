/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora.csma;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.net.*;
import java.util.Hashtable;
/**
 *
 * @author Luis Fernando Tenorio 
 */
public class Algoritmo extends Thread{
    Socket socket;
    public String estado_act;
    public String estado_ant;
    public String mensaje;
    InetAddress address;
    public Hashtable<Integer, Socket> lista;
    
    public Algoritmo(String estado_act, String esto_ant, String mensaje, Hashtable<Integer, Socket> table){
        this.estado_act = estado_act;
        this.estado_ant = esto_ant;
        this.mensaje = mensaje;
        this.lista = table;
        
        start();
    }
    
    @Override
    public void run(){
        try {
            //Un ciclo para inspeccionar los estados y realizar 
            ServerSocket ss = new ServerSocket (5000);
            Hashtable<Integer, Socket> cliente_tiempo = new Hashtable<Integer, Socket>();
            while(true){
                if (ss.accept() != null) {
                    cliente_tiempo.put(ss.getSoTimeout(), ss.accept());
                }            
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

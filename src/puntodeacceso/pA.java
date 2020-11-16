/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeacceso;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Fernando Tenorio Aspiros y Sánchez Gonzales Daniel Ivan
                                                    ╓╣╢╗
                                                  ,╣▒▒▒▒╣
                                                 @▒▒▒▒▒▒▒╢ ▄▄,
                                              ▄▄█▒▒▒▒▒▄████████▄
                                            ╓▀▀█████▄████████████▄
                                        ,@╣▒▒▒▒▒▒▒▀███████   ▐██▌
                                     ,╦╣▒▒▒▒▒▒▒▒▒▒▒███████   ▄███▄
                                  ,╦╣▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████████████▄▄
                                ,@▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▐████████████████████▄
                               ╔▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████████████████████▄
                             ,╣▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▀██████▀▀▀▀▀  ▀▀▀▀▀████
                            ╔▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓╜                      ▀█▌
                          ,╣▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
                         ╓╢▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒@
                        ╔▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╢
                       ╫▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒U
                      ╫▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╣
                     ╟▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
                    ╓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓╖
                    ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒@
                   ╣▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╢
                  ]▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╢
   ▓╢             ╣▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╣
   ╢╢            ]▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
   ╢╢            ╟▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
   ╢╢            ╢▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
   ╢╢            ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒L
   ▓╢L           ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[
    ╢▓           ╢▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╡
    ╟╢@          ║▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╢
     ▓╢╗         ]▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
      ▓╢@         ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
       ╙╢▓╖       ]▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
         ╩╢▓╖      ╣▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
           '▓╢▓╦, ]▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
               ╙▓╢▓╢▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╖╓,
                  '╙╝╣▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╣

 */
public class pA extends Thread{
    private String strMiIP = "";
    private String strMensajeroIP = "";
    private int intPaquetes = 0;
    private String strEstado = "LIBRE";
    private String strEstadoAnterior = "LIBRE";
    private String strEstadoMensajero = "";
    private String strEstadoMensajeroAnterior = "";
    private Hashtable<Integer, Socket> clientes;

    public pA(Hashtable<Integer, Socket> clientes) {
        this.clientes = clientes;
        start();
    }
    
    
    
    public void pA(
            String strMiIP,
            String strMensajeroIP, 
            int intPaquetes,
            String strEstado,
            String strEstadoAnterior,
            String strEstadoMensajero,
            String strEstadoMensajeroAnterior){
        this.setStrEstado(strEstado);
        this.setStrMiIP(strMiIP);
        this.setStrMensajeroIP(strMensajeroIP);
        this.setStrEstadoAnterior(strEstadoAnterior);
        this.setStrEstadoMensajero(strEstadoMensajero);
        this.setStrEstadoMensajeroAnterior(strEstadoMensajeroAnterior);
        this.setIntPaquetes(intPaquetes);
    }
    
    
    // El punto puede estar en los estados LIBRE, (OCUPADO+IPMENSAJERO)
    public void run(){
        //Con otro ciclo para que siempre este atendiendo0
        
        while(true){
            //Set<Integer> keys = this.clientes.keySet();
            //Iterator<Integer> itr = keys.iterator();
            //itera usando loop
            //Object ob = itr.next();
            //Socket so = (Socket)ob;
            //InputStream aux;
            //aux = so.getInputStream();
            //DataInputStream flujo = new DataInputStream( aux );
            //this.setStrMensajeroIP(so.getInetAddress().toString());
            Map<Integer, Socket> map = this.clientes;
            for (Map.Entry<Integer, Socket> entry : map.entrySet()) {
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
                Integer time = entry.getKey();
                Socket so = entry.getValue();
                this.strMensajeroIP = so.getInetAddress().getHostAddress();
                if (this.getStrEstado()=="LIBRE") {
                    this.setStrEstadoAnterior("LIBRE");
                    this.setStrEstado("OCUPADO" + this.getStrMensajeroIP());
                    sendResponse("CTS", this.getStrMensajeroIP());
                }
                else if (this.getStrEstado()=="OCUPADO"+this.getStrMensajeroIP()) {
                    sendResponse("Recibiendo datos de "+this.getStrMensajeroIP(), this.getStrMensajeroIP());

                }
                else if (this.getStrEstado().contains("OCUPADO")==true){
                    sendResponse("OCUPADO", this.getStrMensajeroIP());
                }else if( this.getStrEstadoAnterior().contains("OCUPADO")==true && this.clientes == new Hashtable<Integer, Socket>() ){
                    this.setStrEstadoAnterior("LIBRE");
                    this.setStrEstado("LIBRE" + this.getStrMensajeroIP());
                    sendResponse("LIBRE", "LIBRE");
                }          
            }
        }
    }
    
    public void punto(){
        if (this.getStrEstado()=="LIBRE") {
                this.setStrEstadoAnterior("LIBRE");
                this.setStrEstado("OCUPADO" + this.getStrMensajeroIP());
                sendResponse("CTS", this.getStrMensajeroIP());
            }
            else if (this.getStrEstado()=="OCUPADO"+this.getStrMensajeroIP()) {
                sendResponse("Recibiendo datos de "+this.getStrMensajeroIP(), this.getStrMensajeroIP());

            }
            else if (this.getStrEstado().contains("OCUPADO")==true){
                sendResponse("OCUPADO", this.getStrMensajeroIP());
            }
    }
    //metodo que recoge y enviara las variables (Privado por ahora)
    public void sendResponse(String estado, String strMensIP) {
        System.out.println("ESTADO: "+estado);
        System.out.println("ENVIAR A: "+strMensIP);
        
        
    }
    
    
    // Getters Y Setters

    /**
     * @return the strMiIP
     */
    public String getStrMiIP() {
        return strMiIP;
    }

    /**
     * @param strMiIP the strMiIP to set
     */
    public void setStrMiIP(String strMiIP) {
        this.strMiIP = strMiIP;
    }

    /**
     * @return the strMensajeroIP
     */
    public String getStrMensajeroIP() {
        return strMensajeroIP;
    }

    /**
     * @param strMensajeroIP the strMensajeroIP to set
     */
    public void setStrMensajeroIP(String strMensajeroIP) {
        this.strMensajeroIP = strMensajeroIP;
    }

    /**
     * @return the intPaquetes
     */
    public int getIntPaquetes() {
        return intPaquetes;
    }

    /**
     * @param intPaquetes the intPaquetes to set
     */
    public void setIntPaquetes(int intPaquetes) {
        this.intPaquetes = intPaquetes;
    }

    /**
     * @return the strEstado
     */
    public String getStrEstado() {
        return strEstado;
    }

    /**
     * @param strEstado the strEstado to set
     */
    public void setStrEstado(String strEstado) {
        this.strEstado = strEstado;
    }

    /**
     * @return the strEstadoAnterior
     */
    public String getStrEstadoAnterior() {
        return strEstadoAnterior;
    }

    /**
     * @param strEstadoAnterior the strEstadoAnterior to set
     */
    public void setStrEstadoAnterior(String strEstadoAnterior) {
        this.strEstadoAnterior = strEstadoAnterior;
    }

    /**
     * @return the strEstadoMensajero
     */
    public String getStrEstadoMensajero() {
        return strEstadoMensajero;
    }

    /**
     * @param strEstadoMensajero the strEstadoMensajero to set
     */
    public void setStrEstadoMensajero(String strEstadoMensajero) {
        this.strEstadoMensajero = strEstadoMensajero;
    }

    /**
     * @return the strEstadoMensajeroAnterior
     */
    public String getStrEstadoMensajeroAnterior() {
        return strEstadoMensajeroAnterior;
    }

    /**
     * @param strEstadoMensajeroAnterior the strEstadoMensajeroAnterior to set
     */
    public void setStrEstadoMensajeroAnterior(String strEstadoMensajeroAnterior) {
        this.strEstadoMensajeroAnterior = strEstadoMensajeroAnterior;
    }
    
}

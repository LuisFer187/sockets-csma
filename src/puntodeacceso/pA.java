/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeacceso;

import java.net.*;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author navy
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
    
    public void pa(){
        
    }
    
    public void pA(Hashtable<Integer, Socket> clientes){
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
            Enumeration<Integer> keys = this.clientes.keys();
 
            //itera usando loop
            while( keys.hasMoreElements() ){
                System.out.println( keys.nextElement() );
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeacceso;

/**
 *
 * @author navy
 */
public class pA {
    String strMiIP = "";
    String strMensajeroIP = "";
    int intPaquetes = 0;
    String strEstado = "";
    String strEstadoAnterior = "";
    String strEstadoMensajero = "";
    String strEstadoMensajeroAnterior = "";
    public void pA(){
    
    }
    public void pA(
            String strMiIP,
            String strMensajeroIP, 
            int intPaquetes,
            String strEstado,
            String strEstadoAnterior,
            String strEstadoMensajero,
            String strEstadoMensajeroAnterior){
        this.strEstado = strEstado;
        this.strMiIP = strMiIP;
        this.strMensajeroIP = strMensajeroIP;
        this.strEstadoAnterior = strEstadoAnterior;
        this.strEstadoMensajero = strEstadoMensajero;
        this.strEstadoMensajeroAnterior = strEstadoMensajeroAnterior;
        this.intPaquetes = intPaquetes;
    }
    // El punto puede estar en los estados LIBRE, (OCUPADO+IPMENSAJERO)
    public void puntoAcceso(){
        if (this.strEstado=="LIBRE") {
            this.strEstadoAnterior="LIBRE";
            this.strEstado="OCUPADO"+this.strMensajeroIP;
            sendResponse("CTS",this.strMensajeroIP);
        }
        else if (this.strEstado=="OCUPADO"+this.strMensajeroIP) {
            sendResponse("Recibiendo datos de "+this.strMensajeroIP,this.strMensajeroIP);
            
        }
        else if (this.strEstado.contains("OCUPADO")==true){
            sendResponse("OCUPADO",this.strMensajeroIP);
        }
    }
    private void sendResponse(String estado, String strMensIP) {
        System.out.println("ESTADO: "+estado);
        System.out.println("ENVIAR A: "+strMensIP);
    }
}

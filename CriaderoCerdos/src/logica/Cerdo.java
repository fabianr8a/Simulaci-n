/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Chago
 */
public class Cerdo {
    String ambiente;
    int peso;
    int tiempo;
    String comida;

    public Cerdo() {
    }

    public Cerdo(String ambiente, int peso, int tiempo, String comida) {
        this.ambiente = ambiente;
        this.peso = peso;
        this.tiempo = tiempo;
        this.comida = comida;
    }

    
    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
    
    public void alimentar (int kilosDeAlimento, int tiempoDeVida){
       this.peso = peso+ kilosDeAlimento;
       this.tiempo = tiempo+tiempoDeVida;
               
    } 
            
    public boolean seAdaptoAlAmbiente (String ambiente){
        if (ambiente.equalsIgnoreCase("calida")) {
            return true;
        } else {
            return false;
        }
    }
         
}

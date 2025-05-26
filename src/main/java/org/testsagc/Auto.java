package org.testsagc;

public class Auto {
    private String marca;
    private String modelo;
    private double costo;

    public Auto() {

    }
    public Auto(String marca, String modelo, Double costo){
        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;
    }

    public String getMarca() {return marca;}
    public String getModelo() { return modelo;}
    public Double getCosto() { return costo;}

    public void setMarca(String marca){ this.marca = marca;}
    public void setModelo(String modelo ){this.modelo = modelo;}
    public void setCosto(Double costo){this.costo = costo;}


    @Override
    public String toString() {return marca + " " + modelo + " " + costo;}
}

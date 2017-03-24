/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_lab_josuezelaya;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Album {
    private String nombre;
    private String artista;
    private ArrayList<Canciones> canciones_agregadas=new ArrayList();

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public ArrayList<Canciones> getCanciones_agregadas() {
        return canciones_agregadas;
    }

    public void setCanciones_agregadas(ArrayList<Canciones> canciones_agregadas) {
        this.canciones_agregadas = canciones_agregadas;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
    
}


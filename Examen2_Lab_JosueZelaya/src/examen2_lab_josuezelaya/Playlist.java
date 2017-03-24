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
class Playlist {
    private String nombre;
    private ArrayList canciones_playlist=new ArrayList();

    public Playlist(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getCanciones_playlist() {
        return canciones_playlist;
    }

    public void setCanciones_playlist(ArrayList canciones_playlist) {
        this.canciones_playlist = canciones_playlist;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
}

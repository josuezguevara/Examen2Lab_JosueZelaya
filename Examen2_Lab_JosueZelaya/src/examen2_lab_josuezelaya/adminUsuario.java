/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_lab_josuezelaya;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class adminUsuario {
     private ArrayList<Usuario> Listausuarios=new ArrayList();
    private File Archivos=null;

    public adminUsuario(String path) {
        Archivos=new File(path);
    }

    public ArrayList<Usuario> getListausuarios() {
        return Listausuarios;
    }

    public void setListausuarios(ArrayList<Usuario> Listausuarios) {
        this.Listausuarios = Listausuarios;
    }

    public File getArchivos() {
        return Archivos;
    }

    public void setArchivos(File Archivos) {
        this.Archivos = Archivos;
    }
    //metodos admin
    public void setArchivo(File Archivos){
        this.Archivos = Archivos;
    }
    
    public void setUsuario(Usuario usuario){
        Listausuarios.add(usuario);
    }
    public void CargarArchivo(){
        try {
            Listausuarios=new ArrayList();
            Usuario temp;
             if (Archivos.exists()) {
                FileInputStream Entrada = new FileInputStream(Archivos);
                ObjectInputStream Objeto = new ObjectInputStream(Entrada);
                try {
                    while((temp = (Usuario) Objeto.readObject())!= null){
                        Listausuarios.add(temp);
                    }
                } catch (EOFException e) {
                    // Encontro el final del archivo
                }
                Objeto.close();
                Entrada.close();
            }
        } catch (Exception e) {
      
        }
    }
    public void EscribirArchivo(){
        FileOutputStream FS = null;
        ObjectOutputStream OS = null;
        try {
            FS = new FileOutputStream(Archivos);
            OS = new ObjectOutputStream(FS);
            for (Usuario Temp : Listausuarios) {
                OS.writeObject(Temp);
            }
            OS.flush();
        } catch (Exception e) {
        } finally {
            try {
                FS.close();
                OS.close();
            } catch (Exception e) {
            }
        }
    }

  
}

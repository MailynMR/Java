package Archivador;

import CapaLogicaNegocios.Direccion;
import java.util.ArrayList;
import java.util.Iterator;

public class ArchivadorDireccionBD {
    
    private static ArrayList<Direccion> arrayCiudades = new ArrayList();
   
    public static void agregarCiudad(Direccion direccion){
        arrayCiudades.add(direccion);
    }
    public static void modificarCiudad(int posicion,Direccion direccion){
          arrayCiudades.set(posicion, direccion);
    }
    public static void eliminarCiudad(String nombreProvincia){       
         for (int i = 0; i < arrayCiudades.size(); i++) {
            if(arrayCiudades.get(i).getProvincia().equals(nombreProvincia))
                arrayCiudades.remove(i);
        }
        
    }
    public static boolean existeCiudad(String nombreProvincia){
        for (Direccion direccion : arrayCiudades) {
            if(direccion.getProvincia().equalsIgnoreCase(nombreProvincia))
                return true;
        }
        return false;
    }
     
    public static int posicionCiudad(String nombreDireccion){
        for (int i = 0; i < arrayCiudades.size(); i++) {
            if(arrayCiudades.get(i).getProvincia().equalsIgnoreCase(nombreDireccion))
                return i;
        }
        return -1;
    }


    public static ArrayList<Direccion> getArrayCiudades() {
        return arrayCiudades;
    }
    
    public static String listaCiudades(){
        String hilera="";
        Iterator iter = arrayCiudades.iterator();
        while(iter.hasNext()){
            hilera+=iter.next();
        }
        return hilera;
    }
    
    
}

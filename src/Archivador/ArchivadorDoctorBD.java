package Archivador;

import CapaLogicaNegocios.ClaseDoctor;
import CapaLogicaNegocios.Direccion;
import java.util.ArrayList;
import java.util.Iterator;

public class ArchivadorDoctorBD {
    
    
     private static ArrayList<ClaseDoctor> arrayDoctor = new ArrayList();
   
    public static void agrega(ClaseDoctor doctor){
        arrayDoctor.add(doctor);
    }
    
    
    public static void modificar(int posicion,ClaseDoctor doctor){
          arrayDoctor.set(posicion, doctor);
    }
    public static void eliminar(String nombreDoctor){       
         for (int i = 0; i < arrayDoctor.size(); i++) {
            if(arrayDoctor.get(i).getProvincia().equals(nombreDoctor))
                arrayDoctor.remove(i);
        }
        
    }
    public static boolean existe(String nombreProvincia){
        for (Direccion direccion : arrayCiudades) {
            if(direccion.getProvincia().equalsIgnoreCase(nombreProvincia))
                return true;
        }
        return false;
    }
     
    public static int posicion(String nombreDireccion){
        for (int i = 0; i < arrayCiudades.size(); i++) {
            if(arrayCiudades.get(i).getProvincia().equalsIgnoreCase(nombreDireccion))
                return i;
        }
        return -1;
    }


//    public static ArrayList<Direccion> getArrayCiudades() {
//        return arrayCiudades;
//    }
//    

    public static ArrayList<Direccion> getArrayCiudades() {
        return arrayCiudades;
    }
    
    
    
    public static String lista(){
        String hilera="";
        Iterator iter = arrayCiudades.iterator();
        while(iter.hasNext()){
            hilera+=iter.next();
        }
        return hilera;
    }
}

    
    
}

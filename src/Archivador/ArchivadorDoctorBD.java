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
            if(arrayDoctor.get(i).getNombre().equals(nombreDoctor))
                arrayDoctor.remove(i);
        }
        
    }
    public static boolean existe(String nombreDoctor){
        for (ClaseDoctor doctor : arrayDoctor) {
            if(doctor.getNombre().equalsIgnoreCase(nombreDoctor))
                return true;
        }
        return false;
    }
     
    public static int posicion(String nombreDoctor){
        for (int i = 0; i < arrayDoctor.size(); i++) {
            if(arrayDoctor.get(i).getNombre().equalsIgnoreCase(nombreDoctor))
                return i;
        }
        return -1;
    }


    public static ArrayList<ClaseDoctor> getArrayCiudades() {
        return arrayDoctor;
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

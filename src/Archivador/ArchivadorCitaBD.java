
package Archivador;

import CapaLogicaNegocios.ClaseDoctor;
import CapaLogicaNegocios.ClaseCitas;
import CapaLogicaNegocios.Direccion;
import java.util.ArrayList;
import java.util.Iterator;

public class ArchivadorCitaBD {
     private static ArrayList<ClaseCitas> arrayCita = new ArrayList();
   
    public static void agrega(ClaseCitas doctor){
        arrayCita.add(doctor);
    }
    
    
    public static void modificar(int posicion,ClaseCitas doctor){
          arrayCita.set(posicion, doctor);
    }
    public static void eliminar(String nombreCita){       
         for (int i = 0; i < arrayCita.size(); i++) {
            if(arrayCita.get(i).getNumeroCita().equals(nombreCita))
                arrayCita.remove(i);
        }
        
    }
    public static boolean existe(String nombreProvincia){
        for (ClaseCitas cita : arrayCita) {
            if(cita.getNumeroCita().equalsIgnoreCase(nombreProvincia))
                return true;
        }
        return false;
    }
     
    public static int posicion(String nombreDireccion){
        for (int i = 0; i < arrayCita.size(); i++) {
            if(arrayCita.get(i).getNumeroCita().equalsIgnoreCase(nombreDireccion))
                return i;
        }
        return -1;
    }


    public static ArrayList<ClaseCitas> getArrayCita() {
        return arrayCita;
    }
    
    public static String lista(){
        String hilera="";
        Iterator iter = arrayCita.iterator();
        while(iter.hasNext()){
            hilera+=iter.next();
        }
        return hilera;
    }
}

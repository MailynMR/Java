package Archivador;

import CapaLogicaNegocios.UsuariosLogin;
import java.util.ArrayList;
import java.util.Iterator;


public class ArchivadorUsuario {
  private static ArrayList<UsuariosLogin> arrayUsuario = new ArrayList();    

    public static void agregarUsuario(UsuariosLogin usuario){
        arrayUsuario.add(usuario);
    }
    public static void modificarUsuario(int posicion,UsuariosLogin usuario){
          arrayUsuario.set(posicion, usuario);
    }
    public static void eliminarUsuario(String codigo){       
         for (int i = 0; i < arrayUsuario.size(); i++) {
            if(arrayUsuario.get(i).getCodigo().equals(codigo))
                arrayUsuario.remove(i);
        }
        
    }
    public static boolean existeUsuario(String codigo){
        for (UsuariosLogin usuario : arrayUsuario) {
            if(usuario.getCodigo().equalsIgnoreCase(codigo))
                return true;
        }
        return false;
    }
    
    public static int posicionUsuario(String codigo){
        for (int i = 0; i < arrayUsuario.size(); i++) {
            if(arrayUsuario.get(i).getCodigo().equalsIgnoreCase(codigo))
                return i;
        }
        return -1;
    }


    public static ArrayList<UsuariosLogin> getArrayUsuario() {
        return arrayUsuario;
    }
    
    public static String listaUsuario(){
        String hilera="";
        Iterator iter = arrayUsuario.iterator();
        while(iter.hasNext()){
            hilera+=iter.next();
        }
        return hilera;
    }
    
    
    
}

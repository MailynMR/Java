
package PersistenciaNueva;

import CapaLogicaNegocios.ClaseEspecialidades;
import CapaLogicaNegocios.ClasedeMantenimientoCliente;
import CapaLogicaNegocios.MantenimientodeEspecialidadesMédicas;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import persistenciadeDatos.MiObjectOutputStream;

/**
 *
 * @author Mailyn Madrigal
 */
public class PersistenciaMantenimientoCliente {
    private final String RUTA_ARCHIVO =
            System.getProperty("user.dir") + "\\src\\Archivo\\Mantenimiento.txt";
  
    
    //Objeto para abrir archivo y grabar 
    private ObjectOutputStream oEscritor;
    private ObjectInputStream oLector;
    
    //para la entrada y salida de archivos, donde estan guardados
    private FileInputStream archivoEntrada;
    private FileOutputStream archivoSalida;
    
    
    private ArrayList<ClasedeMantenimientoCliente> arrayMantenimiento;
    
    //Instancia privada de la misma clase
    //implementa el patrón Singleton
    private static  PersistenciaMantenimientoCliente instance= null;
   
    //Constructor privado, se implementa el patrón Singleton

    public PersistenciaMantenimientoCliente() {
    }
    
    
    //Método público que retorna una única instancia de la 
    //clase, únicamnete se construye la primera vez.

    public static PersistenciaMantenimientoCliente getInstance() {
        if (instance == null) {
            instance = new PersistenciaMantenimientoCliente();
        }
        return instance;
    }
    
    
    
    
    
    //OJO este tipo de comentario gernera la ayuda del metodo
    /**
     * Abre y retorna el archivo de datos, para escritura (de tipo output) al final del archivo
     * Tipo de Archivo: Secuencial.
     * Lanza la Exception al nivel donde fue llamado
     * @return void
     */
    public void abrirArchivoOutput() throws Exception {
        //Abrir el archivo
        try{
        File oArchivo = new File(RUTA_ARCHIVO);
           if(!oArchivo.exists()){
             //Abrir el archivo de Acceso Secuencial para  escritura
             //La primera vez incluye la cabecera del archivo
             //true indica que se agregarán registros al final            
             archivoSalida = new FileOutputStream(RUTA_ARCHIVO,true);
             oEscritor = new ObjectOutputStream(archivoSalida);            
           }
           else{
             //Abrir el archivo de Acceso Secuencial para  escritura
             //La primera vez incluye la cabecera del archivo
              archivoSalida = new FileOutputStream(RUTA_ARCHIVO,true);
              oEscritor = new MiObjectOutputStream(archivoSalida);
           }  
        }catch(Exception e){
            throw e;
        }        
    }

    
    public  void abrirArchivoInput() throws Exception {    
      //Abrir el archivo
      try{    
        archivoEntrada = new FileInputStream(RUTA_ARCHIVO);
        oLector = new ObjectInputStream(archivoEntrada);
      }
      catch(Exception e){
         throw e;
      }      
    }

    /**
     * Permite cerrar el archivo de datos que se abrió de salida
    */
    public  void cerrarArchivoOutput() throws Exception { 
        try{
          if (oEscritor != null) {
            oEscritor.close();
            oEscritor = null;
          }  
        }
        catch(Exception e){
           throw e;
        }
    }

    private void cerrarArchivoInput() throws Exception {
        try{     
             if (oLector != null) {
                oLector.close();
                oLector = null;
             }
        }
        catch(Exception e){
           throw e;
        }
    }


    /**
     * Lista de todos los Departamentos que se encuentran en el archivo
     * @return ArrayList
     */
     public ArrayList<ClasedeMantenimientoCliente> listaMantenimiento() throws Exception{
         ArrayList arrayMantenimiento = new ArrayList();
         //Ya que habrá bloque finally se debe encerrar el bloque try
         //el throws del encabezado lanza la excepción del finally      
         try {
             abrirArchivoInput();
             //Si no hay más datos que leer el método available retorna cero
             while (true) {
                 ClasedeMantenimientoCliente man
                         = (ClasedeMantenimientoCliente) oLector.readObject();
                 arrayMantenimiento.add(man);
             }
         } //No se indica el catch ya que no se hará nada, solamente se lanzará por medio del throws  
         catch (Exception ex) {

         }
        finally{
           //Ocurra o no ocurra la excepción se cierra el archivo
           cerrarArchivoInput();   
           return arrayMantenimiento;
        } 
    }

   //Busca y retorna el objeto Departamento de acuerdo al código que recibe como 
   //parámetro, en caso de que no lo encuentre retorna null
public ClasedeMantenimientoCliente consultarMantenimientoCliente(String identificador)throws Exception {
        ClasedeMantenimientoCliente mantenimiento;
        ClasedeMantenimientoCliente mantenimientoBuscado = null;
        try {
            abrirArchivoInput();
            //Si no hay más datos que leer el método available retorna cero
             while(true){
                mantenimiento = (ClasedeMantenimientoCliente)oLector.readObject();               
                if(mantenimiento.getIdentificador().equalsIgnoreCase(identificador)) {
                } else {
                    mantenimientoBuscado = mantenimiento;
                }
             }            
        }catch(Exception e){
            //no se pone nada
        }
        finally{ //Suceda o no suceda la excepción se deben cerrar los archivos
             cerrarArchivoInput();    
             return mantenimientoBuscado;
        }       
    }


    /**
     * Agregar un nuevo MantenimientodeEspecialidadesMédicas al final del archivo
     * @param mantenimiento Objeto MantenimientodeEspecialidadesMédicas a agregar
     * @return void
     */
    public  void agregarMantenimientoCliente(ClasedeMantenimientoCliente mantenimiento)throws Exception {        
        try {
            this.abrirArchivoOutput();
            if (oEscritor != null) {
              //Ejecutar la escritura del objeto pDepartamento en el archivo
               oEscritor.writeObject(mantenimiento);
               oEscritor.flush();  //Envía el contenido del buffer al archivo
               oEscritor.reset();//Se requiere para cuando se reciben subclases de Departamento
            }
        
        } catch (Exception e) {
            throw e;
        }
        finally{
            //Ocurra o no la excepción se debe cerrar el archivo
            this.cerrarArchivoOutput(); //Cierra el archivo
        }
        
    }

    /**
     * Agregar un nuevo Departamento al archivo
     * @param departamento Objeto Departamento a agregar
     * @return void
     */
      public void modificarMantenientoCliente(ClasedeMantenimientoCliente man) throws Exception{
        arrayMantenimiento = new ArrayList<ClasedeMantenimientoCliente>();
        try {            
            abrirArchivoInput();            
             //Pasar todos los objetos del archivo al ArrayList temporal modificando el 
            //objeto que se recibe como parámetro de acuerdo al código
             ClasedeMantenimientoCliente mantenimiento1=null;
            //Si no hay más datos que leer el método available retorna cero
             while(true){//Si va a leer y no hay objeto Departamento se va por el catch
                 mantenimiento1 = (ClasedeMantenimientoCliente) oLector.readObject(); 
                 if(mantenimiento1.getIdentificador().equalsIgnoreCase(man.getIdentificador())) {
                  mantenimiento1=man;
                 }
                 arrayMantenimiento.add(mantenimiento1);
             }  
        }
        catch(Exception ex){
            
        }
        finally{
            cerrarArchivoInput();
            pasarArrayTemporal_Archivo();        
        }
        
    }
    
    
    
    public void eliminarMantenimientoEspec(String identificador) throws Exception {
        arrayMantenimiento = new ArrayList<ClasedeMantenimientoCliente>();
        try {            
            abrirArchivoInput();
            ClasedeMantenimientoCliente mante = null;
            //Pasa al ArrayList temporal todos los departamentos cuyo código es 
            //diferente al del departamento que se recibe como parámetro
            while(true){
                 mante =  (ClasedeMantenimientoCliente) oLector.readObject();               
                 if(!mante.getIdentificador().equalsIgnoreCase(identificador)) {
                     arrayMantenimiento.add(mante);
                 }
             }                       
        }
        catch(Exception e){   
        }
        finally{
            cerrarArchivoInput();
            pasarArrayTemporal_Archivo(); 
        }               
    }
    

    private void pasarArrayTemporal_Archivo() throws Exception {       
       File archivoOriginal = new File(RUTA_ARCHIVO);
       //Si hay departamentos en el ArrayList y el archivo existe
       //borra el archivo original para volverlo a llenar           
       
          if(archivoOriginal.exists()){
            archivoOriginal.delete();
          }  
          if(!arrayMantenimiento.isEmpty()){
             abrirArchivoOutput();
          //Pasa todos los departamentos del ArrayList al archivo
            for (ClasedeMantenimientoCliente mantenimiento : arrayMantenimiento) {
             oEscritor.writeObject(mantenimiento);       
            }     
          }
          cerrarArchivoOutput();
    }  
}



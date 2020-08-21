/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenciadeDatos;


import CapaLogicaNegocios.MantenimientoEspecialidades;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Mailyn Madrigal
 */
public class EspecialidadesDB {
     private final String RUTA_ARCHIVO = System.getProperty("user.dir")+ "\\src\\Archivo\\Especialidades.txt";
    private ObjectOutputStream oEscritor;
    private ObjectInputStream oLector;
    private FileInputStream archivoEntrada;
    private FileOutputStream archivoSalida;
    private ArrayList<MantenimientoEspecialidades> arrayEspecialidades;
    
    //Instancia privada de la misma clase
    //implementa el patrón Singleton
    private static  EspecialidadesDB instance= null;
   
    //Constructor privado, se implementa el patrón Singleton

    public EspecialidadesDB() {
    }
    
    
    //Método público que retorna una única instancia de la 
    //clase, únicamnete se construye la primera vez.
    public static EspecialidadesDB getInstance(){
        if(instance == null){
            instance = new  EspecialidadesDB();
        }
        return instance;
    }
    
    
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
     public ArrayList<MantenimientoEspecialidades> listaEspecialidades() throws Exception{
        ArrayList arrayCiudades= new ArrayList();
        //Ya que habrá bloque finally se debe encerrar el bloque try
        //el throws del encabezado lanza la excepción del finally      
      try {         
            abrirArchivoInput();
             //Si no hay más datos que leer el método available retorna cero
            while(true){
                MantenimientoEspecialidades especialidad1 = 
                           (MantenimientoEspecialidades)oLector.readObject();                  
                arrayCiudades.add(especialidad1);
            }
         } //No se indica el catch ya que no se hará nada, solamente se lanzará por medio del throws   //No se indica el catch ya que no se hará nada, solamente se lanzará por medio del throws  
        catch(Exception ex ){
            
       }
        finally{
           //Ocurra o no ocurra la excepción se cierra el archivo
           cerrarArchivoInput();   
           return arrayCiudades;
        } 
       
        
    }

   //Busca y retorna el objeto Departamento de acuerdo al código que recibe como 
   //parámetro, en caso de que no lo encuentre retorna null
    public MantenimientoEspecialidades consultarEspecialidad(String codigoEspecialidad)throws Exception {
        MantenimientoEspecialidades especialidad;
        MantenimientoEspecialidades especialidadbuscada = null;
        try {
            abrirArchivoInput();
            //Si no hay más datos que leer el método available retorna cero
             while(true){
                especialidad = (MantenimientoEspecialidades)oLector.readObject();               
                if(especialidad.getCodigo().equalsIgnoreCase(codigoEspecialidad)) {
                    especialidadbuscada = especialidad;
                }
             }            
        }catch(Exception e){
            
        }
        finally{ //Suceda o no suceda la excepción se deben cerrar los archivos
             cerrarArchivoInput();    
             return especialidadbuscada;
        }       
    }


    /**
     * Agregar un nuevo Departamento al final del archivo
     * @param departamento Objeto Departamento a agregar
     * @return void
     */
    public  void agregarEspecialidad(MantenimientoEspecialidades especialidad)throws Exception {        
        try {
            this.abrirArchivoOutput();
            if (oEscritor != null) {
              //Ejecutar la escritura del objeto pDepartamento en el archivo
               oEscritor.writeObject(especialidad);
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
      public void modificarEspecialidad(MantenimientoEspecialidades especialidad) throws Exception{
        arrayEspecialidades = new ArrayList<MantenimientoEspecialidades>();
        try {            
            abrirArchivoInput();            
             //Pasar todos los objetos del archivo al ArrayList temporal modificando el 
            //objeto que se recibe como parámetro de acuerdo al código
             MantenimientoEspecialidades especialidad1=null;
            //Si no hay más datos que leer el método available retorna cero
             while(true){//Si va a leer y no hay objeto Departamento se va por el catch
                 especialidad1 = (MantenimientoEspecialidades)oLector.readObject(); 
                 if(especialidad1.getCodigo().equalsIgnoreCase(especialidad.getCodigo())) {
                  especialidad1=especialidad;
                 }
                 arrayEspecialidades.add(especialidad1);
             }  
        }
        catch(Exception ex){
            
        }
        finally{
            cerrarArchivoInput();
            pasarArrayTemporal_Archivo();        
        }
        
    }
    
    
    
    public void eliminarEspecialidad(String codigoEspecialidad) throws Exception {
        arrayEspecialidades = new ArrayList<MantenimientoEspecialidades>();
        try {            
            abrirArchivoInput();
            MantenimientoEspecialidades especialidad1 = null;
            //Pasa al ArrayList temporal todos las ciudades cuyo código es 
            //diferente al del codigo de ciudad  que se recibe como parámetro
            while(true){
                 especialidad1 = (MantenimientoEspecialidades)oLector.readObject();               
                 if(!especialidad1.getCodigo().equalsIgnoreCase(codigoEspecialidad)) {
                     arrayEspecialidades.add(especialidad1);
                 }
             }                       
        }catch(Exception e){      
           
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
          if(!arrayEspecialidades.isEmpty()){
             abrirArchivoOutput();
          //Pasa todos los departamentos del ArrayList al archivo
            for (MantenimientoEspecialidades ciudad : arrayEspecialidades) {
             oEscritor.writeObject(ciudad);       
            }     
          }
          cerrarArchivoOutput();
    } 
   
}

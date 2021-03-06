
package persistenciadeDatos;

import CapaLogicaNegocios.MantenimientodeEspecialidadesMédicas;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Catalogo_Especialidades_Medica {
    private final String RUTA_ARCHIVO =
            System.getProperty("user.dir")+
            "\\src\\Archivo\\Catalogo_Especialidades_Medica.txt";
  
    
    //Objeto para abrir archivo y grabar 
    private ObjectOutputStream oEscritor;
    private ObjectInputStream oLector;
    
    //para la entrada y salida de archivos, donde estan guardados
    private FileInputStream archivoEntrada;
    private FileOutputStream archivoSalida;
    
    
    private ArrayList<MantenimientodeEspecialidadesMédicas> arrayMantenimientodeEspecialidadesMédicas;
    
    //Instancia privada de la misma clase
    //implementa el patrón Singleton
    private static  Catalogo_Especialidades_Medica instance= null;
   
    //Constructor privado, se implementa el patrón Singleton
    public Catalogo_Especialidades_Medica() {
    }
    
    //Método público que retorna una única instancia de la 
    //clase, únicamnete se construye la primera vez.
    public static Catalogo_Especialidades_Medica getInstance(){
        if(instance == null){
            instance = new  Catalogo_Especialidades_Medica();
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
     public ArrayList<MantenimientodeEspecialidadesMédicas> listaEspecialidadesMédicas() throws Exception{
        ArrayList listaMantenimiento= new ArrayList();
        //Ya que habrá bloque finally se debe encerrar el bloque try
        //el throws del encabezado lanza la excepción del finally      
      try {          
            abrirArchivoInput();
             //Si no hay más datos que leer el método available retorna cero
            while(true){
                MantenimientodeEspecialidadesMédicas mantenimiento = 
                           (MantenimientodeEspecialidadesMédicas)oLector.readObject();                  
                listaMantenimiento.add(mantenimiento);
            }
         } //No se indica el catch ya que no se hará nada, solamente se lanzará por medio del throws  
        catch(Exception ex ){
            
       }
        finally{
           //Ocurra o no ocurra la excepción se cierra el archivo
           cerrarArchivoInput();   
           return listaMantenimiento;
        } 
    }

   //Busca y retorna el objeto Departamento de acuerdo al código que recibe como 
   //parámetro, en caso de que no lo encuentre retorna null
    public MantenimientodeEspecialidadesMédicas consultarMantenimiento(String identificador)throws Exception {
        MantenimientodeEspecialidadesMédicas mantenimiento,mantenimientoBuscado= null ;
        try {
            abrirArchivoInput();
            //Si no hay más datos que leer el método available retorna cero
             while(true){
                mantenimiento = (MantenimientodeEspecialidadesMédicas)oLector.readObject();               
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
    public  void agregarMantenimientoEsp(MantenimientodeEspecialidadesMédicas mantenimiento)throws Exception {        
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
      public void modificarMantenimientoEspecialidad(MantenimientodeEspecialidadesMédicas mantenimiento) throws Exception{
        arrayMantenimientodeEspecialidadesMédicas= new ArrayList<MantenimientodeEspecialidadesMédicas>();
        try {            
            abrirArchivoInput();            
             //Pasar todos los objetos del archivo al ArrayList temporal modificando el 
            //objeto que se recibe como parámetro de acuerdo al código
             MantenimientodeEspecialidadesMédicas mantenimiento1=null;
            //Si no hay más datos que leer el método available retorna cero
             while(true){//Si va a leer y no hay objeto Departamento se va por el catch
                 mantenimiento1 = (MantenimientodeEspecialidadesMédicas)oLector.readObject(); 
                 if(mantenimiento1.getIdentificador().equalsIgnoreCase(mantenimiento1.getIdentificador())) {
                   mantenimiento1=mantenimiento;
                 }
                 arrayMantenimientodeEspecialidadesMédicas.add(mantenimiento1);
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
        arrayMantenimientodeEspecialidadesMédicas = new ArrayList<MantenimientodeEspecialidadesMédicas>();
        try {            
            abrirArchivoInput();
            MantenimientodeEspecialidadesMédicas mantenimiento1 = null;
            //Pasa al ArrayList temporal todos los departamentos cuyo código es 
            //diferente al del departamento que se recibe como parámetro
            while(true){
                 mantenimiento1 = (MantenimientodeEspecialidadesMédicas)oLector.readObject();               
                 if(!mantenimiento1.getIdentificador().equalsIgnoreCase(identificador)) {
                     arrayMantenimientodeEspecialidadesMédicas.add(mantenimiento1);
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
          if(!arrayMantenimientodeEspecialidadesMédicas.isEmpty()){
             abrirArchivoOutput();
          //Pasa todos los departamentos del ArrayList al archivo
            for (MantenimientodeEspecialidadesMédicas mantenimiento : arrayMantenimientodeEspecialidadesMédicas) {
             oEscritor.writeObject(mantenimiento);       
            }     
          }
          cerrarArchivoOutput();
    }  
}

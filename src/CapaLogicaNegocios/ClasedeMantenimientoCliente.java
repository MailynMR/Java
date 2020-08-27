package CapaLogicaNegocios;

import PersistenciaNueva.PersistenciaMantenimientoCliente;
import java.io.Serializable;
import java.util.ArrayList;
import persistenciadeDatos.Catalogo_Especialidades_Medica;

public class ClasedeMantenimientoCliente implements Serializable {
    //es para ser almacenada en el archivo en bits
    //asi se puede volver a cargar

    String identificador;
    int DOC_id; //Validarse que sea unico
    String nombre;
    String apellido;
    int telefonoHabitacion;
    int telefonoOficina;
    int telefonoCelular;
    String direccion; // con el enum
    // esta debe guardarse en el txt 
    // de “Distribución_Territorial_Costa_Rica.txt
    // debe indicar provincia,canton,distrito,señas
    String profesion;
    String nivelEscolaridad;
    int sueldo;
    
    public ClasedeMantenimientoCliente(int sueldo,String nivelEscolaridad,String profesion, int DOC_id, String nombre, String apellido, int telefonoHabitacion, int telefonoOficina, int telefonoCelular, String direccion) {
        this.sueldo= sueldo;
        this.nivelEscolaridad=nivelEscolaridad;
        this.profesion=profesion;
        identificador+=1;
        this.DOC_id = DOC_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefonoHabitacion = telefonoHabitacion;
        this.telefonoOficina = telefonoOficina;
        this.telefonoCelular = telefonoCelular;
        this.direccion = direccion;
    }

    public String toString() {
    String hilera= "";
    hilera = "Nombre: "+ getNombre() +
             "\nApellido: " + getApellido()+
             "\nTelefono habitación: "+ getTelefonoHabitacion() +
             "\nTelefono Oficina: "+getTelefonoOficina()+
             "\nTelefono celular: " + getTelefonoCelular()+
             "\nDirección:" +getDireccion();
    return hilera;
    }
//      70 17 68 31 domination

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getNivelEscolaridad() {
        return nivelEscolaridad;
    }

    public void setNivelEscolaridad(String nivelEscolaridad) {
        this.nivelEscolaridad = nivelEscolaridad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getDOC_id() {
        return DOC_id;
    }

    public void setDOC_id(int DOC_id) {
        this.DOC_id = DOC_id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefonoHabitacion() {
        return telefonoHabitacion;
    }

    public void setTelefonoHabitacion(int telefonoHabitacion) {
        this.telefonoHabitacion = telefonoHabitacion;
    }

    public int getTelefonoOficina() {
        return telefonoOficina;
    }

    public void setTelefonoOficina(int telefonoOficina) {
        this.telefonoOficina = telefonoOficina;
    }

    public int getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(int telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static ClasedeMantenimientoCliente consultarMantenimientoCliente(String codigo) throws Exception {
    return PersistenciaMantenimientoCliente.getInstance().consultarMantenimientoCliente(codigo);
    }

    public static void agregarMantenimientoCliente(ClasedeMantenimientoCliente mantenimiento) throws Exception {
        PersistenciaMantenimientoCliente.getInstance().agregarMantenimientoCliente(mantenimiento);
    }

    public static void eliminarMantenimientoEspec(String codigo) throws Exception {
        PersistenciaMantenimientoCliente.getInstance().eliminarMantenimientoEspec(codigo);
    }

    public static void modificarMantenientoCliente(ClasedeMantenimientoCliente mante) throws Exception {
        PersistenciaMantenimientoCliente.getInstance().modificarMantenientoCliente(mante);
    }

    public static ArrayList<ClasedeMantenimientoCliente> arrayMantenimiento() throws Exception {
        return PersistenciaMantenimientoCliente.getInstance().listaMantenimiento();
    }
    
    

}

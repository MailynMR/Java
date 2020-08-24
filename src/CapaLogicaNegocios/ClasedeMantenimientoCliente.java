package CapaLogicaNegocios;

import java.io.Serializable;
import java.util.ArrayList;
import persistenciadeDatos.Catalogo_Especialidades_Medica;

public class ClasedeMantenimientoCliente implements Serializable {

//    private static Object getInstance() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    //es para ser almacenada en el archivo en bits
    //asi se puede volver a cargar

    String identificador;
    int identificacion; //Validarse que sea unico
    String nombre;
    String apellido;
    int telefonoHabitacion;
    int telefonoOficina;
    int telefonoCelular;
    String direccion; // con el enum
    // esta debe guardarse en el txt 
    // de “Distribución_Territorial_Costa_Rica.txt
    // debe indicar provincia,canton,distrito,señas

    public ClasedeMantenimientoCliente(int identificacion, String nombre, String apellido, int telefonoHabitacion, int telefonoOficina, int telefonoCelular, String direccion) {
        this.identificacion += identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefonoHabitacion = telefonoHabitacion;
        this.telefonoOficina = telefonoOficina;
        this.telefonoCelular = telefonoCelular;
        this.direccion = direccion;
    }

    public String toString() {
        return this.getIdentificacion() + " " + this.getNombre();
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
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
        return PersistensiaManconsultarMantenimientoCliente.getInstance().consultarMantenimiento(codigo);
    }

    public static void agregarMantenimiento(ClasedeMantenimientoCliente mantenimiento) throws Exception {
        Catalogo_Especialidades_Medica.getInstance().agregarMantenimientoEsp(mantenimiento);
    }

    public static void eliminarMantenimiento(String codigo) throws Exception {
        Catalogo_Especialidades_Medica.getInstance().eliminarMantenimientoEspec(codigo);
    }

    public static void modificarDepartamento(ClasedeMantenimientoCliente mante) throws Exception {
        Catalogo_Especialidades_Medica.getInstance().modificarMantenimientoEspecialidad(mante);
    }

    public static ArrayList<ClasedeMantenimientoCliente> listadoDepartamentos() throws Exception {
        return Catalogo_Especialidades_Medica.getInstance().listaEspecialidadesMédicas();
    }

}

package CapaLogicaNegocios;


public class ClaseDoctor {
    
    String identificador; //SE DA
    int id; //Validarse que sea unico
    String nombre;
    String apellido;
    int telefonoHabitacion;
    int telefonoOficina;
    int telefonoCelular;
    String direccion; 
    //SE DEBEN CARGAR LOS DATOS DEL TXT
    // Distribución_Territorial_Costa_Rica.txt”

    public ClaseDoctor( String identificador,int id, String nombre, String apellido, int telefonoHabitacion, int telefonoOficina, int telefonoCelular, String direccion) {
        this.identificador=identificador;
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefonoHabitacion = telefonoHabitacion;
        this.telefonoOficina = telefonoOficina;
        this.telefonoCelular = telefonoCelular;
        this.direccion = direccion;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
    
    
    
    
    
}

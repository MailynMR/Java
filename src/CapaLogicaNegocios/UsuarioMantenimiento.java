
package CapaLogicaNegocios;

public class UsuarioMantenimiento {
    //es donde queda el registro de las personas 
    
    //*registrar *actualizar *eliminar
int identificador ;
String nombreCompleto;
String apellidos;
int cedula; 
int telefonCcasa;
int telefonoOficina ;
int telefonoCelular;

    public UsuarioMantenimiento(int identificador, String nombreCompleto, String apellidos, int cedula, int telefonCcasa, int telefonoOficina, int telefonoCelular) {
        this.identificador = identificador;
        this.nombreCompleto = nombreCompleto;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.telefonCcasa = telefonCcasa;
        this.telefonoOficina = telefonoOficina;
        this.telefonoCelular = telefonoCelular;
    }
    
    
    
    

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefonCcasa() {
        return telefonCcasa;
    }

    public void setTelefonCcasa(int telefonCcasa) {
        this.telefonCcasa = telefonCcasa;
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
    
    
    
    
}

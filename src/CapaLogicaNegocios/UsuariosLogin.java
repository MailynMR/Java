
package CapaLogicaNegocios;

import java.util.Iterator;


public class UsuariosLogin {
    private String Codigo;
    private String Nombre;
    private String Contrasena;
    private String RolUsuario;
    private String EstadoUsuario;

     public UsuariosLogin() {
    }

    public UsuariosLogin(String Codigo, String Nombre, String Contrasena, String RolUsuario, String EstadoUsuario) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Contrasena = Contrasena;
        this.RolUsuario = RolUsuario;
        this.EstadoUsuario = EstadoUsuario;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getRolUsuario() {
        return RolUsuario;
    }

    public void setRolUsuario(String RolUsuario) {
        this.RolUsuario = RolUsuario;
    }

    public String getEstadoUsuario() {
        return EstadoUsuario;
    }

    public void setEstadoUsuario(String EstadoUsuario) {
        this.EstadoUsuario = EstadoUsuario;
    }
   
     
 
}
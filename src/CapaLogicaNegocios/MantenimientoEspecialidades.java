
package CapaLogicaNegocios;

import java.io.Serializable;
import java.util.ArrayList;
import persistenciadeDatos.EspecialidadesDB;

public class MantenimientoEspecialidades  implements Serializable{
    
    String codigo;
    String doctor;
    String especialidad;

    public MantenimientoEspecialidades(String codigo, String doctor, String especialidad) {
        this.codigo = codigo;
        this.doctor = doctor;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "MantenimientoEspecialidades"+"\n"
                + "El codigo " + codigo 
                + "El doctor " + doctor +
                " de la especialidad " + especialidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
        
public static MantenimientoEspecialidades consultaEspecialidades(String codigo) throws Exception{
 return EspecialidadesDB.getInstance().consultarEspecialidad(codigo);
 }
 public static void agregarEspecialidad(EspecialidadesDB especialidad1) throws Exception{
 EspecialidadesDB.getInstance().agregarEspecialidad(especialidad1);
 }
 public static void eliminarCiudad(String codigo) throws Exception{
     EspecialidadesDB.getInstance().eliminarEspecialidad(codigo);
}            
 public static void modificarCiudad(EspecialidadesDB especialidad1) throws Exception{
 EspecialidadesDB.getInstance().modificarEspecialidad(especialidad1);
 }
 public static ArrayList<MantenimientoEspecialidades> arrayEspecialidad() throws Exception{
 return EspecialidadesDB.getInstance().listaEspecialidades();
 }
}
    
}

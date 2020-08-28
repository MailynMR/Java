
package CapaLogicaNegocios;

import java.io.Serializable;
import java.util.ArrayList;
import Archivador.ArchivadorEspecialidadBD;

public class ClaseEspecialidades  implements Serializable{
    
    String codigo;
    String doctor;
    String especialidad;

    public ClaseEspecialidades(String codigo, String doctor, String especialidad) {
        this.codigo += codigo;
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
    
        
    public static ClaseEspecialidades consultaEspecialidades(String codigo) throws Exception {
        return ArchivadorEspecialidadBD.getInstance().consultarEspecialidad(codigo);
    }

    public static void agregarEspecialidad(ClaseEspecialidades especialidad1) throws Exception {
        ArchivadorEspecialidadBD.getInstance().agregarEspecialidad(especialidad1);
    }

    public static void eliminarEspecialidad(String codigo) throws Exception {
        ArchivadorEspecialidadBD.getInstance().eliminarEspecialidad(codigo);
    }

    public static void modificarEspecialiadad(ClaseEspecialidades especialidad1) throws Exception {
        ArchivadorEspecialidadBD.getInstance().modificarEspecialidad(especialidad1);
    }

    public static ArrayList<ClaseEspecialidades> arrayEspecialidad() throws Exception {
        return ArchivadorEspecialidadBD.getInstance().listaEspecialidades();
    }
}
    


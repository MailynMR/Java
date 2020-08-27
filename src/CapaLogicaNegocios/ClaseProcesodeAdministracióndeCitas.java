
package CapaLogicaNegocios;

import PersistenciaNueva.PersistenciaCitas;
import PersistenciaNueva.PersistenciaMantenimientoCliente;
import java.util.ArrayList;

public class ClaseProcesodeAdministracióndeCitas {
    
    String numeroCita;
    ClasedeMantenimientoCliente cliente ;
    int idCliente = cliente.getDOC_id();
    String fecha;
    String hora;
    ClaseMantenimientoEspecialidades especialidad;
    String nombreDoctor= especialidad.getDoctor();

    public ClaseProcesodeAdministracióndeCitas(String numeroCita, ClasedeMantenimientoCliente cliente, String fecha, String hora, ClaseMantenimientoEspecialidades especialidad) {
        this.numeroCita = numeroCita;
        this.cliente = cliente;
        this.fecha = fecha;
        this.hora = hora;
        this.especialidad = especialidad;
    }
    // configuracion de botones

    public static ClaseProcesodeAdministracióndeCitas consultarCita(String codigo) throws Exception {
    return PersistenciaCitas.getInstance().consultarCita(codigo);
    }

    public static void agregarCita(ClaseProcesodeAdministracióndeCitas mantenimiento) throws Exception {
        PersistenciaCitas.getInstance().agregarCita(mantenimiento);
    }

    public static void eliminarCita(String codigo) throws Exception {
        PersistenciaCitas.getInstance().eliminarCita(codigo);
    }

    public static void modificarCita(ClaseProcesodeAdministracióndeCitas cita) throws Exception {
        PersistenciaCitas.getInstance().modificarCita(cita);
    }

    public static ArrayList<ClaseProcesodeAdministracióndeCitas> arrayCita() throws Exception {
        return PersistenciaCitas.getInstance().listaCitas();
    }
    
    public String getNumeroCita() {
        return numeroCita;
    }

    public void setNumeroCita(String numeroCita) {
        this.numeroCita = numeroCita;
    }

    public ClasedeMantenimientoCliente getCliente() {
        return cliente;
    }

    public void setCliente(ClasedeMantenimientoCliente cliente) {
        this.cliente = cliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public ClaseMantenimientoEspecialidades getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(ClaseMantenimientoEspecialidades especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }
    
    
    
}

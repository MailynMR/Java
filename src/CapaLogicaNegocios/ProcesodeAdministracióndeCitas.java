
package CapaLogicaNegocios;

public class ProcesodeAdministracióndeCitas {
    
    int numeroCita;
    ClasedeMantenimientoCliente cliente ;
    int idCliente = cliente.getDOC_id();
    String fecha;
    String hora;
    ClaseMantenimientoEspecialidades especialidad;
    String nombreDoctor= especialidad.getDoctor();

    public ProcesodeAdministracióndeCitas(int numeroCita, ClasedeMantenimientoCliente cliente, String fecha, String hora, ClaseMantenimientoEspecialidades especialidad) {
        this.numeroCita = numeroCita;
        this.cliente = cliente;
        this.fecha = fecha;
        this.hora = hora;
        this.especialidad = especialidad;
    }
    
    
    // configuracion de botones
    
    
    
    
    
    
    
    
    
    

    public int getNumeroCita() {
        return numeroCita;
    }

    public void setNumeroCita(int numeroCita) {
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

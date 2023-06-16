public class empleado {
    String nombreEmpleado;
    String apellidoEmpleado;
    String cedulaEmpleado;
    String cargoEmpleado;
    float sueldoEmpleado;
    String codigoEmpleado;

    public empleado(String nombreEmpleado, String apellidoEmpleado, String cedulaEmpleado, String cargoEmpleado, float sueldoEmpleado, String codigoEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        this.cargoEmpleado = cargoEmpleado;
        this.sueldoEmpleado = sueldoEmpleado;
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public float getSueldoEmpleado() {
        return sueldoEmpleado;
    }

    public void setSueldoEmpleado(float sueldoEmpleado) {
        this.sueldoEmpleado = sueldoEmpleado;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
}


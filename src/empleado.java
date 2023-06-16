public class empleado {
    String nombre_Empleado;
    String apellido_Empleado;
    String cedula_Empleado;
    String cargo_Empleado;
    float sueldo_Empleado;
    String codigo_Empleado;

    public empleado(String nombre_Empleado, String apellido_Empleado, String cedula_Empleado, String cargo_Empleado, float sueldo_Empleado, String codigo_Empleado) {
        this.nombre_Empleado = nombre_Empleado;
        this.apellido_Empleado = apellido_Empleado;
        this.cedula_Empleado = cedula_Empleado;
        this.cargo_Empleado = cargo_Empleado;
        this.sueldo_Empleado = sueldo_Empleado;
        this.codigo_Empleado = codigo_Empleado;
    }

    public String getNombre_Empleado() {
        return nombre_Empleado;
    }

    public void setNombre_Empleado(String nombre_Empleado) {
        this.nombre_Empleado = nombre_Empleado;
    }

    public String getApellido_Empleado() {
        return apellido_Empleado;
    }

    public void setApellido_Empleado(String apellido_Empleado) {
        this.apellido_Empleado = apellido_Empleado;
    }

    public String getCedula_Empleado() {
        return cedula_Empleado;
    }

    public void setCedula_Empleado(String cedula_Empleado) {
        this.cedula_Empleado = cedula_Empleado;
    }

    public String getCargo_Empleado() {
        return cargo_Empleado;
    }

    public void setCargo_Empleado(String cargo_Empleado) {
        this.cargo_Empleado = cargo_Empleado;
    }

    public float getSueldo_Empleado() {
        return sueldo_Empleado;
    }

    public void setSueldo_Empleado(float sueldo_Empleado) {
        this.sueldo_Empleado = sueldo_Empleado;
    }

    public String getCodigo_Empleado() {
        return codigo_Empleado;
    }

    public void setCodigo_Empleado(String codigo_Empleado) {
        this.codigo_Empleado = codigo_Empleado;
    }
}


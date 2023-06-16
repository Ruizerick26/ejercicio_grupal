public class Sempleado extends empleado {

    //Atributos
    private String departamento;
    private String Equipo_C;

    //Constructor


    public Sempleado(String nombre_Empleado, String apellido_Empleado, String cedula_Empleado, String cargo_Empleado, float sueldo_Empleado, String codigo_Empleado, String departamento, String Equipo_C) {
        super(nombre_Empleado, apellido_Empleado, cedula_Empleado, cargo_Empleado, sueldo_Empleado, codigo_Empleado);
        this.departamento = departamento;
        this.Equipo_C = Equipo_C;
    }
    //setter y getters


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEquipo_C() {
        return Equipo_C;
    }

    public void setEquipo_C(String equipo_C) {
        Equipo_C = equipo_C;
    }
}

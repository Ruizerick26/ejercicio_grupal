public class Sempleado extends empleado {

    //Atributos
    private String s_nombre;
    private String s_apellido;
    private int s_edad;

    //Constructor

    public Sempleado(String nombre_Empleado,
                     String apellido_Empleado,
                     String cedula_Empleado,
                     String cargo_Empleado,
                     float sueldo_Empleado,
                     String codigo_Empleado,

                     String s_nombre,
                     String s_apellido,
                     int s_edad) {
        super(nombre_Empleado, apellido_Empleado, cedula_Empleado, cargo_Empleado, sueldo_Empleado, codigo_Empleado);
        this.s_nombre = s_nombre;
        this.s_apellido = s_apellido;
        this.s_edad = s_edad;
    }

    //Setters y Getters

    public String getS_nombre() {
        return s_nombre;
    }

    public void setS_nombre(String s_nombre) {
        this.s_nombre = s_nombre;
    }

    public String getS_apellido() {
        return s_apellido;
    }

    public void setS_apellido(String s_apellido) {
        this.s_apellido = s_apellido;
    }

    public int getS_edad() {
        return s_edad;
    }

    public void setS_edad(int s_edad) {
        this.s_edad = s_edad;
    }
}

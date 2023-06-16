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
                     String nombre,
                     String apellido, int edad)
    {
        super(nombre_Empleado, apellido_Empleado, cedula_Empleado, cargo_Empleado, sueldo_Empleado, codigo_Empleado);
        this.s_nombre = nombre;
        this.s_apellido = apellido;
        this.s_edad = edad;
    }
}

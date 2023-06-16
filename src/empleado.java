//Clase padre empleado
public class empleado {

    /**************************************************************************************************************/
    //Atributos
    private String nombre;
    private String apellido;
    private String cedula;
    private String cargo;
    private float sueldo;

    /**************************************************************************************************************/
    //Constructor
    public empleado(String nombre, String apellido, String cedula, String cargo, float sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.cargo = cargo;
        this.sueldo = sueldo;}

    /**************************************************************************************************************/
    //Getters and Setters de los parametros que aplicaria un empleado

    //Setters y Getters Nombre
    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    //Setters y Getters Apellido
    public String getApellido() {return apellido;}

    public void setApellido(String apellido) {this.apellido = apellido;}

    //Setters y Getters Cedula
    public String getCedula() {return cedula;}

    public void setCedula(String cedula) {this.cedula = cedula;}

    //Setters y Getters Cargo
    public String getCargo() {return cargo;}

    public void setCargo(String cargo) {this.cargo = cargo;}

    //Setters y Getters Sueldo
    public float getSueldo() {return sueldo;}

    public void setSueldo(float sueldo) {this.sueldo = sueldo;}
}

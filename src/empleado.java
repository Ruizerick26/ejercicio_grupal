public class empleado {
    String nombre;
    String apellido;
    String cedula;
    String cargo;
    float sueldo;

    public empleado(String nombre, String apellido, String cedula, String cargo, float sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.cargo = cargo;
        this.sueldo = sueldo;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}

    public void setApellido(String apellido) {this.apellido = apellido;}

    public String getCedula() {return cedula;}

    public void setCedula(String cedula) {this.cedula = cedula;}

    public String getCargo() {return cargo;}

    public void setCargo(String cargo) {this.cargo = cargo;}

    public float getSueldo() {return sueldo;}

    public void setSueldo(float sueldo) {this.sueldo = sueldo;}
}

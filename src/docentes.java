public class docentes extends empleado{
    //parametros
    private double calificar;
    private double rechazar;
    private double aprovar;
    private double deberes;

    public docentes(){
        super();
    }
    //Getters and Setters de los parametros que aplicaria un docentes hacia los estudiantes
    public double getCalificar() {
        return calificar;
    }

    public void setCalificar(double calificar) {
        this.calificar = calificar;
    }

    public double getRechazar() {
        return rechazar;
    }

    public void setRechazar(double rechazar) {
        this.rechazar = rechazar;
    }

    public double getAprovar() {
        return aprovar;
    }

    public void setAprovar(double aprovar) {
        this.aprovar = aprovar;
    }

    public double getDeberes() {
        return deberes;
    }

    public void setDeberes(double deberes) {
        this.deberes = deberes;
    }

//Constructores de los parametros docentes


    public docentes(String nombre_Empleado, String apellido_Empleado, String cedula_Empleado, String cargo_Empleado, float sueldo_Empleado, String codigo_Empleado, double calificar, double rechazar, double aprovar, double deberes) {
        super(nombre_Empleado, apellido_Empleado, cedula_Empleado, cargo_Empleado, sueldo_Empleado, codigo_Empleado);
        this.calificar = calificar;
        this.rechazar = rechazar;
        this.aprovar = aprovar;
        this.deberes = deberes;
    }

    public void Imprimir_docente(){
        System.out.println("Datos del empleado: ");
        System.out.println(getNombre_Empleado());
        System.out.println(getApellido_Empleado());
        System.out.println(getCargo_Empleado());
        System.out.println(getCedula_Empleado());
        System.out.println(getSueldo_Empleado());
        System.out.println(getCalificar());
        System.out.println(getDeberes());
        System.out.println(getAprovar());
        System.out.println(getRechazar());
    }
}

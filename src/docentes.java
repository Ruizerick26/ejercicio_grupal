public class docentes extends empleado{
    //parametros
    public double calificar;
    public double rechazar;
    public double aprovar;
    public double deberes;

    public docentes (){
        super("","","","",0);
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


    public docentes(String nombre, String apellido, String cedula, String cargo, float sueldo, double calificar, double rechazar, double aprovar, double deberes) {
        super(nombre, apellido, cedula, cargo, sueldo);
        this.calificar = calificar;
        this.rechazar = rechazar;
        this.aprovar = aprovar;
        this.deberes = deberes;
    }
}

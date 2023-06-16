//Clase padre Docentes
public class docentes {

    /**************************************************************************************************************/
    //Atributos
    private double calificar;
    private double rechazar;
    private double aprovar;
    private double deberes;

    /**************************************************************************************************************/
    //Getters and Setters de los parametros que aplicaria un docentes hacia los estudiantes

    //Getters y Setters Calificar
    public double getCalificar() {
        return calificar;
    }

    public void setCalificar(double calificar) {
        this.calificar = calificar;
    }

    //Getters y Setters Rechazar
    public double getRechazar() {
        return rechazar;
    }

    public void setRechazar(double rechazar) {
        this.rechazar = rechazar;
    }

    //Getters y Setters Aprovar
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

    /**************************************************************************************************************/
    //Constructores de los parametros docentes
    public docentes(double calificar, double rechazar, double aprovar, double deberes) {
        this.calificar = calificar;
        this.rechazar = rechazar;
        this.aprovar = aprovar;
        this.deberes = deberes;
    }
    /**************************************************************************************************************/
}

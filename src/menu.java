import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        //Arrays de docentes y entidades
        Scanner sc = new Scanner(System.in);
        ArrayList <docentes> profes = new ArrayList<docentes>();
        docentes empleado1 = new docentes();
        docentes empleado2 = new docentes();
        docentes empleado3 = new docentes();

        profes.add(empleado1);
        profes.add(empleado2);
        profes.add(empleado3);

        //Array administrativo y sus entidades
        ArrayList <Adminitrativos> admin = new ArrayList<>();
        Adminitrativos empleado4 = new Adminitrativos();
        Adminitrativos empleado5 = new Adminitrativos();
        admin.add(empleado4);
        admin.add(empleado5);

        //Setters para ingresar de docentes
        System.out.println("Bienvenido, vamos a llenar los datos de los Docentes");
        System.out.println("------------------------------------------------");
        for (docentes profe : profes){
            System.out.print("Ingrese el nombre: ");
            String aux = sc.next();
            profe.setNombre_Empleado(aux);
            System.out.print("Ingrese el apellido: ");
            aux = sc.next();
            profe.setApellido_Empleado(aux);
            System.out.print("Ingrese la cedula: ");
            aux = sc.next();
            profe.setCedula_Empleado(aux);
            System.out.print("Ingrese el cargo del empleado: ");
            aux = sc.next();
            profe.setCargo_Empleado(aux);
            System.out.print("Ingrese el sueldo: ");
            float aux2 = sc.nextFloat();
            profe.setSueldo_Empleado(aux2);
            System.out.print("Ingrese el codigo: ");
            String aux3 = sc.next();
            profe.setCodigo_Empleado(aux3);
            System.out.print("Ingrese cuantos estudiantes aprobaron: ");
            aux2 = sc.nextFloat();
            profe.setAprovar(aux2);
            System.out.println("Ingrese el numero de rechazos");
            aux2 = sc.nextFloat();
            profe.setRechazar(aux2);
            System.out.println("Ingrese la cantidad de calificados:");
            aux2 = sc.nextFloat();
            profe.setCalificar(aux2);
            System.out.println("Ingrese los deberes recibidos:");
            aux2 = sc.nextFloat();
            profe.setDeberes(aux2);
            System.out.println("Siguiente:----------------------");
        }


        //Setters para ingresar de administrativos
        System.out.println("------------------------------------------------");
        System.out.println("Vamos a llenar los datos de los Administrativos");
        System.out.println("------------------------------------------------");
        for (Adminitrativos admini : admin){
            System.out.print("Ingrese el nombre: ");
            String aux = sc.next();
            admini.setNombre_Empleado(aux);
            System.out.print("Ingrese el apellido: ");
            aux = sc.next();
            admini.setApellido_Empleado(aux);
            System.out.print("Ingrese la cedula: ");
            aux = sc.next();
            admini.setCedula_Empleado(aux);
            System.out.print("Ingrese el cargo del empleado: ");
            aux = sc.next();
            admini.setCargo_Empleado(aux);
            System.out.print("Ingrese el sueldo: ");
            float aux2 = sc.nextFloat();
            admini.setSueldo_Empleado(aux2);
            System.out.print("Ingrese el codigo: ");
            aux = sc.next();
            admini.setCodigo_Empleado(aux);
            System.out.print("Ingrese el departamento:");
            aux = sc.next();
            admini.setDepartamento(aux);
            System.out.println("Ingrese el equipo con el que trabaja:");
            aux = sc.next();
            admini.setEquipo_C(aux);
            System.out.println("Siguiente:----------------------");
        }

        empleado1.Imprimir_docente();
        empleado2.Imprimir_docente();
        empleado3.Imprimir_docente();
        empleado4.Imprimir_administrativo();
        empleado5.Imprimir_administrativo();
    }
}

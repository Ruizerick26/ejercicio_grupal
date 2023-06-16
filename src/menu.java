import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        //Arrays de docentes y entidades
        Scanner sc = new Scanner(System.in);
        ArrayList <docentes> profes = new ArrayList<docentes>();
        docentes empleado1 = new docentes("", "", "", "", 0, "", 0, 0, 0, 0);
        docentes empleado2 = new docentes("", "", "", "", 0, "", 0, 0, 0, 0);
        docentes empleado3 = new docentes("", "", "", "", 0, "", 0, 0, 0, 0);

        profes.add(empleado1);
        profes.add(empleado2);
        profes.add(empleado3);

        //Array administrativo y sus entidades
        ArrayList <Sempleado> admin = new ArrayList<>();
        Sempleado empleado4 = new Sempleado("", "", "", "", 0, "", "", "");
        Sempleado empleado5 = new Sempleado("", "", "", "", 0, "", "", "");
        admin.add(empleado4);
        admin.add(empleado5);

        //Setters para ingresar de docentes
        System.out.println("Bienvenido, vamos a llenar los datos de los Docentes");
        System.out.println("------------------------------------------------");
        for (docentes profe : profes){
            System.out.print("Ingrese el nombre: ");
            String aux = sc.nextLine();
            profe.setNombre_Empleado(aux);
            System.out.print("Ingrese el apellido: ");
            aux = sc.nextLine();
            profe.setApellido_Empleado(aux);
            System.out.print("Ingrese la cedula: ");
            aux = sc.nextLine();
            profe.setCedula_Empleado(aux);
            System.out.print("Ingrese el cargo del empleado: ");
            aux = sc.nextLine();
            profe.setCargo_Empleado(aux);
            System.out.print("Ingrese el sueldo: ");
            float aux2 = sc.nextFloat();
            profe.setSueldo_Empleado(aux2);
            System.out.print("Ingrese el codigo: ");
            String aux3 = sc.nextLine();
            profe.setCodigo_Empleado(aux3);
            System.out.print("Ingrese el cargo del empleado: ");
            aux3 = sc.nextLine();
            profe.setCargo_Empleado(aux3);
            System.out.println("Siguiente:----------------------");
        }

        //Setters para ingresar de administrativos
        System.out.println("------------------------------------------------");
        System.out.println("Vamos a llenar los datos de los Administrativos");
        System.out.println("------------------------------------------------");
        for (Sempleado admini : admin){
            System.out.print("Ingrese el nombre: ");
            String aux = sc.nextLine();
            admini.setNombre_Empleado(aux);
            System.out.print("Ingrese el apellido: ");
            aux = sc.nextLine();
            admini.setApellido_Empleado(aux);
            System.out.print("Ingrese la cedula: ");
            aux = sc.nextLine();
            admini.setCedula_Empleado(aux);
            System.out.print("Ingrese el cargo del empleado: ");
            aux = sc.nextLine();
            admini.setCargo_Empleado(aux);
            System.out.print("Ingrese el sueldo: ");
            float aux2 = sc.nextFloat();
            admini.setSueldo_Empleado(aux2);
            System.out.print("Ingrese el codigo: ");
            aux = sc.nextLine();
            admini.setCodigo_Empleado(aux);
        }
    }
}

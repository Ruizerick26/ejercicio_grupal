import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <docentes> profes = new ArrayList<docentes>();
        docentes empleado1 = new docentes("", "", "", "", 0, "", 0, 0, 0, 0);
        docentes empleado2 = new docentes("", "", "", "", 0, "", 0, 0, 0, 0);
        docentes empleado3 = new docentes("", "", "", "", 0, "", 0, 0, 0, 0);

        profes.add(empleado1);
        profes.add(empleado2);
        profes.add(empleado3);
        ArrayList <Sempleado> admin = new ArrayList<>();
        //Sempleado empleado4 = new Sempleado("", "", "", "", 0, "", "", "", 0);
        //Sempleado empleado5 = new Sempleado();
        //admin.add(empleado4);
        //admin.add(empleado5);

        System.out.println("Bienvenido, vamos a llenar los datos de los Docentes");
        System.out.println("------------------------------------------------");
        for (docentes profes : profes){
            System.out.print("Ingrese el nombre: ");
            String aux = sc.nextLine();
            profes.setNombre_Empleado(aux);
            System.out.print("Ingrese el apellido: ");
            aux = sc.nextLine();
            profes.setApellido_Empleado(aux);
            System.out.print("Ingrese la cedula: ");
            aux = sc.nextLine();
            profes.setCedula_Empleado(aux);
            System.out.print("Ingrese el cargo del empleado: ");
            aux = sc.nextLine();
            profes.setCargo_Empleado(aux);
            System.out.print("Ingrese el sueldo: ");
            float aux2 = sc.nextFloat();
            profes.setSueldo_Empleado(aux2);
            System.out.print("Ingrese el codigo: ");
            aux = sc.nextLine();
            profes.setCodigo_Empleado(aux);
            System.out.print("Ingrese el cargo del empleado: ");
            aux = sc.nextLine();
            profes.setCargo_Empleado(aux);
        }
        //System.out.println("------------------------------------------------");
        //System.out.println("Vamos a llenar los datos de los Administrativos");
        //System.out.println("------------------------------------------------");
        //for (Sempleado admin : admin){

        //}
    }
}

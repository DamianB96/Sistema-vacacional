/* Este programa da la cantidad de vacaciones correspondiestes
* a cada empleado usando 2 variables, su puesto de trabajo y una 
* clave que se la asigna de acuerdo a sus años de experiencia.
 */
package sistemavacacional;

import java.util.Scanner;

public class SistemaVacacional {

    public static void main(String[] args) {
        int clave, antiguedad;
        String nombre = "";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cual es el nombre del trabajador? ");
        nombre = entrada.nextLine();

        System.out.println("hace cuantos anios trabaja? ");
        antiguedad = entrada.nextInt();

        System.out.println("Cual es su clave de trabajador? ");
        clave = entrada.nextInt();

        if (clave == 1) {
            if (antiguedad == 1) {

                System.out.println(nombre + " Tiene derecho a 6 dias de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + " Tiene derecho a 14 dias de vacaciones");
            } else if (antiguedad >= 7) {
                System.out.println(nombre + " Tiene derecho a 20 dias de vacaciones");
            } else {
                System.out.println("El trabajador aun no tiene vacaciones");
            }

        } else if (clave == 2) {

            if (antiguedad == 1) {
                System.out.println(nombre + " Tiene derecho a 7 dias de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + " Tiene derecho a 15 dias de vacaciones");
            } else if (antiguedad >= 7) {
                System.out.println(nombre + " Tiene derecho a 22 dias de vacaciones");
            } else {
                System.out.println("El trabajador aun no tiene vacaciones");
            }
        } else if (clave == 3) {

            if (antiguedad == 1) {
                System.out.println(nombre + " Tiene derecho a 10 dias de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + " Tiene derecho a 20 dias de vacaciones");
            } else if (antiguedad >= 7) {
                System.out.println(nombre + " Tiene derecho a 30 dias de vacaciones");
            } else {
                System.out.println("El trabajador aun no tiene vacaciones");
            }
        } else {
            System.out.println("La clave es incorrecta, por favor, reintentelo");
        }

    }
}

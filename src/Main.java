/**
 * @Author: José Antonio Quintero Maya
 */

import java.util.Calendar;
import java.util.Date;
public class Main {
    public static void main(String[] args) {


        //Empleado p = new Empleado("Pepe Pérez", 31, new Date(90, Calendar.FEBRUARY, 1));
        //p.edad = -31; // Arreglado: error de compilación. edad no es accesible

        @@ -21,6 +21,8 @@ public static void main(String[] args) {
            System.out.println(p2);
         */

            System.out.println("Si quiero mostrar solo el nombre: " + p.nombre);
            System.out.println("Si quiero mostrar solo la edad no puedo: " + p.edad); // necesito un getter
        }
    }
/**
 * @Author: José Antonio Quintero Maya
 */

import java.time.LocalDate;
import java.util.Date;

class Empleado {
    private final String nombre;
    private int edad;

    private final LocalDate fechaContratacion;


    private Empleado(String nombre, int edad, LocalDate fechaContratacion) {
            this.nombre = nombre;
            this.edad = edad;
            this.fechaContratacion = fechaContratacion;
            @@ -24,7 +25,7 @@ public int getEdad() {
                return edad;
            }


                public LocalDate getFechaContratacion() {
                    return fechaContratacion;
                }

                @@ -37,7 +38,7 @@ public String toString() {
     * Método factoría que permite comprobar si la edad es válida antes de llamar al constructor.
                            * El constructor es ahora privado, impidiendo llamarlo directamente desde otra clase.
                            */

                        public static Empleado crearEmpleado(String nombre, int edad, LocalDate fechaContratacion) {
                            if (edad < 0) throw new RuntimeException("Un empleado no puede tener edad negativa");
                            else return new Empleado(nombre, edad, fechaContratacion);
                        }
                    }
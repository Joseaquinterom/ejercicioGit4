/**
 * @Author: José Antonio Quintero Maya
 */

import java.util.Date;

class Empleado {

    private final String nombre;
    private int edad;

    private final Date fechaContratacion;

    private Empleado(String nombre, int edad, Date fechaContratacion) {
        this.nombre = nombre;
        @@ -16,6 +16,18 @@ public void setEdad(int edad) {
        else this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public Date getFechaContratacion() {
            return fechaContratacion;
        }

        @Override
        public String toString() {
            return "Se ha registrado a " + nombre + " (" + edad + " años; contratado en 19" + fechaContratacion.getYear() + ")";
        }
        /**
         * Método factoría que permite comprobar si la edad es válida antes de llamar al constructor.
         * El constructor es ahora privado, impidiendo llamarlo directamente desde otra clase.
         */
        public static Empleado crearEmpleado(String nombre, int edad, Date fechaContratacion) {
            if (edad < 0) throw new RuntimeException("Un empleado no puede tener edad negativa");
            else return new Empleado(nombre, edad, fechaContratacion);
        }
    }
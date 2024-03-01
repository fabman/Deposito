/*
 * Clase principal de entrada a gestión de depositos
 */

package cc.fabian.cuentas;

/**
 * Entrada principal a la aplicacion
 *
 * @author Fabián Méndez
 * 
 */
public class Main {

    /**
     * 
     * Método de entrada principal de la aplicación
     *
     * @param args  No recibe ningún parametro
     */
    public static void main(String[] args) {
        
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(cuenta1);
    }

    /**
     * 
     * Gestiona la operativa de la cuenta
     *
     * @param cuenta1   Gestiona los ingresos y retiradas de dinero de la cuenta
     * @param cantidad  La cantidad de dinero con la que se quiere trabajar
     */
    public static void operativa_cuenta( CCuenta cuenta1, Float... cantidad ) {
        double saldoActual;
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}

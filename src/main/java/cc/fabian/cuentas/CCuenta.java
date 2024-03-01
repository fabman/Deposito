/*
 * Clase de gestión de cuentas
 */

package cc.fabian.cuentas;

/**
 * 
 * Clase de gestión de cuentas
 *
 * @author Fabián Méndez
 *
 */


public class CCuenta {


    private String nombre;

    /**
     *
     * Getter para el nombre asociado a la cuenta
     * 
     * @return Una cadena con el nombre asociado a la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * Setter para establecer el nombre asociado a la cuenta
     * 
     * @param nombre Una cadena con el nombre para la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * Getter para leer el valor de la id de la cuenta
     *
     * @return Una cadena con la id de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * 
     * Setter para establecer el id de la cuenta
     *
     * @param cuenta Una cadena con el id de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     *
     * Getter para leer el valor del saldo de la cuenta
     * 
     * @return Un double con el saldo actual de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * 
     * Setter para cambiar el saldo de la cuenta
     *
     * @param saldo Un double con el saldo a establecer en la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * Getter del tipo de interes actual de la cuenta
     * 
     * @return  un double con el valor del tipo de interes
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *
     * Setter del tipo de interes de la cuenta
     * 
     * @param tipoInterés  Un dobule con el valor actual del tipo de interes asociado a la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *
     * Clase que gestiona las cuentas
     * 
     */
    public CCuenta()
    {
    }

    /**
     * 
     * Constructor para crear la instacia de cuenta
     *
     * @param nom   Una cadena con el nombre asociado a la cuenta
     * @param cue   Una cadena con el nombre de la cuenta
     * @param sal   Un double con el saldo de la cuenta al abrirla
     * @param tipo  Un doble con el tipo de cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     *
     * Devuelve la cantidad de dinero que hay en la cuenta
     * 
     * @return Una doble con la cantidad de dinero en la cuenta
     */
    public double estado()
    {
        return saldo;
    }

    /**
     *
     * Ingresa la cantidad recibida en la cuenta y actualiza el saldo
     * 
     * @param cantidad    Un double con el dinero a ingresar
     * @throws Exception  Error en caso de no poder ingresar 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * 
     * Retira dinero de la cuenta y actualiza el saldo
     *
     * @param cantidad   Un double con la cantidad a retirar de la cuenta
     * @throws Exception  Error en caso de no tener saldo o meter un número negativo a retirar
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}

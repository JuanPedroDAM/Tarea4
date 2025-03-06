package Cuentas;
/**
 * Esta clase representa una cuenta bancaria con métodos para ingresar y retirar dinero.
 * Permite consultar el saldo y gestionar las operaciones básicas de una cuenta.
 * @author juan_
 * @version 1.1
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *  Constructor por defecto. Crea una instancia vacía de CCuenta.
     */
    public CCuenta()
    {
    }
    /**
     * Constructor con parámetros.
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de la cuenta bancaria.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés aplicado a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Consulta el saldo actual de la cuenta.
     * @return El saldo actual.
     */
    public double estado()
    {
        return saldo;
    }
    /**
     * Ingresa una cantidad en la cuenta.
     * @param cantidad Cantidad a ingresar (debe ser positiva).
     * @throws Exception Si la cantidad es negativa. 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * @param cantidad Cantidad a retirar (debe ser positiva y no superar el saldo).
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo.
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

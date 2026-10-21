package Momento1y2;

public class Transferencia extends Pago {
    private String banco;
    private String numeroCuenta;

    public Transferencia(String formapago, String banco, String numeroCuenta) {
        super("formaPago");
        this.banco = banco;
        this.numeroCuenta = numeroCuenta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    @Override 
    public String toString() {
        return "Pago por Transferencia: Banco: " + banco + ", Número de Cuenta: " + numeroCuenta;
    }
    
}
